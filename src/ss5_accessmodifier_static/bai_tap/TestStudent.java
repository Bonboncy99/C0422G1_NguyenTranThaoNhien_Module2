package ss5_accessmodifier_static.bai_tap;


public class TestStudent {
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.setName("Bon");
        student1.setClass1("C0422G1");
        System.out.println(student1.getName() + ": "+ student1.getClass1() );

        Student student2 = new Student();
        System.out.println(student2.getName() + ": "+ student2.getClass1() );

    }
}
