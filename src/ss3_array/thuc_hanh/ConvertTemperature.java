package ss3_array.thuc_hanh;

import java.util.Scanner;

public class ConvertTemperature {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice = -1;
        double fahrenheit;
        double celsius;
        while (choice != 0) {
            System.out.println("Menu");
            System.out.println("1. Fahrenheit to Celsius");
            System.out.println("2. Celsius to Fahrenheit");
            System.out.println("0. Exit");
            System.out.println("Enter your choice: ");

            choice = Integer.parseInt(scanner.nextLine());

            switch (choice){
                case 1:
                    System.out.println("1. Fahrenheit to Celsius");
                    System.out.println("Enter Farhenheit");
                    fahrenheit = Double.parseDouble(scanner.nextLine());
                    System.out.println("Celsius is " + fahrenheitToCelsius(fahrenheit));
                    break;
                case 2:
                    System.out.println("2. Celsius to Fahrenheit");
                    System.out.println("Enter Celsius");
                    celsius = Double.parseDouble(scanner.nextLine());
                    System.out.println("Fahrenheit is " + celsiusToFahrenheit(celsius));
                    break;
                case 0: System.exit(0);
                default:
                    System.out.println("Bad choice, again");
            }
        }
    }
    public  static  double fahrenheitToCelsius(double fahrenheit) {
        Double celsius = (5.0 / 9) * (fahrenheit - 32);
        return  celsius;
    }
    public static double celsiusToFahrenheit (double celsius){
        double fahrenheit =  (9.0 / 5) * celsius + 32;
        return  fahrenheit;
    }

}

