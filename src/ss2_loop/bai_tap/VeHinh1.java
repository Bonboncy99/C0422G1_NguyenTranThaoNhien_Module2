package ss2_loop.bai_tap;

import java.util.Scanner;

public class VeHinh1 {
    public static void main(String[] args) {
        int choice = -1;
        Scanner scanner = new Scanner(System.in);


        while (choice != 0) {
            System.out.println("Menu");
            System.out.println("1. Draw the rectangle");
            System.out.println("3. Draw the  square triangle (Left Bottom)");
            System.out.println("2. Draw the  square triangle (Left Top)");
            System.out.println("4. Draw the  square triangle (Right Top)");
            System.out.println("5. Draw the  square triangle (Right Bottom)");
            System.out.println("6. Draw the  isosceles triangle");
            System.out.println("0. Exit");
            System.out.println("Enter your choice");
            choice = Integer.parseInt(scanner.nextLine());

            switch (choice) {
                case 1:
                    System.out.println("Draw the rectangle");
                    System.out.println("Nhập chiều dài hình chữ nhật");
                    int a = Integer.parseInt(scanner.nextLine());
                    System.out.println("Nhập chiều rộng hình chữ nhật");
                    int b = Integer.parseInt(scanner.nextLine());

                    for (int i = 0; i < b; i++) {
                        for (int j = 0; j < a; j++) {
                            System.out.print('*');
                        }
                        System.out.println();
                    }
                    break;
                case 2:
                    System.out.println("Draw the  square triangle (Left Bottom)");
                    int h1;
                    System.out.println("Nhập chiều cao hình tam giác");
                    h1 = Integer.parseInt(scanner.nextLine());
                    for (int i = 0; i < h1; i++) {
                        for (int j = 0; j <= i; j++) {
                            System.out.print('*');
                        }
                        System.out.println();
                    }
                    break;
                case 3:
                    System.out.println("Draw the  square triangle (Left Bottom)");
                    int h2;
                    System.out.println("Nhập chiều cao hình tam giác");
                    h2 = Integer.parseInt(scanner.nextLine());
                    for (int i = h2; i >= 1; i--) {
                        for (int j = 0; j < i; j++) {
                            System.out.print('*');
                        }
                        System.out.println();
                    }
                    break;
                case 4:
                    System.out.println("Draw the  square triangle (right Bottom)");
                    System.out.println("Nhập chiều cao hình tam giác");
                    int h3 = Integer.parseInt(scanner.nextLine());

                    for (int i = 1; i <= h3; i++) {
                        for (int j = 1; j <=h3; j++) {
                            if (j >=1 && j<= h3-i){
                                System.out.print(" ");
                            } else {
                                System.out.print("*");
                            }
                        }
                        System.out.println();
                    }
                    break;

                case 5:
                    System.out.println("Draw the  square triangle (right top)");
                    System.out.println("Nhập chiều cao hình tam giác");
                    int h4 = Integer.parseInt(scanner.nextLine());

                    for (int i = h4; i >= 1; i--) {
                        for (int j = 1; j <=h4; j++) {
                            if (j >=1 && j<= h4-i){
                                System.out.print(" ");
                            } else {
                                System.out.print("*");
                            }
                        }
                        System.out.println();
                    }
                    break;

                case 6:
                    int height;
                    System.out.println("Nhập chiều cao hình tam giác");
                    height = Integer.parseInt(scanner.nextLine());

                    System.out.println("Hình tam giác cân: ");
                    for (int i = 0; i < height; i++) {
                        for (int j = height - i; j >= 1; j--) {
                            System.out.print(" ");
                        }
                        for (int j = 0; j < 2 * i + 1; j++) {
                            System.out.print('*');
                        }
                        System.out.println();
                    }
                    break;
                case 0:
                    System.exit(0);
                default:
                    System.out.println("No choice!");
            }
        }
    }
}
