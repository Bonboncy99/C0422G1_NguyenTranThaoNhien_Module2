package ss4_OOP.thuc_hanh;

public class Rectangle {
    double width, height;

    public Rectangle () {
    }

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getPerimeter(){
        return (this.width + this.height)*2;
    }

    public double getArea(){
        return this.width * this.height;
    }
    public String Display () {
        return "Hinh chu nhat  dai "+ height + " , rong  " + height;
    }
}
