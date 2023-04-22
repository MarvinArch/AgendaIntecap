package com.intecap.agenda.service;

import com.intecap.agenda.Repositories.AlumnosRepository;
import com.intecap.agenda.models.Alumno;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class AlumnosService  {
    @Autowired
    AlumnosRepository alumnosRepository;

    public List<Alumno> findAll(){
        return (ArrayList<Alumno>)alumnosRepository.findAll();
    }

    public Alumno saveUpdate(Alumno alumno){
        return alumnosRepository.save(alumno);
    }
}
