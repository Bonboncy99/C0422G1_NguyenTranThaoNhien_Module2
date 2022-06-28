package case_study_furuma.models;
public class Employee extends Person {
    static String[] levels = new String[]{"Trung cấp", "Cao đẳng", "Đại học", "sau đại học"};
    static String[] positions = new String[]{"Lễ tân", "phục vụ", "chuyên viên", "giám sát", "quản lý", "giám đốc"};

    private String employeeCode;
    private  String level;
    private String position;
    private double salary;

    public Employee() {
    }
    public Employee(String name, String birthday, String gender, int identityNumber, int phone, String email, String employeeCode, String level, String position, double salary) {
        super(name, birthday, gender, identityNumber, phone, email);
        this.employeeCode = employeeCode;
        this.level = level;
        this.position = position;
        this.salary = salary;
    }

    public String getEmployeeCode() {
        return employeeCode;
    }

    public void setEmployeeCode(String employeeCode) {
        this.employeeCode = employeeCode;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                super.toString()+
                "employeeCode='" + employeeCode + '\'' +
                ", level='" + level + '\'' +
                ", position='" + position + '\'' +
                ", salary=" + salary +
                '}';
    }
}
