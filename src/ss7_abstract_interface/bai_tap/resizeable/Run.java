package ss7_abstract_interface.bai_tap.resizeable;

public class Run {
    public static void main(String[] args) {
        Shape [] shapes = new Shape[3];
        shapes[0] = new Circle(3);
        shapes[1] = new Square(4);
        shapes[2] = new Rectangle(2,3);


        System.out.println("Truoc khi chay");
        for (Shape shape: shapes) {
            System.out.println(shape);
            System.out.println("Dien tich la " + shape.getArea());
        }
        System.out.println();
        System.out.println();
        double percent = Math.floor((Math.random()*100)+1);
        System.out.println(percent);

        System.out.println("Sau khi chay");
        for (Shape shape: shapes) {
            if (shape instanceof Resizeable){
                ((Resizeable) shape).resize(percent);
            }
            System.out.println(shape);
            System.out.println("Dien tich la " + shape.getArea());
        }
    }
}
