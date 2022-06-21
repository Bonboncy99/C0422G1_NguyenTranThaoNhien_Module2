package ss12_java_collection_framework.bai_tap;

import java.util.*;

public class ProductManager {
    Scanner scanner = new Scanner(System.in);
    static private List<Product> products = new ArrayList<>();

    static {
        products.add(new Product(1, "Ban", 50));
        products.add(new Product(2, "Ghe", 60));
        products.add(new Product(3, "But", 10));
        products.add(new Product(4, "Thuoc", 20));
        products.add(new Product(5, "Binh nuoc", 80));
        products.add(new Product(6, "Ban", 50));
    }

    public void display() {
        for (Product product : products) {
            System.out.println(product);
        }
    }

    public void add() {
//        System.out.println("Nhap id:");
//        int id = Integer.parseInt(scanner.nextLine());
//        System.out.println("Nhap ten san pham:");
//        String name = scanner.nextLine();
//        System.out.println("Nhap gia san pham:");
//        double price = Double.parseDouble(scanner.nextLine());
//        products.add(new Product(id, name, price));
//        display();

        System.out.println("Nhập id");
        boolean flag;
        int id;
        do {
            flag = false;
            id = Integer.parseInt(scanner.nextLine().trim());
            for (Product product : products) {
                if (product == null) {
                    break;
                }else if (product.getId() == id) {
                    System.out.println("Id đã có, nhập id khác");
                    flag = true;
                    break;
                }
            }
        } while (flag);

        System.out.println("Nhap ten san pham:");
        String name = scanner.nextLine();
        System.out.println("Nhap gia san pham:");
        double price = Double.parseDouble(scanner.nextLine());
        products.add(new Product(id, name, price));
        display();
    }

    public void update() {
        System.out.println("Nhập phần tử cần đổi theo id");
        int index = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).getId() == index) {
                System.out.println("Nhap ten san pham cần sửa:");
                String name = scanner.nextLine();
                System.out.println("Nhap gia san pham cần sửa:");
                double price = Double.parseDouble(scanner.nextLine());
                products.get(index).setName(name);
                products.get(index).setPrice(price);
                display();
                return;
            }
        }
        System.out.println("Không thấy phần tử có id cần tìm");
    }

    public void delete() {
        System.out.println("Nhập phần tử cần xóa theo id");
        int index = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).getId() == index) {
                products.remove(i);
                display();
                return;
            }
        }
        System.out.println("Không thấy phần tử có id cần tìm");
    }


    public void seachByName() {
        System.out.println("Nhập tên Sản phẩm cần tìm");
        String name = scanner.nextLine();

        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).getName().equals(name)) {
                System.out.println(products.get(i));
            }
        }
    }

    public void sortIncrease() {
        Collections.sort(products);
        System.out.println("Mảng sau khi sắp xếp là:");
        display();
    }
}

