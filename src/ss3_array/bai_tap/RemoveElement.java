package ss3_array.bai_tap;


import java.util.Arrays;
import java.util.Scanner;

public class RemoveElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập độ dài mảng");
        int size = Integer.parseInt(scanner.nextLine());
        int [] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Nhập phần tử thứ " + (i+1));
            arr[i] = Integer.parseInt(scanner.nextLine());
        }
        System.out.println(Arrays.toString(arr));
        System.out.println("Nhập số cần kiểm tra");
        int number = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == number) {
                for (int j = i; j < arr.length-1 ; j++) {
                    arr[j] = arr[j+1];
                }
                arr[arr.length-1] = 0;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
