package session6.XuatSac1;

import java.util.ArrayList;
import java.util.List;

public class TicketPool {

    String roomName;
    List<Ticket> tickets = new ArrayList<>();

    public synchronized Ticket holdTicket(boolean vip,String counterName){

        for(Ticket t : tickets){

            if(t.isAvailable()){

                t.isHeld = true;
                t.isVIP = vip;

                t.holdExpiryTime =
                        System.currentTimeMillis()+5000;

                System.out.println(counterName+
                        ": Da giu ve "+t.ticketId+
                        (vip?" (VIP)":"")+
                        ". Thanh toan trong 5s");

                return t;
            }
        }

        return null;
    }
    public synchronized boolean sellHeldTicket(Ticket ticket,String counterName){

        if(ticket!=null && ticket.isHeld && !ticket.isSold){

            ticket.isHeld = false;
            ticket.isSold = true;

            System.out.println(counterName+
                    ": Thanh toan thanh cong "+
                    ticket.ticketId);

            return true;
        }

        return false;
    }
    public synchronized void releaseExpiredTickets(){

        long now = System.currentTimeMillis();

        for(Ticket t : tickets){

            if(t.isHeld && !t.isSold &&
                    t.holdExpiryTime < now){

                t.isHeld = false;

                System.out.println(
                        "TimeoutManager: Ve "+
                                t.ticketId+
                                " het han giu, da tra lai");
            }
        }
    }
    public TicketPool(String roomName,int capacity) {

        this.roomName = roomName;

        for (int i = 1; i <= capacity; i++) {

            String id = roomName + "-" + String.format("%03d", i);

            tickets.add(new Ticket(roomName, id));
        }
    }
}
