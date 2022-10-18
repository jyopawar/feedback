package com.assess.Assess.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.assess.Assess.model.Trainer;

@Repository
public interface Trainerrepository extends CrudRepository<Trainer,Integer>{

}
