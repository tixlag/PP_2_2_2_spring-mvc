package web.service;

import web.model.Car;

import java.util.List;

public interface CarService {

    List<Car> get(int i);
    Car getById(int id);

    void add(Car car);

    void create(List<Car> cars);

}
