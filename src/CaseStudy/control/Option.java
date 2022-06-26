package CaseStudy.control;

import CaseStudy.model.Car;
import CaseStudy.model.Motorcycle;
import CaseStudy.model.Truck;
import CaseStudy.service.impl.CarService;
import CaseStudy.service.impl.MotorcycleService;
import CaseStudy.service.impl.TruckService;

import java.util.Scanner;

public class Option {
    private static CarService carService = new CarService();
    private static TruckService truckService = new TruckService();
    private static MotorcycleService motorcycleService = new MotorcycleService();

    public static void displayMenu() {
        Scanner scanner = new Scanner(System.in);

        int choice;
        do {
            System.out.println("CHƯƠNG TRÌNH QUẢN LÝ PHƯƠNG TIỆN GIAO THÔNG" +
                    "\n 1. Hiện thị phương tiện. " +
                    "\n 2. Thêm mới phương tiện. " +
                    "\n 3. Xóa phương tiện. " +
                    "\n 4. Tìm kiếm theo biển kiểm soát." +
                    "\n 5. Thoát. " +
                    "\n Chọn chức năng. ");
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    System.out.println("Hiển thị phương tiện");
                    boolean flagDisplay = false;
                    do {
                        System.out.println("Chọn phương tiện bạn muốn hiển thị" +
                                "\n 1. Xe tải" +
                                "\n 2. Oto" +
                                "\n 3. Xe máy");
                        int vehicleChoice = Integer.parseInt(scanner.nextLine());
                        switch (vehicleChoice) {
                            case 1:
                                System.out.println("Danh sách xe tải");
                                truckService.display();
                                break;
                            case 2:
                                System.out.println("Danh sách oto");
                                carService.display();
                                break;
                            case 3:
                                System.out.println("Danh sách xe máy");
                                motorcycleService.display();
                                break;
                            default:
                                System.out.println("Bạn chọn sai");
                                flagDisplay = true;
                        }
                    } while (flagDisplay);

                    break;
                case 2:
                    System.out.println("Thêm mới phương tiện");
                    boolean flagAdd = false;
                    do {
                        System.out.println("Chọn loại phương tiện muốn thêm" +
                                "\n 1, Xe tải" +
                                "\n 2, oto" +
                                "\n 3, Xe máy");
                        int vehicleChoice = Integer.parseInt(scanner.nextLine());
                        switch (vehicleChoice) {
                            case 1:
                                System.out.println("Thêm Xe tải");
                                truckService.add();
                                break;
                            case 2:
                                System.out.println("Thêm oto");
                                carService.add();
                                break;
                            case 3:
                                System.out.println("Thêm xe máy");
                                motorcycleService.add();
                                break;
                            default:
                                System.out.println("Bạn chọn sai, hãy chọn lại");
                                flagAdd = true;
                        }
                    } while (flagAdd);

                    break;
                case 3:
                    System.out.println("Xóa phương tiện");
                    System.out.println("Nhập biển kiểm soát của xe muốn xóa");
                    String licensePlate = scanner.nextLine();
                    carService.delete(licensePlate);
                    motorcycleService.delete(licensePlate);
                    truckService.delete(licensePlate);
                    displayMenu();
//                    System.out.println("Xóa phương tiện");
//                    System.out.println("Nhập biển kiểm soát bạn muốn xóa");
//                    String licensePlate = scanner.nextLine();
//                    boolean confirm;
//
//                    Car carNeedDelete = carService.searchByLicensePlates(licensePlate);
//                    Truck truckNeedDelete = truckService.searchByLicensePlates(licensePlate);
//                    Motorcycle motorcycleNeedDelete = motorcycleService.searchByLicensePlates(licensePlate);
//
//                    if (carNeedDelete != null){
//                        System.out.println("Xác nhận xóa "+ truckNeedDelete + " ?");
//                        confirm = Boolean.parseBoolean(scanner.nextLine());
//                        if (confirm){
//                            carService.delete(licensePlate);
//                            System.out.println("Đã xóa thành công");
//                            carService.display();
//                        } else {
//                            displayMenu();
//                        }
//                    } else if (truckNeedDelete != null){
//                        System.out.println("Xác nhận xóa " + truckNeedDelete +" ?");
//                        confirm = Boolean.parseBoolean(scanner.nextLine());
//                        if (confirm){
//                            truckService.delete(licensePlate);
//                            truckService.display();
//                            System.out.println("Đã xóa thành công");
//                        } else {
//                            displayMenu();
//                        }
//                    } else if (motorcycleNeedDelete != null){
//                        confirm = Boolean.parseBoolean(scanner.nextLine());
//                        if (confirm){
//                            System.out.println("Xác nhận xóa " + motorcycleNeedDelete);
//                            motorcycleService.delete(licensePlate);
//                            motorcycleService.display();
//                            System.out.println("Đã xóa thành công");
//                        } else {
//                            displayMenu();
//                        }
//                    } else {
//                        System.out.println("Không tìm thấy xe có biển kiểm soát " + licensePlate);
//                    }

                    break;
                case 4:
                    System.out.println("Tìm kiếm theo biển kiểm soát");
                    String licensePlate1 = scanner.nextLine();
                    Car carNeedsearch = carService.searchByLicensePlates(licensePlate1);
                    Truck truckNeedsearch = truckService.searchByLicensePlates(licensePlate1);
                    Motorcycle motorcycleNeedsearch = motorcycleService.searchByLicensePlates(licensePlate1);
                    if (carNeedsearch != null) {
                        System.out.println(carNeedsearch);
                    } else if (truckNeedsearch != null) {
                        System.out.println(truckNeedsearch);
                    } else if (motorcycleNeedsearch != null) {
                        System.out.println(truckNeedsearch);
                    } else {
                        System.out.println("Không tìm thấy phương tiện có biển kiểm soát " + licensePlate1);
                    }
                    break;
                case 5:
                    System.exit(5);
                    break;
                default:
                    System.out.println("Chọn sai chức năng, hãy chọn lại");
            }
        } while (true);
    }
}
