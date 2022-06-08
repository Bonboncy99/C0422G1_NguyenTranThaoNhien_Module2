package ss2_loop.thuc_hanh;

import java.util.Scanner;

public class GreateCommonFactor {
    public static void main(String[] args) {
        int a;
        int b;
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhập số thứ nhất");
        a = Math.abs(Integer.parseInt(sc.nextLine()));

        System.out.println("Nhập số thứ hai");
        b = Math.abs(Integer.parseInt(sc.nextLine()));

        if (a == 0 && b == 0) {
            System.out.println("Không có ước chung lớn nhất.");
        } else if (a==0 || b==0 ) {
            System.out.println(Math.max(a,b));
        } else {
            while (a != b) {
                if (a > b) {
                    a = a - b;
                } else {
                    b = b - a;
                }
            }
            System.out.println("Ước chung lớn nhất là " + a);
        }
    }
}
