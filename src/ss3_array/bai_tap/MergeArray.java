package ss3_array.bai_tap;

import java.util.Arrays;
import java.util.Scanner;

public class MergeArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập độ dài mảng 1");
        int size = Integer.parseInt(scanner.nextLine());
        int [] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Nhập phần tử mảng");
            arr[i] = Integer.parseInt(scanner.nextLine());
        }
        System.out.println(Arrays.toString(arr));

        System.out.println("Nhập độ dài mảng 2");
        int size2 = Integer.parseInt(scanner.nextLine());
        int [] arr2 = new int[size2];
        for (int i = 0; i < arr2.length; i++) {
            System.out.println("Nhập phần tử mảng");
            arr2[i] = Integer.parseInt(scanner.nextLine());
        }
        System.out.println(Arrays.toString(arr2));
        int [] arr3 = new int[size + size2];
        for (int i = 0; i < arr.length; i++) {
            arr3[i] = arr[i];
        }
        for (int i = 0; i < arr2.length; i++) {
            arr3[i+size] = arr2[i];
        }
        System.out.println(Arrays.toString(arr3));

    }
}
