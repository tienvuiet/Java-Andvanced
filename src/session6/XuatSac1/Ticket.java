package session6.XuatSac1;

public class Ticket {
    String ticketId;
    String roomName;

    boolean isSold;
    boolean isHeld;
    boolean isVIP;

    long holdExpiryTime;

    public Ticket(String roomName,String ticketId){

        this.roomName = roomName;
        this.ticketId = ticketId;
    }

    public boolean isAvailable(){
        return !isSold && !isHeld;
    }
}
