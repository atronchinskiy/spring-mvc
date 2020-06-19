package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Service ("carService")
public class CarService {
private List<Car> cars;

    public CarService() {
        cars = new ArrayList<>();
        cars.add(new Car("a", 11, 12));
        cars.add(new Car("b", 21, 22));
        cars.add(new Car("c", 31, 32));
    }

    public List<Car> getCars() {
        return cars;
    }

}
