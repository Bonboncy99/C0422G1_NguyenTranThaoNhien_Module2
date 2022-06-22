package ss13_search_algorithm;

import java.util.LinkedList;
import java.util.Scanner;

public class LongestStringSearch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập chuỗi");
        String str = scanner.nextLine();
        LinkedList <Character> list = new LinkedList<>();
        LinkedList <Character> max = new LinkedList<>();

        for (int i = 0; i < str.length(); i++) {
            list.add(str.charAt(i));
            for (int j = i+1; j <str.length() ; j++) {
                if (str.charAt(j)>list.getLast()){
                    list.add(str.charAt(j));
                }
            }
            if (list.size()>max.size()){
                max.clear();
                max.addAll(list);
            }
            list.clear();
        }

        for (Character c: max){
            System.out.print(c);
        }
    }
}

