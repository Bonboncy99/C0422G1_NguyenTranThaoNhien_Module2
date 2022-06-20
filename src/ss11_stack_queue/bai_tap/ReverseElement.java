package ss11_stack_queue.bai_tap;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class ReverseElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số lượng phần tử");
        int size = Integer.parseInt(scanner.nextLine());
        int[]arr = new int[size];
        Stack <Integer> stack = new Stack<>();
        for (int i = 0; i < size; i++) {
            System.out.println("Nhập phần tử của stack");
            stack.push(Integer.parseInt(scanner.nextLine()));
        }
        for (int i = 0; i < size; i++) {
            arr[i]=stack.pop();
        }
        System.out.println(Arrays.toString(arr));
    }
}
