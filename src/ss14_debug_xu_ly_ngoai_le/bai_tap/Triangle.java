package ss14_debug_xu_ly_ngoai_le.bai_tap;

public class Triangle {
    private double a;
    private double b;
    private double c;

    public Triangle(double a, double b, double c) throws TriangleExcepction {
        if (a <= 0 || b <= 0 || c <= 0) {
            throw new TriangleExcepction(" Cạnh nhỏ hơn hoặc bằng  0");
        } else if (a + b < c || a + c < b || b + c < a) {
            throw new TriangleExcepction(" Tổng 2 cạnh bé hơn cạnh conf lại");
        } else {
            this.a = a;
            this.b = b;
            this.c = c;
        }
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "a=" + a +
                ", b=" + b +
                ", c=" + c +
                '}';
    }
}
