package ss5_Ke_thua.thuc_hanh;

//import java.util.Scanner;

public class Rectangle extends Shape{
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

    public double getArea(){
        return this.width * this.length;
    }
    public double getPerimeter(){
        return (this.width + this.length) * 2;
    }
    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", length=" + length +
                ", color='" + color + '\'' +
                ", filled=" + filled +
                '}';
    }

//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        double width = Double.parseDouble(scanner.nextLine());
//        double length = Double.parseDouble(scanner.nextLine());
//        Rectangle rectangle = new Rectangle(width,length);
//        System.out.println(rectangle);
//        System.out.println(rectangle.getArea());
//        System.out.println(rectangle.getPerimeter());
//    }
}
