package ss3_array.bai_tap;

import java.util.Arrays;
import java.util.Scanner;

public class SumCrossRoad2D {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        Tạo mảng 2 chiều
        System.out.println("Nhập độ dài mảng");
        int size = Integer.parseInt(scanner.nextLine());
        int[][] arr2d = new int[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.println("Nhập phần tử " + (j + 1));
                arr2d[i][j] = Integer.parseInt(scanner.nextLine());
            }
        }
        for (int i = 0; i < size; i++) {
            System.out.println(Arrays.toString(arr2d[i]));
        }

//        tính tổng 2 đường chéo
        int sum = 0;

        // Đường chéo \
        for (int i = 0; i < size; i++) {
            sum += arr2d[i][i];
            System.out.print(arr2d[i][i] + ", ");
        }
        System.out.println();

        // đường chéo /
        for (int i = 0; i < size; i++) {
            sum += arr2d[i][size - 1 - i];
            System.out.print(arr2d[i][size - 1 - i] + ", ");
        }
        System.out.println();


        //nếu mảng có size là số lẻ thì trừ đi phần tử ở giữa
        if (size % 2 != 0) {
            sum -= arr2d[(size - 1) / 2][(size - 1) / 2];
            System.out.println(arr2d[(size - 1) / 2][(size - 1) / 2]);
        }

        System.out.println(sum);
    }

}

