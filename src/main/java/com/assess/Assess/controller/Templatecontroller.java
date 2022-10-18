package com.assess.Assess.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.assess.Assess.model.Template;
import com.assess.Assess.service.Templateservice;
@Controller
public class Templatecontroller {
	
     @Autowired
	Templateservice templateservice;
   
     @GetMapping("/templates/{id}")
     public Template getTemplate(@PathVariable("id") int id) {
    	return templateservice.getTemplate(id);
     }
     
     @PostMapping("/template")
     public Template addTemplate(@RequestBody Template template) {
    	 return templateservice.addTemplate(template);
     }
     
}
