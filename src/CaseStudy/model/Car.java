package CaseStudy.model;

public class Car extends Vehicle {
    private int numberOfSeats;
    private String type;

    public Car() {
    }

    public Car(String licensePlate, Producer producer, int year, String owner, int numberOfSeats, String type) {
        super(licensePlate, producer, year, owner);
        this.numberOfSeats = numberOfSeats;
        this.type = type;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public void setNumberOfSeats(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Car{" +
                super.toString()+
                "numberOfSeats=" + numberOfSeats +
                ", type='" + type + '\'' +
                '}';
    }
}
