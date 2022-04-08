package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.service.CarsService;

import java.util.ArrayList;
import java.util.List;


@Controller
public class CarsController {

    @GetMapping(value = "/cars")
    public String printCars(@RequestParam(defaultValue = "5") int count, Model model) {
        List<Car> cars = new ArrayList<>();
        cars.add(new Car("car1", 1, "green"));
        cars.add(new Car("car2", 2, "red"));
        cars.add(new Car("car3", 3, "blue"));
        cars.add(new Car("car4", 4, "black"));
        cars.add(new Car("car5", 5, "white"));

        CarsService carsService = new CarsService(cars);
        model.addAttribute("count", carsService.getCarList(count));

        return "cars";
    }
}
