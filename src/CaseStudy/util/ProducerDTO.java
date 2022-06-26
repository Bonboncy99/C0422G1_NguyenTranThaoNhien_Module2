package CaseStudy.util;

import CaseStudy.model.Producer;

import java.util.ArrayList;
import java.util.Scanner;

public class ProducerDTO {
    static Scanner scanner = new Scanner(System.in);
    public static ArrayList<Producer> producers = new ArrayList<>();
    static {
    producers.add(new Producer(1, "BMW", "Mỹ"));
    producers.add(new Producer(2, "Vinfast", "Việt Nam"));
    producers.add(new Producer(3,"Mec", "Đức"));
    }
    public static Producer searchProducerByName(String producerName){
        for (int i = 0; i < producers.size(); i++) {
            if (producers.get(i).getProducerName().equals(producerName)){
                return producers.get(i);
            }
        }
        System.out.println("Hãng sản xuất muốn tìm chưa có, tạo mới:");
        System.out.println("Nhập mã hãng sản xuất");
        int plu = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập quốc gia");
        String nation = scanner.nextLine();
        Producer newProducer = new Producer(plu,producerName, nation);
        producers.add(newProducer);
        return newProducer;
    }
}
