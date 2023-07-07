package web.service;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Alfazard on 07.07.2023
 */
@Component
public class CarServiceImpl implements CarService {
    @Override
    public List<Car> getCars() {
        List<Car> cars = new ArrayList<>();
        cars.add(new Car("Maserati", "red", 2020));
        cars.add(new Car("Bentley", "blue", 2018));
        cars.add(new Car("Ferrari", "yellow", 2023));
        cars.add(new Car("Bugatti", "white", 2019));
        cars.add(new Car("Lamborghini", "green", 2015));

        return cars;
    }
}
