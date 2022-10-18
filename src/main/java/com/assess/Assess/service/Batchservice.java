package com.assess.Assess.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.assess.Assess.model.Batch;
import com.assess.Assess.repository.Batchrepository;

 @Service
public class Batchservice {
     
	@Autowired
	Batchrepository batchrepository;

	public Batch getbatch(int id) {
	return batchrepository.findById(id).orElse(null);
	}

	public Batch addbatch(Batch batch) {
		return batchrepository.save(batch);
	}
	
}
