package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.service.CarService;

import java.util.List;

/**
 * @author Alfazard on 07.07.2023
 */
@Controller
public class CarController {
    private final CarService carService;

    public CarController(CarService carService) {
        this.carService = carService;
    }

    public String getCars(ModelMap model) {
        model.addAttribute("list", carService.getCars());
        return "cars";
    }

    @GetMapping("/cars")
    public String getCarLimit(@RequestParam(defaultValue = "0") int count, ModelMap model) {
        List<Car> cars = carService.getCars();
        if(count > 0 && count <= cars.size()) {
            cars = cars.subList(0, count);
        }
        model.addAttribute("list", cars);
        return "cars";
    }
}
