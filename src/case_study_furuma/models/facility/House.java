package case_study_furuma.models;
public class House extends Facility{
    private String roomStandard;
    private int floor;

    public House() {
    }

    public House(String serviceName, double usableArea, double fee, int maximumPeople, String roomStandard, int floor) {
        super(serviceName, usableArea, fee, maximumPeople);
        this.roomStandard = roomStandard;
        this.floor = floor;
    }

    public String getRoomStandard() {
        return roomStandard;
    }

    public void setRoomStandard(String roomStandard) {
        this.roomStandard = roomStandard;
    }

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    @Override
    public String toString() {
        return "House{" +
                super.toString()+
                "roomStandard='" + roomStandard + '\'' +
                ", floor=" + floor +
                '}';
    }
}
