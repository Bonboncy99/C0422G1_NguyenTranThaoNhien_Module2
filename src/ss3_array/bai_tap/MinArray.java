package ss3_array.bai_tap;

import java.util.Arrays;
import java.util.Scanner;

public class MinArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập chiều dài mảng");
        int size = Integer.parseInt(scanner.nextLine());
        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Nhập phần tử thứ " + (i + 1));
            arr[i] = Integer.parseInt(scanner.nextLine());
        }
        System.out.println(Arrays.toString(arr));

        int min = arr[0];
        for (int i : arr) {
            if (min > i){
                min = i;
            }
        }
        System.out.println("Min is " + min);
    }
}
