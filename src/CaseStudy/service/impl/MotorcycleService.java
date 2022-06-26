package CaseStudy.service.impl;

import CaseStudy.model.Motorcycle;
import CaseStudy.model.Producer;
import CaseStudy.service.IMotorcycleService;
import CaseStudy.util.ProducerDTO;

import java.util.ArrayList;
import java.util.Scanner;

public class MotorcycleService implements IMotorcycleService {
    static Scanner scanner = new Scanner(System.in);
    static ArrayList<Motorcycle> motorcyclesList = new ArrayList<>();

    static {
        motorcyclesList.add(new Motorcycle("4444", ProducerDTO.producers.get(0), 1999, "Jhope", 30));
        motorcyclesList.add(new Motorcycle("5555", ProducerDTO.producers.get(1), 1999, "Wonwoo", 50));
        motorcyclesList.add(new Motorcycle("6666", ProducerDTO.producers.get(2), 1999, "Yoshi", 40));
    }

    @Override
    public void display() {
        for (int i = 0; i < motorcyclesList.size(); i++) {
            System.out.println(i + ": " + motorcyclesList.get(i));
        }
    }

    @Override
    public void add() {
        System.out.println("Nhập biển kiểm soát xe máy bạn muốn thêm");
        String licensePlate = scanner.nextLine();

        System.out.println("Nhập tên hãng sản xản xuất xe máy bạn muốn thêm");
        String producerName = scanner.nextLine();
        Producer producer = ProducerDTO.searchProducerByName(producerName);

        System.out.println("Nhập năm sản xuất xe máy  bạn muốn thêm");
        int year = Integer.parseInt(scanner.nextLine());

        System.out.println("Nhập Chủ sở hữu xe máy  bạn muốn thêm");
        String owner = scanner.nextLine();

        System.out.println("Nhập công suất xe máy  bạn muốn thêm");
        double wattage = Double.parseDouble(scanner.nextLine());

        motorcyclesList.add(new Motorcycle(licensePlate,producer,year,owner,wattage));
        display();
    }

    @Override
    public void delete(String licensePlate) {
        for (int i = 0; i < motorcyclesList.size(); i++) {
            if (motorcyclesList.get(i).getLicensePlate().equals(licensePlate)){
                System.out.println("Bạn thực sự muốn xóa?");
                boolean confirm = Boolean.parseBoolean(scanner.nextLine());
                if (confirm) {
                    motorcyclesList.remove(i);
                    System.out.println("Xóa thành công");
                    display();
                    return;
                }
            }
        }
        System.out.println("Không tìm thấy biển số xe máy bạn muốn xóa");
    }


    @Override
    public Motorcycle searchByLicensePlates(String licensePlate) {
        for (Motorcycle motorcycle:motorcyclesList) {
            if (motorcycle.getLicensePlate().equals(licensePlate)){
                return motorcycle;
            }
        }
        return null;
    }


}
