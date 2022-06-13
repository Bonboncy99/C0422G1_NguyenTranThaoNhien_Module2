package ss3_array.thuc_hanh;

import java.util.Arrays;
import java.util.Scanner;

public class MinOfArray {
    public static double minInArray (double[]arr){
        double min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min){
                min = arr[i];
            }
        }
        return min;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap do dai mang");
        int size = Integer.parseInt(scanner.nextLine());
        double [] arr = new double[size];
        for (int i = 0; i < size; i++) {
            System.out.println("nhap phan tu "+(i+1));
            arr[i] = Double.parseDouble(scanner.nextLine());
        }
        System.out.println(Arrays.toString(arr));

        System.out.println("min in array is " + minInArray(arr));
    }

}
