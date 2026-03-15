package session6.All;

public class Main {
    static void main(String[] args) throws  InterruptedException{
        TicketPool roomA = new TicketPool("A",10);
        TicketPool roomB = new TicketPool("B",10);


        BookingCounter counter1 =
                new BookingCounter("Quay 1",roomA,roomB);

        BookingCounter counter2 =
                new BookingCounter("Quay 2",roomA,roomB);


        TicketSupplier supplier =
                new TicketSupplier(roomA,roomB,3,3000,3);

        Thread t1 = new Thread(counter1);
        Thread t2 = new Thread(counter2);
        Thread t3 = new Thread(supplier);


        t1.setName("Quay 1");
        t2.setName("Quay 2");
        t3.setName("Supplier");


        t1.start();
        t2.start();
        t3.start();

        t3.join();


        Thread.sleep(2000);

        System.out.println("Ket thuc chuong trinh");
        System.out.println("Quay 1 ban duoc: " + counter1.soldCount);
        System.out.println("Quay 2 ban duoc: " + counter2.soldCount);

        System.out.println("Ve con lai phong A: " + roomA.remainingTickets());
        System.out.println("Ve con lai phong B: " + roomB.remainingTickets());
    }
}
