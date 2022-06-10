package ss4_OOP.thuc_hanh;

import java.util.Scanner;

public class RunRectangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap chieu dai");
        double height = Double.parseDouble(scanner.nextLine());
        System.out.println("Nhap chieu rong");
        double width = Double.parseDouble(scanner.nextLine());
        Rectangle rectangle1 = new Rectangle(width,height);
        System.out.println(rectangle1.Display());

        System.out.println("Dien tich hinh chu nhat la " +rectangle1.getArea());
        System.out.println("Chu vi hinh chu nhat la " +rectangle1.getPerimeter());
    }
}
