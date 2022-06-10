package ss4_OOP.bai_tap.QuadraticEquation;

import ss4_OOP.bai_tap.QuadraticEquation.QuadraticEquation;

import java.util.Scanner;

public class RunQuadraticEquation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap a");
        double a = Double.parseDouble(scanner.nextLine());
        System.out.println("Nhap b");
        double b = Double.parseDouble(scanner.nextLine());
        System.out.println("Nhap c");
        double c = Double.parseDouble(scanner.nextLine());

        QuadraticEquation quadraticEquation1 = new QuadraticEquation(a, b, c);
        quadraticEquation1.displayRoot();
    }
}
