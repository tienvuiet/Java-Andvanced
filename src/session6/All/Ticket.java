package session6.All;

public class Ticket {
    private String ticketId;
    private String roomName;
    private boolean isSold;  // trang thai da dat

    public Ticket() {
    }

    public Ticket(String roomName, String ticketId, boolean isSold) {
        this.roomName = roomName;
        this.ticketId = ticketId;
        this.isSold = isSold;
    }

    public String getTicketId() {
        return ticketId;
    }

    public void setTicketId(String ticketId) {
        this.ticketId = ticketId;
    }

    public String getRoomName() {
        return roomName;
    }

    public void setRoomName(String roomName) {
        this.roomName = roomName;
    }

    public boolean isSold() {
        return isSold;
    }

    public void setSold(boolean sold) {
        isSold = sold;
    }

    @Override
    public String toString() {
        return "Ticket{" +
                "ticketId='" + ticketId + '\'' +
                ", roomName='" + roomName + '\'' +
                ", isSold=" + isSold +
                '}';
    }
}
