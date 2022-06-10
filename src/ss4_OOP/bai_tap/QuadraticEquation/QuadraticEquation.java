package ss4_OOP.bai_tap.QuadraticEquation;

public class QuadraticEquation {
     double a, b, c;




    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getDiscriminant() {
        return Math.pow(this.b, 2) - 4 * this.a * this.c;
    }

    public double getRoot1() {
        return (-this.b + Math.pow(this.getDiscriminant(), 0.5)) / (2 * this.a);
    }

    public double getRoot2() {
        return (-this.b - Math.pow(this.getDiscriminant(), 0.5)) / (2 * this.a);
    }
    public void  displayRoot(){
        if (this.getDiscriminant() < 0) {
            System.out.println("Phuong trinh vo ngiem");
        } else if (this.getDiscriminant() == 0) {
            System.out.println("Phuong trinh co nghiem kep x = " + this.getRoot1());
        } else {
            System.out.println("Phuong trinh co 2 nghiem la " + this.getRoot1() + "va" + getRoot2());
        }
    }
}
