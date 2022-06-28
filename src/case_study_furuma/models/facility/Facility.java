package case_study_furuma.models;

public abstract class Facility {
    private String serviceName;
    private double usableArea;
    private double fee;
    int maximumPeople;

    public Facility() {
    }

    public Facility(String serviceName, double usableArea, double fee, int maximumPeople) {
        this.serviceName = serviceName;
        this.usableArea = usableArea;
        this.fee = fee;
        this.maximumPeople = maximumPeople;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public double getUsableArea() {
        return usableArea;
    }

    public void setUsableArea(double usableArea) {
        this.usableArea = usableArea;
    }

    public double getFee() {
        return fee;
    }

    public void setFee(double fee) {
        this.fee = fee;
    }

    public int getMaximumPeople() {
        return maximumPeople;
    }

    public void setMaximumPeople(int maximumPeople) {
        this.maximumPeople = maximumPeople;
    }

    @Override
    public String toString() {
        return "serviceName='" + serviceName + '\'' +
                ", usableArea=" + usableArea +
                ", fee=" + fee +
                ", maximumPeople=" + maximumPeople +
               ", ";
    }
}
