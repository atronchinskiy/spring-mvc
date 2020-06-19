package web.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import web.config.WebConfig;
import web.model.Car;
import web.service.CarService;

import java.util.List;

@Controller
@RequestMapping("/")
@ComponentScan("web.service")
public class CarController {

    @Autowired
    private CarService carService;

    @RequestMapping(
                value = "cars",
                params = "locale",
                method = RequestMethod.GET)
    public String carPage(ModelMap modelMap, @RequestParam("locale") String loc) {
        List<Car> carList = carService.getCars();
        modelMap.addAttribute("cars", carList);
        modelMap.addAttribute("locale", loc);
        return "cars";
    }
}
