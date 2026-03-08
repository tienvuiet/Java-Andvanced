package session1.Kha1;

import java.util.Scanner;

public class Main {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Nhap nam sinh cua ban: ");
            String input = sc.nextLine();
            int namSinh = Integer.parseInt(input);
            int namHienTai = 2026;
            int tuoi = namHienTai- namSinh;
            System.out.println("Tuoi cua ban: "+ tuoi);
        } catch (NumberFormatException e) {
            System.out.println("Loi vui long nhap nam sinh bang so");
        }finally {
            System.out.println("Thuc hien don dep tai nguyen trong finally");
        }
    }
}
