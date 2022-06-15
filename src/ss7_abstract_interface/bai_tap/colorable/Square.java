package ss7_abstract_interface.bai_tap.colorable;

public class Square  extends Shape implements Colorable{
    private double size = 1;

    public Square() {
    }

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
                "size=" + size +
                '}';
    }


    @Override
    public void howToColor() {
        System.out.println("Color all four sides.");
    }
}
