package ss3_array.thuc_hanh;

import java.util.Arrays;
import java.util.Scanner;

public class FindMaxElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size;
        do {
            System.out.println("Enter a size");
            size = Integer.parseInt(scanner.nextLine());
        } while (size > 20);

        int [] array = new int[size];
        for (int i = 0; i < size ; i++) {
            System.out.println("Enter element " + (i+1));
            array[i] = Integer.parseInt(scanner.nextLine());
        }
        System.out.println(Arrays.toString(array));

        int index = 0;
        int max = array[0];
        for (int i = 1; i < size; i++) {
            if (array[i] > max) {
                max = array[i];
                index = i;
            }
        }
        System.out.println("Max is " + max + " at index " + index);
    }

}
