package session6.XuatSac1;

public class Main {
    static void main(String[] args) {
        TicketPool roomA =
                new TicketPool("A",5);
        TicketPool roomB =
                new TicketPool("B",7);
        TicketPool roomC =
                new TicketPool("C",6);
        Thread t1 = new Thread(
                new BookingCounter("Quay1",
                        roomA,roomB,roomC));
        Thread t2 = new Thread(
                new BookingCounter("Quay2",
                        roomA,roomB,roomC));
        Thread t3 = new Thread(
                new BookingCounter("Quay3",
                        roomA,roomB,roomC));
        Thread t4 = new Thread(
                new BookingCounter("Quay4",
                        roomA,roomB,roomC));
        Thread t5 = new Thread(
                new BookingCounter("Quay5",
                        roomA,roomB,roomC));
        Thread timeout =
                new Thread(
                        new TimeoutManager(
                                roomA,roomB,roomC));
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();

        timeout.start();
    }
}
