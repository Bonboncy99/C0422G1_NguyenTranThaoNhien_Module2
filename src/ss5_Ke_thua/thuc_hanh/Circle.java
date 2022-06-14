package ss5_Ke_thua.thuc_hanh;

import java.util.Scanner;

public class Circle extends Shape{
    private double radius = 1;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(String color, boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }

    public double getArea () {
        return Math.PI * this.radius * this.radius;
    }
    public double getPerimeter () {
        return Math.PI * this.radius *2;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", color='" + color + '\'' +
                ", filled=" + filled +
                '}';
    }
}
