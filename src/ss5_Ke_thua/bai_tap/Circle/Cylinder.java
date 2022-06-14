package ss5_Ke_thua.bai_tap.Circle;

import ss5_Ke_thua.bai_tap.Circle.Circle;

public class Cylinder extends Circle {
    private double height;

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public Cylinder() {

    }

    public Cylinder(double height) {
        this.height = height;
    }

    public Cylinder(double radius, String color, double height) {
        super(radius, color);
        this.height = height;
    }

    public double getVolume(){
        return this.getArea()*this.height;
    }

    @Override
    public String toString() {
        return "Cylinder{" +
                "radius=" + this.getRadius() +
                ", color='" + this.getColor() + '\'' +
                ", height=" + height +
                '}';
    }

}
