package ss5_accessmodifier_static;

import java.util.Scanner;

public class StudentManage {
    static Scanner scanner = new Scanner(System.in);

    static Student[] students = new Student[100];


    static {
        students[0] = new Student("Nhien", "QT", "Nu", 23);
        students[1] = new Student("Bon", "QT", "Nu", 23);
        students[2] = new Student("Cy", "QT", "Nu", 23);
    }

    public static void display() {
        for (Student student : students) {
            if (student != null) {
                System.out.println(student);
            }
        }
    }

    public static void add() {
        System.out.println("Nhap ten");
        String name = scanner.nextLine();
        System.out.println("Nhap dia chi");
        String address = scanner.nextLine();
        System.out.println("Nhap gioi tinh");
        String gender = scanner.nextLine();
        System.out.println("Nhap tuoi");
        int age = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập id");
        int id = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < students.length; i++) {
            if (students[i] == null) {
                students[i] = new Student(name, address, gender, age);
                display();
                break;
            }
        }
    }

    public static void remove() {
        System.out.println("Nhap phan tu can xoa");
        int index = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < students.length; i++) {
            if (i == index) {
                students[i] = null;
                break;
            }
        }
        display();
    }

    public static void update() {
        System.out.println("Nhap phan tu can thay doi");
        int index = Integer.parseInt(scanner.nextLine());

        if (students[index] != null) {
            System.out.println("Nhap ten");
            String name = scanner.nextLine();
            System.out.println("Nhap dia chi");
            String address = scanner.nextLine();
            System.out.println("Nhap gioi tinh");
            String gender = scanner.nextLine();
            System.out.println("Nhap tuoi");
            int age = Integer.parseInt(scanner.nextLine());
            students[index] = new Student(name, address, gender, age);
            display();
        }
    }

    public static void searchName() {
        System.out.println("Nhap ten can tìm");
        String name = scanner.nextLine().trim();
        for (int i = 0; i < students.length; i++) {
            if (students[i] != null) {
                if (students[i].getName().equals(name)) {
                    System.out.println(students[i] + "kq");
                }
            }
        }
    }

    public static void searchAddress() {
        System.out.println("Nhap dia chi can tìm");
        String address = scanner.nextLine().trim();
        for (int i = 0; i < students.length; i++) {
            if (students[i] != null) {
                if (students[i].getAddress().equals(address)) {
                    System.out.println(students[i]);
                }
            }
        }
    }

    public static void searchGender() {
        System.out.println("Nhap gioi tinh can tìm");
        String gender = scanner.nextLine().trim();
        for (int i = 0; i < students.length; i++) {
            if (students[i] != null) {
                if (students[i].getGender().equals(gender)) {
                    System.out.println(students[i]);
                }
            }
        }
    }

    public static void searchAge() {
        System.out.println("Nhap tuoi can tìm");
        int age = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < students.length; i++) {
            if (students[i] != null) {
                if (students[i].getAge() == (age)) {
                    System.out.println(students[i]);
                }
            }
        }
    }


}
