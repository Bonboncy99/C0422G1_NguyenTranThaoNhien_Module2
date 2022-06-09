package ss3_array.bai_tap;

import java.util.Arrays;
import java.util.Scanner;

public class MaxArray2D {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập độ dài mảng");
        int size1 = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập độ dài mảng con");
        int size2 = Integer.parseInt(scanner.nextLine());
        int [][] arr2d = new int[size1][size2];
        for (int i = 0; i < size1; i++) {
            for (int j = 0; j < size2; j++) {
                System.out.println("Nhập phần tử " + (j+1));
                arr2d[i][j] = Integer.parseInt(scanner.nextLine());
            }
        }
        for (int i = 0; i < size1; i++) {
            System.out.println(Arrays.toString(arr2d[i]));
        }
            int max = arr2d[0][0];
        for (int i = 0; i < size1; i++) {
            for (int j = 0; j < size2; j++) {
                if (max < arr2d[i][j]){
                    max = arr2d[i][j];
                }
            }
        }
        System.out.println("max is " + max);

    }
}
