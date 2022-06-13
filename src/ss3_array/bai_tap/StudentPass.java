package ss3_array.bai_tap;


import java.util.Scanner;

public class StudentPass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size;
        do {
            System.out.println("Nhap do dai mang");
            size = Integer.parseInt(scanner.nextLine());
        } while (size < 0 || size > 30);

        int [] arr = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.println("Nhap phan tu " + (i+1));
            arr[i] = Integer.parseInt(scanner.nextLine());
        }

        int count = 0;
        for (int i = 0; i < size; i++) {
            if (arr[i] >= 5){
                count++;
            }
        }
        System.out.println("So hoc sinh qua mon: " + count );

    }
}
