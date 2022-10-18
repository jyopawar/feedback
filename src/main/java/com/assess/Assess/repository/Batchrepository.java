package com.assess.Assess.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.assess.Assess.model.Batch;
 @Repository
public interface Batchrepository extends CrudRepository <Batch,Integer> {

}
