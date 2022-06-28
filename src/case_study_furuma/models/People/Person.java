package case_study_furuma.models;
public abstract class Person {
    private String name;
    private String birthday;
    private String gender;
    private int identityNumber;
    private long phone;
    private String email;

    public Person() {
    }

    public Person(String name, String birthday, String gender, int identityNumber, long phone, String email) {
        this.name = name;
        this.birthday = birthday;
        this.gender = gender;
        this.identityNumber = identityNumber;
        this.phone = phone;
        this.email = email;
    }

    public long getPhone() {
        return phone;
    }

    public void setPhone(long phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getIdentityNumber() {
        return identityNumber;
    }

    public void setIdentityNumber(int identityNumber) {
        this.identityNumber = identityNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "name='" + name + '\'' +
                ", birthday='" + birthday + '\'' +
                ", gender='" + gender + '\'' +
                ", identityNumber=" + identityNumber +
                ", phone=" + phone +
                ", email='" + email + '\'' +
                ", ";
    }
}
