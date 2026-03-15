package session6.All;



public class TicketSupplier implements  Runnable{
    TicketPool roomA;
    TicketPool roomB;
    int supplyCount;
    int interval;
    int rounds;

    public TicketSupplier(TicketPool roomA, TicketPool roomB, int supplyCount, int interval, int rounds) {
        this.roomA = roomA;
        this.roomB = roomB;
        this.supplyCount = supplyCount;
        this.interval = interval;
        this.rounds = rounds;
    }

    @Override
    public void run() {
        for (int i = 0 ; i< rounds; i++){
            try {
                Thread.sleep(interval);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            roomA.addTicket(supplyCount);
            roomB.addTicket(supplyCount);
        }
        System.out.println("Nha cung cap ket thuc");
    }
}
