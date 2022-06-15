package ss5_Ke_thua.thuc_hanh;

public class Square extends Shape {
    double size = 1.0;

    public Square () {}
    public Square(double size) {
        this.size = size;
    }

    public Square(String color, boolean filled, double size) {
        super(color, filled);
        this.size = size;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public double getArea () {
        return Math.pow(this.size,2);
    }
    public double getParameter () {
        return this.size * 2;
    }

    @Override
    public String toString() {
        return "Square{" +
                "color='" + color + '\'' +
                ", filled=" + filled +
                ", size=" + size +
                '}';
    }
}
