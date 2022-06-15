package ss7_abstract_interface.bai_tap.resizeable1;

//import java.util.Scanner;

public class Rectangle extends Shape implements Resizeable {
    private double width = 1;
    private double length = 1;

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }


    public Rectangle() {

    }

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public Rectangle(String color, boolean filled, double width, double length) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    public double getArea() {
        return this.width * this.length;
    }



    @Override
    public void resize(double percent) {
        width += (width * percent) / 100;
        length += (length * percent) / 100;
    }


    public double getPerimeter() {
        return (this.width + this.length) * 2;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", length=" + length +
                ", color='" + super.getColor() + '\'' +
                ", filled=" + super.isFilled() +
                '}';
    }




}
