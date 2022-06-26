package CaseStudy.service.impl;

import CaseStudy.model.Producer;
import CaseStudy.model.Truck;
import CaseStudy.service.ITruckService;
import CaseStudy.util.ProducerDTO;

import java.util.ArrayList;
import java.util.Scanner;

public class TruckService implements ITruckService {
    static Scanner scanner = new Scanner(System.in);
    static ArrayList <Truck> trucksList = new ArrayList<>();
    static {
        trucksList.add(new Truck("7777", ProducerDTO.producers.get(0),1994,"DK",6.5));
        trucksList.add(new Truck("8888", ProducerDTO.producers.get(1),1995,"The8",4));
        trucksList.add(new Truck("9999", ProducerDTO.producers.get(2),1996,"Suga",9.3));
    }
    @Override
    public void display() {
        for (int i = 0; i < trucksList.size(); i++) {
            System.out.println(i + ": "+ trucksList.get(i));
        }
    }

    @Override
    public void add() {
        System.out.println("Nhập biển kiểm soát xe tải bạn muốn thêm");
        String licensePlate = scanner.nextLine();

        System.out.println("Nhập Tên nhà sản xuất xe tải bạn muốn thêm");
        String producerName = scanner.nextLine();
        Producer producer = ProducerDTO.searchProducerByName(producerName);

        System.out.println("Nhập năm sản xuất xe tải bạn muốn thêm");
        int year = Integer.parseInt(scanner.nextLine());

        System.out.println("Nhập Chủ sở hữu xe tải bạn muốn thêm");
        String owner = scanner.nextLine();

        System.out.println("Nhập Trọng tải bạn muốn thêm");
        double tonnage = Double.parseDouble(scanner.nextLine());
        trucksList.add(new Truck(licensePlate,producer,year,owner,tonnage));
        display();

    }

    @Override
    public void delete(String licensePlate) {
        for (int i = 0; i < trucksList.size(); i++) {
            if (trucksList.get(i).getLicensePlate().equals(licensePlate)){
                System.out.println("Bạn thực sự muốn xóa?");
                boolean confirm = Boolean.parseBoolean(scanner.nextLine());
                if (confirm) {
                    trucksList.remove(i);
                    System.out.println("Xóa thành công");
                    display();
                    return;
                }
            }
        }
            System.out.println("Không Tìm thấy biển số xe tải muốn xóa");
    }


    @Override
    public Truck searchByLicensePlates(String licensePlate) {
        for (Truck truck:trucksList) {
            if (truck.getLicensePlate().equals(licensePlate)){
                return truck;
            }
        }
        return null;
    }

}
