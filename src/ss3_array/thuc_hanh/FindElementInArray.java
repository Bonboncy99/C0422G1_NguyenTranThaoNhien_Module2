package ss3_array.thuc_hanh;

import java.util.Arrays;
import java.util.Scanner;

public class FindElementInArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a length");
        int length = Integer.parseInt(scanner.nextLine());
        String[] students = new String[length];

        for (int i = 0; i < length; i++) {
            System.out.println("Enter Element " + (i + 1));
            students[i] = scanner.nextLine();
        }
        System.out.println(Arrays.toString(students));

        System.out.println("Enter a Name ");
        String name = scanner.nextLine();
        boolean check = false;
        for (int i = 0; i < length; i++) {
            if (students[i].equals(name)) {
                check = true;
                System.out.println("The postion of " + name + " is " + i);
                break;
            }
        }
        if (!check) {
            System.out.println("Not found");
        }

    }
}
