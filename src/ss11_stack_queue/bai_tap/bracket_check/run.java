package ss11_stack_queue.bai_tap.bracket_check;

import java.util.Scanner;

public class run {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhapaj bieu thuc");
        String bt = scanner.nextLine();

        System.out.println(bracket.checkBracket(bt));
    }
}
