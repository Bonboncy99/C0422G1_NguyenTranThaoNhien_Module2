package CaseStudy.service;

import CaseStudy.model.Vehicle;

public interface Iservice {
    void display();
    void add();
    void delete(String licensePlate);
    Vehicle searchByLicensePlates(String licensePlate);

}
