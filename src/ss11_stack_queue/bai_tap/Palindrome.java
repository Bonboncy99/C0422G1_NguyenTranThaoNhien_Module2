package ss11_stack_queue.bai_tap;

import com.sun.jmx.remote.internal.ArrayQueue;
import ss11_stack_queue.thuc_hanh.trienkhai_queue_sudung_linkedlist.LinkedListQueueClient;

import java.util.*;

public class Palindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập chuỗi cần kiểm tra");
        String str = scanner.nextLine();
        str = str.toLowerCase();
        
        
        
        
//        Queue<Character> queue = new LinkedList<>();
//        Stack <Character> stack = new Stack<>();
//        for (int i = 0; i < str.length(); i++) {
//            stack.push(str.charAt(i));
//            queue.add((str.charAt(i)));
//        }
//
//        boolean flag = true;
//        for (int i = 0; i < str.length(); i++) {
//            if (stack.pop()!=queue.remove()){
//                flag =false;
//                break;
//            }
//        }
//        if (flag){
//            System.out.println("True");
//        } else {
//            System.out.println("False");
//        }

        
        
        ArrayDeque<Character>arrayQueue = new ArrayDeque<>();
        for (int i = str.length()-1; i >=0; i--) {
            arrayQueue.add(str.charAt(i));
        }
        String str2 = "";
        while (!arrayQueue.isEmpty()){
            str2 += arrayQueue.pop();
        }
        System.out.println(str);
        System.out.println(str2);
        if (str.equals(str2)){
            System.out.println("True");
        } else {
            System.out.println("false");
        }
        
    }
}
