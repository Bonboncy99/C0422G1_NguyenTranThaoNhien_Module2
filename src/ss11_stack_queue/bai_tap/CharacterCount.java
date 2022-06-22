package ss11_stack_queue.bai_tap.bracket_check;

import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class CharacterCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter string: ");
        String str = scanner.nextLine().trim().toLowerCase();
        Map<String,Integer> treeMap = new TreeMap<>();
        String [] arr = str.split(" ");
       for (String s: arr){
           if (!s.equals(" ")){
               if (treeMap.containsKey(s)){
                   treeMap.put(s,treeMap.get(s)+1);
               } else {
                   treeMap.put(s,1);
               }
           }
       }

        Set<String> keySet = treeMap.keySet();
       for (String key : keySet){
           System.out.println(key + " Xuaats hien " + treeMap.get(key) + " laanf.");
       }
    }
}
