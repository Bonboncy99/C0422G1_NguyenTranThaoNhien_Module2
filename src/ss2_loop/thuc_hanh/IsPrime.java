package ss2_loop.thuc_hanh;

import java.util.Scanner;

public class IsPrime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        int number = Integer.parseInt(scanner.nextLine());
        Boolean check = true;
        if (number < 2) {
            check = false;
        } else {
            for (int i = 2; i < number ; i++) {
                if (number % i ==0) {
                    check = false;
                    break;
                }
            }
        }
        if (check){
            System.out.println(number + " Là số nguyên tố");
        } else {
            System.out.println(number + " Không là số nguyên tố");
        }
    }
}
