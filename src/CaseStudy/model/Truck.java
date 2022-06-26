package CaseStudy.model;

public class Truck extends Vehicle{
    private double Tonnage;

    public Truck() {
    }

    public Truck(String licensePlate, Producer producer, int year, String owner, double tonnage) {
        super(licensePlate, producer, year, owner);
        Tonnage = tonnage;
    }

    public double getTonnage() {
        return Tonnage;
    }

    public void setTonnage(double tonnage) {
        Tonnage = tonnage;
    }

    @Override
    public String toString() {
        return "Truck{" +
                super.toString()+
                "Tonnage=" + Tonnage +
                '}';
    }
}
