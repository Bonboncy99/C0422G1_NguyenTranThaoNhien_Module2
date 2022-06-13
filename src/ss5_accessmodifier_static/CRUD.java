package ss5_accessmodifier_static;

import java.util.Scanner;

public class CRUD {
    public static void main(String[] args) {
        displayMenu();
    }


    static void displayMenu() {
        Scanner scanner = new Scanner(System.in);
        StudentManage studentManage = new StudentManage();
        int choice;
        do {
            System.out.println("Menu");
            System.out.println("1. Display");
            System.out.println("2. Add");
            System.out.println("3. Delete");
            System.out.println("4 Update");
            System.out.println("5 Search name");
            System.out.println("6 Search address");
            System.out.println("7 Search gender");
            System.out.println("8 Search age");
            System.out.println("0. Exit");
            System.out.println("Enter choice");
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    System.out.println("1. Display");
                    studentManage.display();
                    break;
                case 2:
                    System.out.println("2. Add");
                    studentManage.add();
                    break;
                case 3:
                    System.out.println("3. Delete");
                    studentManage.remove();
                    break;
                case 4:
                    System.out.println("4. Update");
                    studentManage.update();
                    break;
                case 5:
                    System.out.println("5. Search Name");
                    studentManage.searchName();
                    break;
                case 6:
                    System.out.println("5. Search address");
                    studentManage.searchAddress();
                    break;
                case 7:
                    System.out.println("5. Search gender");
                    studentManage.searchGender();
                    break;
                case 8:
                    System.out.println("5. Search age");
                    studentManage.searchAge();
                    break;
                case 0:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Nhap sai, chon lai");
            }

        } while (choice != 0);
    }
}
