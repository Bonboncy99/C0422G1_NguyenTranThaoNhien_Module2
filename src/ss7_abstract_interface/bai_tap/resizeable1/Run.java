package ss7_abstract_interface.bai_tap.resizeable1;

import ss7_abstract_interface.bai_tap.colorable.Circle;
import ss7_abstract_interface.bai_tap.colorable.Rectangle;
import ss7_abstract_interface.bai_tap.colorable.Shape;
import ss7_abstract_interface.bai_tap.colorable.Square;


public class Run {
    public static void main(String[] args) {
        Shape [] shapes = new Shape[3];
        shapes[0] = new Circle();
        shapes[1] = new Rectangle();
        shapes[2] = new Square();
        System.out.println("Trước khi thay đổi kích thước");

        for (Shape shape:shapes) {
            System.out.println("Hình vẽ " + shape);
            System.out.println("Diện tích: "+ shape.getArea());
        }
        double percent = (Math.floor(Math.random()*101))/100;
        System.out.println(percent + "%");
        System.out.println("Sau khi thay đổi kích thước");

        for (Shape shape: shapes) {
            if (shape instanceof Resizeable)
        }

    }
}
