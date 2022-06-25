package ss15_sort_algorithm.thuc_hanh.bai_tap;

import java.util.Arrays;
import java.util.Scanner;

public class InsertSort {
    static int[] list = {2, 3, 2, 5, 6, 1, -2, 3, 14, 12};
    private static void insertionSort(int[] arr) {
        int pos;
        int x;
        for (int i = 1; i < arr.length; i++) {
            pos = i;
            x = arr[i];
            while (pos > 0 && x < arr[pos-1]){
                arr[pos] = arr[pos -1];
                pos--;
            }
            arr[pos] = x;
        }
    }
    public static void main(String[] args) {
        insertionSort(list);
        System.out.println(Arrays.toString(list));
    }
}
