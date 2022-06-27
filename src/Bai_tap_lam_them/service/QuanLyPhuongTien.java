package Bai_tap_lam_them;

import java.util.ArrayList;
import java.util.Scanner;

public class QuanLyPhuongTien {
    Scanner scanner = new Scanner(System.in);
    static ArrayList<PhuongTienGiaoThong> phuongTienGiaoThongs = new ArrayList<>();

    static {
        phuongTienGiaoThongs.add(new OTO("dd", "ddfd", 29239, "dvdvs", 7, "Du lich"));
        phuongTienGiaoThongs.add(new XeTai("dds", "dvdv", 3434, "vfvfv", 5));
        phuongTienGiaoThongs.add(new XeMay("dccdsc", "dcdsc", 234, "cdscsdc", 120));
    }

    void display() {
        for (int i = 0; i < phuongTienGiaoThongs.size(); i++) {
            System.out.println((i + 1) + " " + phuongTienGiaoThongs.get(i));
        }
    }


    void add() {
        System.out.println("Nhập loại xe muốn thêm");
        System.out.println("1. OTO");
        System.out.println("2. Xe tải");
        System.out.println("3. Xe máy");
        int chooseCar = Integer.parseInt(scanner.nextLine());

        System.out.println("Nhập biển kiểm soát ");
        String bienKiemSoat = scanner.nextLine();
        System.out.println("Nhập tên hãng sản xuất ");
        String hangSanXuat = scanner.nextLine();
        System.out.println("Nhập năm sản xuất");
        int namSanXuat = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập chủ sở hữu");
        String chuSoHuu = scanner.nextLine();

        switch (chooseCar) {
            case 1:
                System.out.println("OTO");
                System.out.println("Nhập chỗ ngồi");
                int soChoNgoi = Integer.parseInt(scanner.nextLine());
                System.out.println("Nhập kiểu xe");
                String kieuXe = scanner.nextLine();
                phuongTienGiaoThongs.add(new OTO(bienKiemSoat, hangSanXuat, namSanXuat, chuSoHuu, soChoNgoi, kieuXe));
                break;
            case 2:
                System.out.println("Xe tải");
                System.out.println("Nhập trọng tải");
                double trongTai = Double.parseDouble(scanner.nextLine());
                phuongTienGiaoThongs.add(new XeTai(bienKiemSoat, hangSanXuat, namSanXuat, chuSoHuu, trongTai));
                break;
            case 3:
                System.out.println("Nhập công suất");
                double congSuat = Double.parseDouble(scanner.nextLine());
                phuongTienGiaoThongs.add(new XeMay(bienKiemSoat, hangSanXuat, namSanXuat, chuSoHuu, congSuat));
                break;
            default:
                System.out.println("Nhập sai!");
        }
    }


    void remove(int index) {
        phuongTienGiaoThongs.remove(index);
    }

    void searchBienKiemSoat(String bienKiemSoat) {
        boolean flag = false;
        for (int i = 0; i < phuongTienGiaoThongs.size(); i++) {
            if (phuongTienGiaoThongs.get(i).getBienKiemSoat().equals(bienKiemSoat)) {
                System.out.println(phuongTienGiaoThongs.get(i));
                flag = true;
                break;
            }
        }
        if (!flag){
            System.out.println("Biển kiểm soát không có trong danh sách");
        }
    }


}
