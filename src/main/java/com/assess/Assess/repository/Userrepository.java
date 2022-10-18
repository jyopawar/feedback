package com.assess.Assess.repository;


	import org.springframework.data.repository.CrudRepository;
	import org.springframework.stereotype.Repository;

import com.assess.Assess.model.User;

	@Repository
	public interface Userrepository extends CrudRepository <User,Integer>{



	}


