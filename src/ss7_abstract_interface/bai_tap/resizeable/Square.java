package ss7_abstract_interface.bai_tap.resizeable;

public class Square extends Shape implements Resizeable{
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
        return this.size * 4;
    }

    @Override
    public String toString() {
        return "Square{" +
                "color='" + super.getColor() + '\'' +
                ", filled=" + super.isFilled() +
                ", size=" + size +
                '}';
    }

    @Override
    public void resize(double percent) {
        size += (size*percent)/100;
    }
}
