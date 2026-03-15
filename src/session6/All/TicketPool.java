package session6.All;

import java.util.ArrayList;
import java.util.List;

public class TicketPool {
    String roomName;
    List<Ticket> tickets = new ArrayList<>();// danh sach ve
    int capacity;//suc chua ban dau
    private int nextId = 1;

    public TicketPool(String roomName, int capacity) {
        this.roomName = roomName;
        this.capacity = capacity;
        if(tickets.size() > capacity){
            System.out.println("Phong "+ roomName + "da dat toi da ve");
            return;
        }
        for(int i = 1; i <= capacity; i++){

            String id = roomName + "-" + String.format("%03d", i);

            tickets.add(new Ticket(roomName, id, false));
        }
    }
    public TicketPool() {
    }
    public synchronized void addTicket(int count){
        if(tickets.size() > capacity){
            System.out.println("Phong "+ roomName + "da dat toi da ve");
            return;
        };
        for(int i = 1; i <= capacity; i++){
            String id = roomName + "-" + String.format("%03d", i);
            tickets.add(new session6.All.Ticket(roomName, id, false));
        }
        System.out.println("Nha cung cap: Da them " + count + " ve vao phong " + roomName);
        notifyAll();
    }
    public synchronized Ticket sellTicket(){
        if(remainingTickets() ==0){

            try {
                System.out.println(Thread.currentThread().getName() +": He ve phong "+roomName+", dang cho...");
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
         for(Ticket t: tickets){
             if(!t.isSold()){
                 t.setSold(true);
                 return t;
             }
         }
        return null;
    }
    // dem ve con lai
    public int remainingTickets(){
        int count = 0;
        for(Ticket t: tickets){
            if (!t.isSold()){
                count ++;
            }
        }
        return count ;
    }

}
