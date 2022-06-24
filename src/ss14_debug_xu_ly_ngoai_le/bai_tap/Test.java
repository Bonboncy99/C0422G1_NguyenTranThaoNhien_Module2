package ss14_debug_xu_ly_ngoai_le.bai_tap;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean flag = true;
        Triangle triangle = null;
        do {
            try {
                System.out.println("Nhập cạnh thứ nhất");
                double a = Double.parseDouble(scanner.nextLine());
                System.out.println("Nhập cạnh thứ 2");
                double c = Double.parseDouble(scanner.nextLine());
                System.out.println("Nhập cạnh thứ 3");
                double b = Double.parseDouble(scanner.nextLine());
                triangle = new Triangle(a, b, c);
                System.out.println("3 Cạnh cuẢ tam giác");
                flag = false;
            } catch (TriangleExcepction e) {
                System.err.println(e.getMessage());
                System.out.println("Nhập lại Các cạnh của tam giác");
                flag = true;
            } catch (NumberFormatException e) {
                System.err.println("Lỗi Nhập chữ");
                System.out.println("Nhập lại Các cạnh của tam giác");
                flag = true;
            }
        } while (flag);
        System.out.println(triangle);
    }
}
