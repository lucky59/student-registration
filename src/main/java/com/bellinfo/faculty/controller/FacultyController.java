package com.bellinfo.faculty.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.bellinfo.faculty.modal.FacultyRegistration;
import com.bellinfo.faculty.service.FacultyServiceImpl;


@Controller
@RequestMapping(value="/")
public class FacultyController {
	
	@Autowired
	FacultyServiceImpl facultyServiceImpl;
	
	@RequestMapping(value="/faculty", method=RequestMethod.GET)//handler mapping
	public String getFaculty(Model model){
		FacultyRegistration fr=new FacultyRegistration();//here we are creating a dummy prj so that this will save the 
														//values and will return while calling the post method
		model.addAttribute("facReg", fr);//adding dummy object to model
		return "faculty-reg";
		}
	
	@RequestMapping(value="/faculty",method=RequestMethod.POST)
	public String saveFaculty(@Valid
			@ModelAttribute("facReg") FacultyRegistration facReg,BindingResult result,Model model){
		
		if(result.hasErrors()){
			return "faculty-reg";
		}
		//String name=facReg.getName();
		//String email=facReg.getEmail();
		//System.out.println("name "+" "+name+" "+"email "+" "+email);
		
		int id=facultyServiceImpl.saveFaculty(facReg);
		model.addAttribute("message", "Registration Success.This is your id");
		model.addAttribute("facId", id);
		return "success";
		
	}
	
	@RequestMapping(value="/list", method=RequestMethod.GET)
	public String listFacultyDetails(Model model){
		
		List<FacultyRegistration> facList=facultyServiceImpl.listFacultyDetails();
		model.addAttribute("facList",facList);
		return "fac-list";
		
	}
	
	@RequestMapping(value="/edit/{id}", method = RequestMethod.GET)
	public String getFacultyData(Model model, @PathVariable String id)
	{
		FacultyRegistration facReg=null;
		if(id!=null)
		{
			facReg = facultyServiceImpl.getFacultyData(new Integer(id).intValue());
		}
		model.addAttribute("facReg", facReg);
		return "edit-form";
	}
	
	@RequestMapping(value="/edit/{id}", method= RequestMethod.POST)
	public String updateFacultyData(Model model, @Valid @ModelAttribute("facReg") FacultyRegistration facReg, BindingResult result, @PathVariable Integer id) 
	{
	
		if(result.hasErrors())
		{
			return "edit-form";
		}
		
		facultyServiceImpl.updateFacultyDetails(facReg);
		model.addAttribute("message", "Successfully Updated Data for following Id");
		model.addAttribute("facId", id);
		return "success";
	
	}
}
