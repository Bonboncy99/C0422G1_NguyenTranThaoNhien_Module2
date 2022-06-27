package Bai_tap_lam_them;

public class XeMay extends PhuongTienGiaoThong {
    private double congSuat = 110;

    public XeMay() {
    }
    public XeMay(String bienKiemSoat, String tenHangSanXuat, int namSanXuat, String chuSoHuu, double congSuat) {
        super(bienKiemSoat, tenHangSanXuat, namSanXuat, chuSoHuu);
        this.congSuat = congSuat;
    }

    public double getCongSuat() {
        return congSuat;
    }

    public void setCongSuat(double congSuat) {
        this.congSuat = congSuat;
    }

    @Override
    public String toString() {
        return super.toString() + "XeMay " +
                "congSuat=" + congSuat +
                '}';
    }

    public static void main(String[] args) {
        XeMay xeMay = new XeMay();
        System.out.println(xeMay);
    }

}
