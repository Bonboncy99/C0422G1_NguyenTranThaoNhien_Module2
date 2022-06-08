package ss2_loop.bai_tap;

import java.util.Scanner;

public class InSoNguyenToTheoSoLuong {
    public static void main(String[] args) {
        Scanner bon = new Scanner(System.in);
        int number;
        int count = 0;
        int n = 2;

        System.out.println("Số lượng số nguyên tố cần in: ");
        number = Integer.parseInt(bon.nextLine());



        while (count < number){
            boolean flag = true;
            for (int i = 2; i < n; i++) {
                if (n % i == 0) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                System.out.println(n);
                count++;
            }
            n++;
        }



    }
}
