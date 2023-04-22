package com.intecap.agenda.Repositories;

import com.intecap.agenda.models.carModel;
import org.springframework.data.repository.CrudRepository;

public interface CarRepository extends CrudRepository<carModel, Long> {
}
