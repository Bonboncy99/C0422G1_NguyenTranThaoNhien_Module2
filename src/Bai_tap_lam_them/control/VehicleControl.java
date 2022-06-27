package Bai_tap_lam_them;

import java.util.Scanner;

public class Run {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        QuanLyPhuongTien quanLyPhuongTien = new QuanLyPhuongTien();


        int choice;
        do {
            System.out.println("CHƯƠNG TRÌNH QUẢN LÝ PHƯƠNG TIỆN GIAO THÔNG");
            System.out.println("Chọn chức năng");
            System.out.println("1. Hiển thị phương tiện");
            System.out.println("2. Thêm mới phương tiện");
            System.out.println("3. Xóa phương tiện");
            System.out.println("4. Tìm kiếm theo biển kiểm soát");
            System.out.println("5. Thoát");

            choice = Integer.parseInt(scanner.nextLine());

            switch (choice) {
                case 1:
                    System.out.println("1. Hiển thị phương tiện");
                    quanLyPhuongTien.display();
                    break;
                case 2:
                    System.out.println("2. Thêm mới phương tiện");
                    quanLyPhuongTien.add();
                    quanLyPhuongTien.display();
                    break;
                case 3:
                    System.out.println("3. Xóa phương tiện");
                    System.out.println("Nhập xe muốn xóa(STT)");
                    int index = Integer.parseInt(scanner.nextLine());
                    quanLyPhuongTien.remove((index - 1));
                    quanLyPhuongTien.display();
                    break;
                case 4:
                    System.out.println("4. Tìm kiếm theo biển kiểm soát");
                    System.out.println("Nhập biểm kiểm soát cần tìm");
                    String bienKiemSoat = scanner.nextLine();
                    quanLyPhuongTien.searchBienKiemSoat(bienKiemSoat);
                    break;
                case 5:
                    System.exit(5);
                default:
                    System.out.println("Nhập sai, chọn lại");
            }
        } while (choice != 5);
    }

}
