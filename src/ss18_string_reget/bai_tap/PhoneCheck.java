package ss18_string_reget.bai_tap;

import java.util.Scanner;

public class PhoneCheck {
    static final String PHONE_REGET = "^\\([0-9]{2}\\)-\\(0[0-9]{9}\\)$";
    public static boolean checkPhone(String phone){
        return phone.matches(PHONE_REGET);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so dien thoai can kiem tra");
        String phone = scanner.nextLine();
        System.out.println(checkPhone(phone));
    }
}
