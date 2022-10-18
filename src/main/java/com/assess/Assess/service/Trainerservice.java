package com.assess.Assess.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.assess.Assess.model.Trainer;
import com.assess.Assess.repository.Trainerrepository;
@Service
public class Trainerservice {
	
	@Autowired
	Trainerrepository trainerrepository;

	public Trainer getTrainer(int id) {
	return trainerrepository.findById(id).orElse(null);
	}

	public Trainer addTrainer(Trainer trainer) {
		return trainerrepository.save(trainer);
	}

}
