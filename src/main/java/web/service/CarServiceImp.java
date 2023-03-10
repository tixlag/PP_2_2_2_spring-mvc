package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import web.dao.CarDao;
import web.model.Car;

import java.util.List;

@Service
public class CarServiceImp implements CarService {

    CarDao carDao;

    @Autowired
    public CarServiceImp(CarDao cardao) {
        this.carDao = cardao;
    }

    @Override
    public List<Car> getAll() {
        return carDao.getAll();
    }

    @Override
    public List<Car> getTo(int i) {
        return carDao.getTo(i);
    }

    @Override
    public Car getById(int id) {
        return carDao.getById(id);
    }

    @Override
    public void add(Car car) {
        carDao.add(car);
    }

    @Override
    public void create(List<Car> cars) {
        carDao.create(cars);
    }
}
