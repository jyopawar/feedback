package com.assess.Assess.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.assess.Assess.model.Template;

@Repository
public interface Templaterepository extends CrudRepository <Template,Integer> {

}
