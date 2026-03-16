package session7.XuatSac1;

public class SMSNotification implements NotificationService{
    @Override
    public void send(String message) {
        System.out.println("Da gui SMS");
    }
}
