package ss3_array.bai_tap;

import java.util.Arrays;
import java.util.Scanner;

public class AddElement {
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
        System.out.println("Nhập ví trí cần chèn phần tử");
        int index = Integer.parseInt(scanner.nextLine());

        if (index < 0 || index > arr.length - 1) {
            System.out.println("Không thể chèn phần tử");

        } else {
            System.out.println("Nhập Phần tử cần chèn");
            int number = Integer.parseInt(scanner.nextLine());

            for (int i = arr.length - 1; i > index; i--) {
                arr[i] = arr[i - 1];
            }
            arr[index] = number;
            System.out.println(Arrays.toString(arr));
        }
    }
}
