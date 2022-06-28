package ss17_io_binary_file_serialization.bai_tap.product.servivce;

import ss17_io_binary_file_serialization.bai_tap.product.WriteAndReadFile;
import ss17_io_binary_file_serialization.bai_tap.product.models.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProductService {
    static Scanner scanner = new Scanner(System.in);
    static List<Product> products = new ArrayList<>();
    static final String FILE_PATH = "src/ss17_io_binary_file_serialization/bai_tap/product/product.dat";

    public static void add (){
        List<Product> products = WriteAndReadFile.readFromFile(FILE_PATH);
        System.out.println("Nhập mã sản phẩm");
        int productCode  = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhap ten san pham");
        String productName = scanner.nextLine();

        System.out.println("Nhap nha san xuat");
        String producer = scanner.nextLine();

        System.out.println("Nhap gia san pham");
        double price = Double.parseDouble(scanner.nextLine());

        System.out.println("Nhap mo ta");
        String description = scanner.nextLine();

        products.add(new Product(productCode,productName,producer,price,description));
        WriteAndReadFile.writeToFile(FILE_PATH,products);
    }

    public  static void display(){
        List<Product> products = WriteAndReadFile.readFromFile(FILE_PATH);
        for (int i = 0; i < products.size(); i++) {
            System.out.println(products.get(i));
        }
    }

    public static void searchByCode(){
        List<Product> products =WriteAndReadFile.readFromFile(FILE_PATH);
        System.out.println("Nhaap ma san pham cần tìm");
        int productcode = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).getProductCode()==productcode){
                System.out.println(products.get(i));
                return;
            }
        }
        System.out.println("Không có sản phẩm bạn muốn tìm");
    }

    public static void searchByname(){
        List<Product> products = WriteAndReadFile.readFromFile(FILE_PATH);
        System.out.println("Nhập tên sản phẩm cần tìm");
        String name = scanner.nextLine();
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).getProductName().equals(name)){
                System.out.println(products.get(i));
            }
        }
    }
}
