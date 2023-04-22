package com.intecap.agenda.controllers;

import com.intecap.agenda.models.carModel;
import com.intecap.agenda.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/car")
public class CarController {
    @Autowired
    CarService carService;

    @GetMapping("")
    public List<carModel> getAll(){
       return  carService.getAll();
    }

    @PostMapping("")
    public carModel saveCar(@RequestBody carModel carModel){
        return carService.saveUpdate(carModel);
    }
}
