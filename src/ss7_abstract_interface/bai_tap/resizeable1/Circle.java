package ss7_abstract_interface.bai_tap.resizeable1;

public class Circle extends Shape implements Resizeable {
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
                ", color='" + super.getColor() + '\'' +
                ", filled=" + super.isFilled() +
                '}';
    }

    @Override
    public void resize(double percent) {
         radius += (radius*percent)/100;
    }
}
