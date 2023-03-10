package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.CarService;

@Controller
public class CarsController {
    CarService carService;

    @Autowired
    public CarsController(CarService carService) {
        this.carService = carService;
    }

    @GetMapping("/cars")
    public String viewLimitCar(@RequestParam("count") int count, ModelMap model) {
        model.addAttribute("cars",
                count < 1 ? carService.getAll() : carService.getTo(count));
        return "cars";
    }
}
