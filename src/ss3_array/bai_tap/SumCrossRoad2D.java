package ss3_array.bai_tap;

import java.util.Arrays;
import java.util.Scanner;

public class SumCrossRoad2D {
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

        int sum = 0;
        for (int i = 0; i < size1 -1; i++) {
                sum += arr2d[i][i];
            }
        for (int i = size1-1; i >= 0 ; i--) {
            sum += arr2d[i][i];
        }
        if (size1 % 2 != 0) {
            sum -= arr2d[(size1-1)/2][(size1-1)/2];
        }
        System.out.println(arr2d[(size1-1)/2][(size1-1)/2]);
        System.out.println(sum);
        }


    }

