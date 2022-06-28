package case_study_furuma.models;
//1. Khu nghỉ dưỡng Furama sẽ cung cấp các loại dịch vụ cho thuê bao gồm
//        Villa, House, Room.
//        Các loại dịch vụ này sẽ bao có các thông tin: Tên dịch vụ, Diện tích sử dụng, Chi phí
//        thuê, Số lượng người tối đa, Kiểu thuê (bao gồm thuê theo năm, tháng, ngày, giờ.
//        - Riêng loại Villa sẽ có thêm thông tin: Tiêu chuẩn phòng, Diện tích hồ bơi,
//        Số tầng.
//        - Riêng loại House sẽ có thêm thông tin: Tiêu chuẩn phòng, Số tầng.
//        - Riêng loại Room sẽ có thêm thông tin: Dịch vụ miễn phí đi kèm.
public class Room extends Facility{
    private String freeServiceIncluded;

    public Room() {
    }

    public Room(String serviceName, double usableArea, double fee, int maximumPeople, String freeServiceIncluded) {
        super(serviceName, usableArea, fee, maximumPeople);
        this.freeServiceIncluded = freeServiceIncluded;
    }

    public String getFreeServiceIncluded() {
        return freeServiceIncluded;
    }

    public void setFreeServiceIncluded(String freeServiceIncluded) {
        this.freeServiceIncluded = freeServiceIncluded;
    }

    @Override
    public String toString() {
        return "Room{" +
                super.toString()+
                "freeServiceIncluded='" + freeServiceIncluded + '\'' +
                '}';
    }
}
