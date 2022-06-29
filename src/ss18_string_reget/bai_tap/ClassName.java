package ss18_string_reget.bai_tap;

import java.util.Scanner;

public class ClassName {
    final static String CLASSNAME_REGEX = "^[CAP][0-9]{4}[GHIKLM]$";
    public static boolean checkClassName(String className){
        return className.matches(CLASSNAME_REGEX);
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Nhap Ten lowp can kiem tra");
            String className = scanner.nextLine();
            if (checkClassName(className)) {
                System.out.println("Tên class đúng: " + className);
                break;
            }
        }while (true);
    }
}
