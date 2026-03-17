package session8.Kha1;

public class HardwareConnection {
     private static HardwareConnection instance;
     private HardwareConnection(){
         System.out.println("HardwareConnection: da ket noi phan cung");
     }
     public static HardwareConnection getInstance(){
         if (instance == null){
             instance = new HardwareConnection();
         }
         return  instance;
     }
     public void connect(){
         System.out.println("Dang su dung ket noi phan cung..");
     }
     public void disconnect(){
         System.out.println("Da ngat ket noi phan cung..");
     }
}
