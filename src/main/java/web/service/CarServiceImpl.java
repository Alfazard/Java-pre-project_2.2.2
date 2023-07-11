package web.service;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

import static java.util.stream.Collectors.*;

/**
 * @author Alfazard on 07.07.2023
 */
@Component
public class CarServiceImpl implements CarService {

    private final List<Car> cars = new ArrayList<>();

    {
        cars.add(new Car("Maserati", "red", 2020));
        cars.add(new Car("Bentley", "blue", 2018));
        cars.add(new Car("Ferrari", "yellow", 2023));
        cars.add(new Car("Bugatti", "white", 2019));
        cars.add(new Car("Lamborghini", "green", 2015));
    }
    @Override
    public List<Car> getCars(int count) {
        return cars.stream().limit(count).collect(toList());
    }
}
