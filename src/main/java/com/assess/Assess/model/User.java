package com.assess.Assess.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="user")
 public class User{
	  @Id
	  @GeneratedValue
		private int id;
	  @Column(name="username")
		private String Firstname; 
	    private String Lastname;
	    private String Email;
	    private int phone;
		private String password;
		private String confirmpassword;
		private String Role;

		public String getRole() {
			return Role;
		}
		public void setRole(String role) {
			Role = role;
		}
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getFirstname() {
			return Firstname;
		}
		public void setFirstname(String firstname) {
			Firstname = firstname;
		}
		public String getLastname() {
			return Lastname;
		}
		public void setLastname(String lastname) {
			Lastname = lastname;
		}
		public String getEmail() {
			return Email;
		}
		public void setEmail(String email) {
			Email = email;
		}
		public int getPhone() {
			return phone;
		}
		public void setPhone(int phone) {
			this.phone = phone;
		}
		public String getPassword() {
			return password;
		}
		public void setPassword(String password) {
			this.password = password;
		}
		public String getConfirmpassword() {
			return confirmpassword;
		}
		public void setConfirmpassword(String confirmpassword) {
			this.confirmpassword = confirmpassword;
		}
		
		public User() {
			
		}
		public User(int id, String firstname, String lastname, String email, int phone, String password,
				String confirmpassword,String role) {
			super();
			this.id = id;
			Firstname = firstname;
			Lastname = lastname;
			Email = email;
			this.phone = phone;
			this.password = password;
			this.confirmpassword = confirmpassword;
			this.Role=role;
		}

	   
	}




