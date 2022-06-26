package CaseStudy.service.impl;

import CaseStudy.model.Car;
import CaseStudy.model.Producer;
import CaseStudy.service.IMotorcycleService;
import CaseStudy.util.ProducerDTO;

import java.util.ArrayList;
import java.util.Scanner;

public class CarService implements IMotorcycleService {
    static Scanner scanner = new Scanner(System.in);
    static ArrayList<Car> carsList = new ArrayList<>();

    static {
        carsList.add(new Car("1111", ProducerDTO.producers.get(0), 1994, "Bon", 5, "Du lịch"));
        carsList.add(new Car("2222", ProducerDTO.producers.get(0), 2000, "Nhiên", 7, "Du lịch"));
        carsList.add(new Car("3333", ProducerDTO.producers.get(0), 1996, "CY", 16, "Xe Khách"));
    }

    @Override
    public void display() {
        for (int i = 0; i < carsList.size(); i++) {
            System.out.println(i + ": " + carsList.get(i));
        }
    }

    @Override
    public void add() {
        System.out.println("Nhập biển kiểm soát oto bạn muốn thêm");
        String licensePlate = scanner.nextLine();

        System.out.println("Nhập tên hãng sản xản xuất oto bạn muốn thêm");
        String producerName = scanner.nextLine();
        Producer producer = ProducerDTO.searchProducerByName(producerName);

        System.out.println("Nhập năm sản xuất oto bạn muốn thêm");
        int year = Integer.parseInt(scanner.nextLine());

        System.out.println("Nhập Chủ sở hữu oto bạn muốn thêm");
        String owner = scanner.nextLine();

        System.out.println("Nhập Số chỗ ngồi oto bạn muốn thêm");
        int numberOfSeats = Integer.parseInt(scanner.nextLine());

        System.out.println("Nhập kiểu xe oto bạn muốn thêm");
        String type = scanner.nextLine();

        carsList.add(new Car(licensePlate, producer, year, owner, numberOfSeats, type));
        display();
    }

    @Override
    public void delete(String licensePlate) {
        for (int i = 0; i < carsList.size(); i++) {
            if (carsList.get(i).getLicensePlate().equals(licensePlate)) {
                System.out.println("Bạn thực sự muốn xóa?");
                boolean confirm = Boolean.parseBoolean(scanner.nextLine());
                if (confirm) {
                    carsList.remove(i);
                    System.out.println("Xóa thành công");
                    display();
                    return;
                }
            }
        }
        System.out.println("Không tìm thấy biển số xe oto bạn muốn xóa");
    }

    @Override
    public Car searchByLicensePlates(String licensePlate) {
        for (Car car: carsList) {
            if (car.getLicensePlate().equals(licensePlate)) {
                return car;
            }
        }
        return null;
    }
}
