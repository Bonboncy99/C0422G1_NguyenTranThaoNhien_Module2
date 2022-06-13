package ss3_array.bai_tap;

import java.util.Arrays;
import java.util.Scanner;

public class SumColumn {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap do dai mang");
        int size1 = Integer.parseInt(scanner.nextLine());

        System.out.println("Nhap do dai mang con");
        int size2 = Integer.parseInt(scanner.nextLine());

        int [][] arr = new int[size1][size2];
        for (int i = 0; i < size1; i++) {
            for (int j = 0; j < size2; j++) {
                System.out.println("Nhap phan tu thu "+ (j+1));
                arr[i][j] = Integer.parseInt(scanner.nextLine());
            }
        }
        for (int i = 0; i < size1; i++) {
            System.out.println(Arrays.toString(arr[i]));
        }

        System.out.println("Nhap cot muon tinh tong");
        int col = Integer.parseInt(scanner.nextLine());
        int sum = 0;
        for (int i = 0; i < size1; i++) {
            sum += arr[i][col];
        }
        System.out.println("Toorng cot " + col + ": " + sum);
    }
}
