package ss3_array.bai_tap;

import java.util.Scanner;

public class FindChar {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Nhap chuoi");
        String str = scanner.nextLine();

        System.out.println("Nhap ki tu can tim");
        char x = scanner.nextLine().charAt(0);

        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i)==x) {
                count++;
            }
        }
        System.out.println("ky tu " + x + " lap lai " + count );
    }
}
