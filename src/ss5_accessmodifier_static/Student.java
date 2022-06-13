package ss5_accessmodifier_static;

public class Student {
    private String name;
    private String address;
    private String gender;
    private int age;
    private int id;
    static String school = "CodeGym";
    public static int count = 1;
j
    public Student(String name, String address, String gender, int age) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.gender = gender;
        this.age = age;
        count++;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", gender='" + gender + '\'' +
                ", age=" + age +

                '}';
    }
}
