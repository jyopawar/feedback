package com.assess.Assess.model;

import java.sql.Time;
import java.util.*;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
public class Batch {
	@Id
	private String title;
	private String coursename;
	@Temporal(TemporalType.DATE)
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date date;
	@Temporal(TemporalType.DATE)
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date enddate;
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getcoursename() {
		return coursename;
	}
	public void setcoursename(String coursename) {
		 this.coursename = coursename;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public Date getenddate() {
		return enddate;
	}
	public void setenddate(Date enddate) {
		 this.enddate = enddate;
	}
	public Batch() {
		
	}
	public Batch(String title, String coursename, Date date, Date enddate) {
		super();
		this.title = title;
		this.coursename = coursename;
		this.date = date;
		this.enddate = enddate;
	}
	
}

