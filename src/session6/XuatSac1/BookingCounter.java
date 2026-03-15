package session6.XuatSac1;

import java.util.Random;

public class BookingCounter implements Runnable{
    String counterName;
    TicketPool roomA;
    TicketPool roomB;
    TicketPool roomC;
    Random random = new Random();
    public BookingCounter(String name,
                          TicketPool a,
                          TicketPool b,
                          TicketPool c){

        counterName = name;
        roomA = a;
        roomB = b;
        roomC = c;
    }
    @Override
    public void run(){

        TicketPool[] pools =
                {roomA,roomB,roomC};
        while(true){
            TicketPool pool =
                    pools[random.nextInt(3)];
            boolean vip =
                    random.nextBoolean();
            Ticket ticket =
                    pool.holdTicket(vip,counterName);
            if(ticket!=null){
                try{
                    Thread.sleep(3000);
                }
                catch(Exception e){}
                pool.sellHeldTicket(ticket,counterName);
            }
            try{
                Thread.sleep(1000);
            }
            catch(Exception e){}
        }
    }
}
