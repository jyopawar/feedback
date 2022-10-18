package com.assess.Assess.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import com.assess.Assess.model.Trainer;
import com.assess.Assess.service.Trainerservice;

@Controller
public class Trainercontroller {
	
	@Autowired
	Trainerservice trainerservice;
	
	@GetMapping("/trainers/{id}")
	public @ResponseBody Trainer getTrainer(@PathVariable("id") int id) {
		return trainerservice.getTrainer(id);
	}
	
	@PostMapping("/trainer")
	public Trainer addTrainer(@RequestBody Trainer trainer) {
		return trainerservice.addTrainer(trainer);

}
}
