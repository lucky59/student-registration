package com.bellinfo.faculty.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.bellinfo.faculty.modal.FacultyRegistration;
import com.bellinfo.faculty.repository.FacultyRepository;



@Service
@Transactional
public class FacultyServiceImpl {
	
	@Autowired
	FacultyRepository facultyRepository;
	
	
	public int saveFaculty(FacultyRegistration fac){
		return facultyRepository.saveFaculty(fac);
		
	}
	
	public List<FacultyRegistration> listFacultyDetails(){
		return facultyRepository.listFacultyDetails();
		
	}
	
	
	public void updateFacultyDetails(FacultyRegistration fac){
		facultyRepository.updateFacultyDetails(fac);
	}
	
	
	public FacultyRegistration getFacultyData(int id){
		return facultyRepository.getFacultyData(id);
		
	}
	
	public void deleteFacultyData(int id){
		facultyRepository.deleteFacultyData(id);
	}

}
