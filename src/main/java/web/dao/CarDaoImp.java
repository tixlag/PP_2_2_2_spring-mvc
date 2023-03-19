package web.dao;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.Arrays;
import java.util.List;

@Component
public class CarDaoImp implements CarDao {

    private static int count;

    private List<Car> cars = Arrays.asList(new Car(++count, "AMW", 1),
            new Car(++count, "BMW", 2),
            new Car(++count, "CMW", 3),
            new Car(++count, "DMW", 4),
            new Car(++count, "EMW", 5));

    @Override
    public List<Car> get(int i) {
        return i < 1 ? cars : cars.stream().limit(i).toList();
    }

    @Override
    public Car getById(int id) {
        return cars.stream().filter(x -> x.getId() == id).findAny().orElse(null);
    }

    @Override
    public void add(Car car) {
        cars.add(car);
    }

    @Override
    public void create(List<Car> cars) {
        this.cars = cars;
    }
}
