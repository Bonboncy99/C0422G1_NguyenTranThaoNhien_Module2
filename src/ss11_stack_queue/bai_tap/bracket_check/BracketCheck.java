package ss11_stack_queue.bai_tap.bracket_check;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class BracketCheck {
    public static boolean checkBracket(String str) {
        Stack<Character> bStack = new Stack<>();
        char[] arr = new char[str.length()];

        for (int i = 0; i < str.length(); i++) {
            arr[i] = str.charAt(i);
        }
        System.out.println(Arrays.toString(arr));
        String left = "";

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == '(') {
                bStack.push(arr[i]);
            } else if (arr[i] == ')') {
                if (bStack.isEmpty()) {
                    return false;
                } else {
                    left = String.valueOf(bStack.pop());
                }
                if (left.equals(")")) {
                    return false;
                }
            }
        }
        if (bStack.isEmpty()) {
            return true;
        } else {
            return false;
        }
    }
}





