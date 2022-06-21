package ss11_stack_queue.bai_tap.bracket_check;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Stack;

public class bracket {
    public static boolean checkBracket(String str){
        char [] arr = new char[str.length()];
        for (int i = 0; i < str.length(); i++) {
            arr[i] = str.charAt(i);
        }
        System.out.println(Arrays.toString(arr));
        Stack <Character> bStack = new Stack<>();

        String left;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == '(') {
                bStack.push(arr[i]);
            } else if (arr[i] == ')'){
                if (bStack.isEmpty()){
                    return false;
                } else {
                    left = String.valueOf(bStack.pop());
                }
                if (left.equals(')')){
                    return false;
                }
            }
        }
        if (bStack.isEmpty()){
            return true;
        } else {
            return false;
        }
    }
}
