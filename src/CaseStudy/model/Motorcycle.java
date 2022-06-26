package CaseStudy.model;

public class Motorcycle extends Vehicle{
    private double wattage;

    public Motorcycle() {
    }

    public Motorcycle(String licensePlate, Producer producer, int year, String owner, double wattage) {
        super(licensePlate, producer, year, owner);
        this.wattage = wattage;
    }

    public double getWattage() {
        return wattage;
    }

    public void setWattage(double wattage) {
        this.wattage = wattage;
    }

    @Override
    public String toString() {
        return "Motorcycle{" +
                super.toString()+
                "wattage=" + wattage +
                '}';
    }
}
