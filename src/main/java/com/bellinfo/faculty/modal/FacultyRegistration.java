package com.bellinfo.faculty.modal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotBlank;

@Entity//make object eligible to go into database
@Table(name="Fac_Reg")
public class FacultyRegistration {
	
	@Id//for table fac_reg this id this primary key
	@GeneratedValue(strategy = GenerationType.IDENTITY)//here we are passing the generator value and name as identity
	@Column(name="FAC_ID")
	private int id;
	
	@NotNull
	@NotBlank//it gives a msg at the UI part that msg cannot be empty
	@Size(min=2,max=10)//here the error msg like name must be between 2 to 10 in UI i will display default msg
	//we are writing our customized message in messages.properties in the resources folder
	@Column(name="FAC_NAME")
	private String name;
	
	@Email
	@NotBlank
	@Column(name="FAC_EMAIL")
	private String email;
	
	
	@Column(name="FAC_TECH")
	private String tech;
	
	
	//setters,getters and tostring()
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTech() {
		return tech;
	}
	public void setTech(String tech) {
		this.tech = tech;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "FacultyRegistration [id=" + id + ", name=" + name + ", email="
				+ email + ", tech=" + tech + "]";
	}
	
	

}


