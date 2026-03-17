package session8.Kha1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    static List<Device> devices = new ArrayList<>();
    static void main(String[] args) {
       while (true){
           System.out.println("Menu");
           System.out.println("1. Ket noi phan cung");
           System.out.println("2. Tao thiet bi moi");
           System.out.println("3. Bat thiet bi");
           System.out.println("5. Kiem tra Singleton");
           System.out.println("6. Thoat");
           System.out.println("Lua chon cua ban: ");
           int choice = sc.nextInt();
           switch (choice){
               case 1:
                   HardwareConnection.getInstance();
                   break;
               case 2:
                   createDevice();
                   break;
               case 3:
                   turnOnDevice();
                   break;
               case 5:
                   break;
               case 6:
                   System.out.println("Da thoat chuong trinh");
                   break;
               default:
                   System.out.println("Lua chon khong hop le");
           }
       }
    }
    public static void createDevice(){
        System.out.println("Chon loai thiet bi: ");
        System.out.println("1. Den");
        System.out.println("2. Quat");
        System.out.println("3. Dieu hoa");
        int type = sc.nextInt();
        DeviceFactory factory = null;
        switch (type){
            case 1 :
                factory = new LightFactory();
                break;
            case 2:
                factory = new FanFactory();
                break;
            case 3:
                factory = new AirConditionerFactory();
                break;
        }
        if (factory != null){
            Device device = factory.createDevice();
            devices.add(device);
        }
    }
    static void turnOnDevice(){
        if (devices.isEmpty()){
            System.out.println("Chua co thiet bi");
            return;
        }
        for (int i = 0; i< devices.size(); i++){
            System.out.println((i+1)+ ". device");
        }
        int index = sc.nextInt()-1;
        devices.get(index).turnOn();
    }
}
