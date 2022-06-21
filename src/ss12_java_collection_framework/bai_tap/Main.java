package ss12_java_collection_framework.bai_tap;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ProductManager productManager = new ProductManager();
        int choice;
        do {
            System.out.println("1. Chức năng hiển thị");
            System.out.println("2. Chức năng thêm");
            System.out.println("3. Chức năng sửa theo id");
            System.out.println("4. Chức năng xóa theo id");
            System.out.println("5. Chức năng tìm theo tên");
            System.out.println("6. Chức năng sắp xếp giá giảm dần");
            System.out.println("Chọn chức năng");

            choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    System.out.println("1. Chức năng hiển thị");
                    productManager.display();
                    break;
                case 2:
                    System.out.println("2. Chức năng thêm");
                    productManager.add();
                    break;
                case 3:
                    System.out.println("3. Chức năng sửa theo id");
                    productManager.update();
                    break;
                case 4:
                    System.out.println("4. Chức năng xóa theo id");
                    productManager.delete();
                    break;
                case 5:
                    System.out.println("5. Chức năng tìm theo tên");
                    productManager.seachByName();
                    break;
                case 6:
                    System.out.println("6. Chức năng sắp xếp giá giảm dần");
                    productManager.sortIncrease();
                    break;
                case 7:
                    System.exit(7);
                default:
                    System.out.println("Nhập sai, chọn lại");
            }
        } while (choice != 7);

    }
}
