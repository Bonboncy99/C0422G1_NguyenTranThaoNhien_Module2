package Bai_tap_lam_them;

public class XeTai extends PhuongTienGiaoThong{
    private double trongTai = 7;

    public XeTai() {
    }
    public XeTai(String bienKiemSoat, String tenHangSanXuat, int namSanXuat, String chuSoHuu, double trongTai) {
        super(bienKiemSoat, tenHangSanXuat, namSanXuat, chuSoHuu);
        this.trongTai = trongTai;
    }

    public double getTrongTai() {
        return trongTai;
    }

    public void setTrongTai(double trongTai) {
        this.trongTai = trongTai;
    }

    @Override
    public String toString() {
        return super.toString() +"XeTai: " +
                "trongTai=" + trongTai +
                '}';
    }

    public static void main(String[] args) {
        XeTai xeTai = new XeTai();
        System.out.println(xeTai);
    }
}
