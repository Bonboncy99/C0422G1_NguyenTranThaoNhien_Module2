package CaseStudy.model;

public abstract class Vehicle {
    private String licensePlate;
    private Producer producer;
    private int year;
    private String owner;

    public Vehicle() {
    }

    public Vehicle(String licensePlates, Producer producer, int year, String owner) {
        this.licensePlate = licensePlates;
        this.producer = producer;
        this.year = year;
        this.owner = owner;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    public Producer getProducer() {
        return producer;
    }

    public void setProducer(Producer producer) {
        this.producer = producer;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    @Override
    public String toString() {
        return  "licensePlates='" + licensePlate + '\'' +
                ", producer=" + producer +
                ", year=" + year +
                ", owner='" + owner + '\'' + ", ";
    }
}
