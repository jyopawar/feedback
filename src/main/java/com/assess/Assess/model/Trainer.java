package com.assess.Assess.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Trainer {
	@Id
      int id;
      private String name;
      private String course;
      @ManyToOne
      private Template template;
      
	public Template getTemplate() {
		return template;
	}
	public void setTemplate(Template template) {
		this.template = template;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public Trainer() {
		
	}
	
	public Trainer(int id, String name, String course, Template template) {
		super();
		this.id = id;
		this.name = name;
		this.course = course;
		this.template=template;
	}
}
