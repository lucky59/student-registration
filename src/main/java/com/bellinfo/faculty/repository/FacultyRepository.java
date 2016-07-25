package com.bellinfo.faculty.repository;



import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.bellinfo.faculty.modal.FacultyRegistration;


@Repository
public class FacultyRepository {
	
	@Autowired
	SessionFactory sessionFactory;
	
	private Session getSession(){
		return sessionFactory.getCurrentSession();
	}
	
	public int saveFaculty(FacultyRegistration fac){
		int facId=((Integer)getSession().save(fac)).intValue();
		return facId;
		
	}
	
	public List<FacultyRegistration> listFacultyDetails(){
		
		Criteria facCriteria=getSession().createCriteria(FacultyRegistration.class);
		List<FacultyRegistration> facList=facCriteria.list();
		return facList;
		
	}
	
	public void updateFacultyDetails(FacultyRegistration fac){
		
		String hqlUpdate="update FacultyRegistration set name=:name, tech=:tech, email=:email where id=:id";
		Query query=getSession().createQuery(hqlUpdate);
		query.setInteger("id",fac.getId());
		query.setString("name",fac.getName());
		query.setString("email",fac.getEmail());
		query.setString("tech",fac.getTech());
		
		query.executeUpdate();
		
		
	}
	
	public FacultyRegistration getFacultyData(int id){
		
		FacultyRegistration  fac=(FacultyRegistration)getSession().get(FacultyRegistration.class,id);
		return fac;
		
	}
	
	public void deleteFacultyData(int id){
		String hqlDelete="Delete FacultyRegistration set name=:name, tech=:tech, email=:email where id=:id";
		Query query=getSession().createQuery(hqlDelete);
		query.setInteger("id",id);
		query.executeUpdate();
		
		
	}
	
	
	
	
	
	

}
