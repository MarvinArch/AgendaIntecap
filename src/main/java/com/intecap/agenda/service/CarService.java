package com.intecap.agenda.service;

import com.intecap.agenda.Repositories.CarRepository;
import com.intecap.agenda.models.Alumno;
import com.intecap.agenda.models.carModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class CarService {

    @Autowired
    CarRepository  carRepository;

    public List<carModel> getAll(){
        return (ArrayList<carModel>)carRepository.findAll();
    }

    public carModel saveUpdate(carModel carModel){
        return carRepository.save(carModel);
    }
}
