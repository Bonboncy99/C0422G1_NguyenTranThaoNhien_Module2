package ss1_production.bai_tap;
import java.util.Scanner;

public  class ChuyenDoiTienTe {
    public static void main(String[] args) {
        double vnd = 23000;
        double usd;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số tiền USD: ");
        usd = sc.nextDouble();
        double quyDoi = usd * vnd;
        System.out.println("Giá trị VND: " + quyDoi);
    }
}
