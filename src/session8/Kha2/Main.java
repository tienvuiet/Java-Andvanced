package session8.Kha2;

import java.util.Scanner;

public class Main {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        OldThermometer oldThermometer = new OldThermometer();

        TemperatureSensor sensor = new ThermometerAdapter(oldThermometer);

        Light light = new Light();
        Fan fan = new Fan();
        AirConditioner ac = new AirConditioner();

        SmartHomeFacade home = new SmartHomeFacade(light, fan, ac, sensor);

        while (true) {

            System.out.println("\n===== SMART HOME =====");
            System.out.println("1. Xem nhiệt độ");
            System.out.println("2. Chế độ rời nhà");
            System.out.println("3. Chế độ ngủ");
            System.out.println("4. Thoát");

            int choice = sc.nextInt();

            switch (choice) {

                case 1:
                    home.getCurrentTemperature();
                    break;

                case 2:
                    home.leaveHome();
                    break;

                case 3:
                    home.sleepMode();
                    break;

                case 4:
                    System.out.println("Thoát chương trình");
                    return;
            }
        }
    }
}
