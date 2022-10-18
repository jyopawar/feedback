package com.assess.Assess.service;


	import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.stereotype.Service;

import com.assess.Assess.model.User;
import com.assess.Assess.repository.Userrepository;

	@Service
	public class Userservice {


			@Autowired
			Userrepository userrepository;
			
			public User getUser(int id) {
				return userrepository.findById(id).orElse(null);
			}
			public User addUser(User user) {
				return userrepository.save(user);
			}

	}


