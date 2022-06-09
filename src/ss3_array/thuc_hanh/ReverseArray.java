package ss3_array.thuc_hanh;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int length;
        int[] array;
        do {
            System.out.println("Enter a length > 20");
            length = Integer.parseInt(scanner.nextLine());
            if (length > 20) {
                System.out.println("Length does not exceed 20");
            }
        } while (length > 20);
        array = new int[length];

        for (int i = 0; i < length; i++) {
            System.out.println("Enter element " + (i + 1));
            array[i] = Integer.parseInt(scanner.nextLine());
        }
        System.out.println(Arrays.toString(array));


//        Tạo mảng mới
//        int [] array2;
//        array2 = new int[length];
//        for (int i = 0; i < length; i++) {
//            array2[i] = array[length-1-i];
//        }
//        System.out.println(Arrays.toString(array2));


//        đảo mảng cũ
        int first = 0;
        int last = length - 1;
        while (first < last) {
            int c = array[first];
            array[first] = array[last];
            array[last] = c;
            first++;
            last--;
        }
        System.out.println(Arrays.toString(array));

    }


}
