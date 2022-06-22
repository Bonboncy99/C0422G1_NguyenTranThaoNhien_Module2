package ss13_search_algorithm;

import java.util.LinkedList;
import java.util.Scanner;

public class LongestconsecutiveStringSearch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập chuỗi");
        String str = scanner.nextLine();
        LinkedList <Character> list = new LinkedList<>();
        LinkedList <Character> max = new LinkedList<>();
        for (int i = 0; i < str.length(); i++) {
            if (list.size()>1 && list.getLast()>str.charAt(i)){
                list.clear();
            }
            list.add(str.charAt(i));
            if (list.size()> max.size()){

                max.clear();
                max.addAll(list);
            }
        }

        for (Character c: max){
            System.out.print(c);
        }

    }
}
