package session6.BaiTap;

import java.util.Random;

public class HienThiTenNgauNhien extends Thread {
    private String[] names = {"an", "Adsads", "Khahc", "asdfa"};

    @Override
    public void run() {
        Random random = new Random();
        while (true){
            int ranDom = random.nextInt(names.length);
            System.out.println(names[ranDom]);

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
