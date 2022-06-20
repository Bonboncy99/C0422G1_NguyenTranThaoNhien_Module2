package ss11_stack_queue.bai_tap.bracket_check;

import ss11_stack_queue.bai_tap.bracket_check.BracketCheck;

import java.util.Scanner;

public class BracketCheckTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập biểu thức cần kiểm tra");
        String str = scanner.nextLine();
        System.out.println(BracketCheck.checkBracket(str));
    }

}
