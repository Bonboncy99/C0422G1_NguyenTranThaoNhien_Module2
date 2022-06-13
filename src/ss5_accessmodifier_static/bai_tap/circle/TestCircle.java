package ss5_accessmodifier_static.bai_tap.circle;

import ss5_accessmodifier_static.bai_tap.circle.Circle;

public class TestCircle {
    public static void main(String[] args) {
        Circle circle1 = new Circle(3);

        System.out.println(circle1.getRadius());
        System.out.println(circle1.getArea());

        Circle circle2 = new Circle();
        System.out.println(circle2.getRadius());
        System.out.println(circle2.getArea());



    }
}
