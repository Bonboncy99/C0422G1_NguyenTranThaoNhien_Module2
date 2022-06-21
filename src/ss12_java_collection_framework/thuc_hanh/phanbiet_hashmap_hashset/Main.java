package ss12_java_collection_framework.thuc_hanh.phanbiet_hashmap_hashset;

import ss12_java_collection_framework.thuc_hanh.phanbiet_hashmap_hashset.Student;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Bon", 23, "QT");
        Student student2 = new Student("Nhien", 22, "QT");
        Student student3 = new Student("CY", 21, "QT");

        Map <Integer, Student> studentMap = new HashMap<Integer,Student>();
        studentMap.put(1,student1);
        studentMap.put(2,student2);
        studentMap.put(3,student3);
        studentMap.put(1,student1);

        for(Map.Entry<Integer,Student> student : studentMap.entrySet()){
            System.out.println(student.toString());
        }

        System.out.println(".........Set");
        Set <Student> students = new HashSet<Student>();
        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student1);

        for (Student student : students){
            System.out.println(student.toString());
        }

    }
}
