package ss2_loop.bai_tap;

import java.util.Scanner;

public class InSoNguyenToTrongGioiHan {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập giới hạn");
        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 2; i < n; i++) {
            boolean flag = true;
            for (int j = 2; j < i ; j++) {
                if (i % j == 0) {
                    flag = false;
                }
            }
            if (flag) {
                System.out.println(i);
            }
        }
    }
}
