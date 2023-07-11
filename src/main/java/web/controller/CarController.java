package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.CarService;

/**
 * @author Alfazard on 07.07.2023
 */
@Controller
public class CarController {
    private final CarService carService;

    public CarController(CarService carService) {
        this.carService = carService;
    }

    @GetMapping("/cars")
    public String getCarLimit(@RequestParam(value = "count", defaultValue = "5") int count, ModelMap model) {
        model.addAttribute("list", carService.getCars(count));
        return "cars";
    }
}
