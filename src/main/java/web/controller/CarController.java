package web.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.service.CarService;

import java.util.List;

@Controller
@RequestMapping("/")
public class CarController {

    @RequestMapping(
                value = "cars",
                params = "locale",
                method = RequestMethod.GET)
    public String carPage(ModelMap modelMap, @RequestParam("locale") String loc) {
        CarService carService = new CarService();
        List<Car> carList = carService.getCars();
        modelMap.addAttribute("cars", carList);
        modelMap.addAttribute("locale", loc);
        return "cars";
    }
}
