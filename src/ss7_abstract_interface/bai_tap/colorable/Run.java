package ss7_abstract_interface.bai_tap.colorable;

public class Run {
    public static void main(String[] args) {
        Shape [] shapes = new Shape[4];
        shapes[0]  =  new Circle();
        shapes[1] = new Square();
        shapes[2] = new Rectangle();
        shapes[3] = new Square();

        for (Shape shape: shapes) {
            System.out.println(shape);
            System.out.println("Diện tích là " + shape.getArea());

            if (shape instanceof Colorable){
               ((Colorable) shape).howToColor();
            }
            System.out.println();
        }

    }
}
