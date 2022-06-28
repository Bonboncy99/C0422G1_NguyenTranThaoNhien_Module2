package case_study_furuma.models;
//Hệ thống cho phép quản lý thêm thông tin của các Customer đến thuê và sử
//        dụng các dịch vụ của Furama. Thông tin của Customer bao gồm: Mã khách hàng,
//        Họ tên , Ngày sinh, Giới tính, Số CMND, Số Điện Thoại, Email, Loại khách, Địa
//        chỉ (resort sẽ phân loại Customer để áp dụng các chính sách phục vụ cho phù hợp).
//        Loại Customer bao gồm: ().
public class Customer extends Person{
    static String [] customerTypes = new String[]{"Diamond", "Platinium", "Gold", "Silver", "Member"};
    private String customerCode;
    private String address;
    private String customerType;

    public Customer() {
    }

    public Customer(String name, String birthday, String gender, int identityNumber, int phone, String email, String customerCode, String address, String customerType) {
        super(name, birthday, gender, identityNumber, phone, email);
        this.customerCode = customerCode;
        this.address = address;
        this.customerType = customerType;
    }

    public static String[] getCustomerTypes() {
        return customerTypes;
    }

    public static void setCustomerTypes(String[] customerTypes) {
        Customer.customerTypes = customerTypes;
    }

    public String getCustomerCode() {
        return customerCode;
    }

    public void setCustomerCode(String customerCode) {
        this.customerCode = customerCode;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCustomerType() {
        return customerType;
    }

    public void setCustomerType(String customerType) {
        this.customerType = customerType;
    }

    @Override
    public String toString() {
        return "Customer{" +
                super.toString()+
                "customerCode='" + customerCode + '\'' +
                ", address='" + address + '\'' +
                ", customerType='" + customerType + '\'' +
                '}';
    }
}
