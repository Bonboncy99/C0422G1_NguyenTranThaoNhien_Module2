package ss11_stack_queue.bai_tap;

import java.util.Scanner;
import java.util.Stack;

public class DigitalConvert {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Stack<Integer> stack = new Stack<>();
        System.out.println("Nhập số cần chuyển đổi");
        int number = Integer.parseInt(scanner.nextLine());
        int x;
        do {
            x = number % 2;
            stack.push(x);
            number = number / 2;
        } while (number > 0);

        String result="";
        while (!stack.isEmpty()){
            result += stack.pop();
        }
        System.out.println(result);
    }
}
