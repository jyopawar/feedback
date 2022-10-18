package com.assess.Assess.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;


import com.assess.Assess.model.User;
import com.assess.Assess.service.Userservice;

	@Controller
	public class Usercontroller {
		
	    @Autowired
		Userservice userservice;
	    
	   @RequestMapping(value = "/registration")
	    public String home() {
	    	return "login";
	    }
		
		@GetMapping("/users/{id}")
		public @ResponseBody User getUser(@PathVariable("id") int id){
		 return userservice.getUser(id);
		}
		
		@PostMapping(value ="/user" ,consumes = {"application/x-www-form-urlencoded"})
		public @ResponseBody User addUser( User user) {
			return userservice.addUser(user);
		}

	}






