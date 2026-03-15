package session6.All;

import java.util.Random;

public class BookingCounter implements  Runnable{
    String counterName;
    TicketPool roomA;
    TicketPool roomB;
    int soldCount;

    Random random = new Random();
    public BookingCounter(String counterName, TicketPool roomA, TicketPool roomB) {
        this.counterName = counterName;
        this.roomA = roomA;
        this.roomB = roomB;
    }

    @Override
    public void run() {
        while (true){
            Ticket ticket = null;
            if (random.nextBoolean()){
                 ticket =  roomA.sellTicket();
            }else{
                ticket = roomB.sellTicket();
            }
            if(ticket != null){
                soldCount++;
                System.out.println(ticket.getRoomName() +" Da ban ve: "+ ticket.getTicketId());
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
