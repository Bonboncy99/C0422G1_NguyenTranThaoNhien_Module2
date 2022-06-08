package ss2_loop.thuc_hanh;

import java.util.Scanner;

public class InterestCalculator {
    public static void main(String[] args) {
        double money = 1.0;
        int month = 1;
        double interestRate = 1.0;
        double totalInterest = 0;
        Scanner input = new Scanner(System.in);

        System.out.println("Nhập Tiền gửi: ");
        money = Double.parseDouble(input.nextLine());

        System.out.println("Nhập tháng gửi: ");
        month = Integer.parseInt(input.nextLine());

        System.out.println("Nhập lãi suất: ");
        interestRate = Double.parseDouble(input.nextLine());

        for (int i = 0; i < month; i++) {
            totalInterest += money * (interestRate/100)/12 * month;
        }
        System.out.println("Tổng tiền lãi là: " + totalInterest);
    }
}
