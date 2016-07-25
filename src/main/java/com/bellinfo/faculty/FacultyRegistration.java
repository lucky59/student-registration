package com.bellinfo.faculty;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotBlank;

public class FacultyRegistration {
	@NotNull
	@NotBlank//it gives a msg at the UI part that msg cannot be empty
	@Size(min=2,max=10)//here the error msg like name must be between 2 to 10 in UI i will display default msg
	//we are writing our customized message in messages.properties in the resources folder 
	private String name;
	@Email
	@NotBlank
	private String email;
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
		return "FacultyRegistration [name=" + name + ", email=" + email + "]";
	}
	

}
