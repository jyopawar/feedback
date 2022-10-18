package com.assess.Assess.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Template {
	@Id
	int id;
	private String title;
	@ManyToOne
	private User user;
	@OneToMany(mappedBy = "template")
	private List <Trainer> trainers;
	
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}

	public List<Trainer> getTrainers() {
		return trainers;
	}
	public void setTrainers(List<Trainer> trainers) {
		this.trainers = trainers;
	}
	 public Template() {
		 
	 }
	public Template(int id, String title, User user, List<Trainer> trainers) {
		super();
		this.id = id;
		this.title = title;
		this.user = user;
		this.trainers = trainers;
	}
	@Override
	public String toString() {
		return "Template [id=" + id + ", title=" + title + ", user=" + user + ", trainers=" + trainers + "]";
	}

}
