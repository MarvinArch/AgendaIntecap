package com.intecap.agenda.controllers;

import com.intecap.agenda.models.Alumno;
import com.intecap.agenda.service.AlumnosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/alumnos")
public class AlumnosController {
    @Autowired
    AlumnosService alumnosService;
    @GetMapping()
    public List<Alumno> getAll(){
        return alumnosService.findAll();
    }

    @PostMapping()
    public ResponseEntity<Alumno> saveUpdate(@RequestBody Alumno alumno){
        System.out.println(alumno.toString());
        return new ResponseEntity<>(alumnosService.saveUpdate(alumno), HttpStatus.CREATED);
    }
}
