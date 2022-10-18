package com.assess.Assess.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.assess.Assess.model.Template;
import com.assess.Assess.repository.Templaterepository;

@Service
public class Templateservice {
	
    @Autowired
	Templaterepository templaterepository;

	public Template getTemplate(int id) {
		return templaterepository.findById(id).orElse(null);
	}

	public Template addTemplate(Template template) {
		// TODO Auto-generated method stub
		return templaterepository.save(template);
	}
}
