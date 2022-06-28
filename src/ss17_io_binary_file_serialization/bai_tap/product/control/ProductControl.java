package ss17_io_binary_file_serialization.bai_tap.product.control;

import ss17_io_binary_file_serialization.bai_tap.product.servivce.ProductService;

import java.util.Scanner;

public class ProductControl {
    public static void displayMenu() {
        Scanner scanner = new Scanner(System.in);
        String num;
        do {
            System.out.println("Chọn chức năng" +
                            "\n 1.Thêm" +
                            "\n 2.Hiển thị" +
                            "\n 3.Tìm theo Tên sản phẩm" +
                            "\n 4.Tìm theo mã sản phẩm"+
                    "\n 7.Exit ");
            num = scanner.nextLine();
            switch (num) {
                case "1":
                    System.out.println("Chức năng thêm");
                    ProductService.add();
                    break;
                case "2":
                    System.out.println("Chức năng Hiển Thị");
                    ProductService.display();
                    break;
                case "3":
                    System.out.println("Chức năng tìm theo tên sản phẩm");
                    ProductService.searchByname();
                    break;
                case "4":
                    System.out.println("Chức năng tìm theo mã sản phẩm");
                    ProductService.searchByCode();
                    break;
                case "7": System.exit(7);
                default:
                    System.out.println("Nhập lại");

            }
        } while (true);
    }
}
