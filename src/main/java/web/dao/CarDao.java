package web.dao;

import web.model.Car;

import java.util.List;

public interface CarDao {
    List<Car> get(int i);
    Car getById(int id);
    void add(Car car);

    void create(List<Car> cars);
}
