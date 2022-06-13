package ss5_accessmodifier_static.bai_tap;

public class Student {
    private String name = "John";
    private String class1 = "C04";

    Student(){

    }

    public void setName(String name) {
        this.name = name;
    }
    public void setClass1(String class1) {
        this.class1 = class1;
    }

     public String getName() {
        return name;
    }

     public String getClass1() {
        return class1;
    }
}
