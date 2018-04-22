package com.main.egeia.services;

import java.util.List;

import com.main.egeia.models.Doctor;
import com.main.egeia.repositories.DoctorRepository;
import com.main.egeia.utils.PasswordEncoder;

public class DoctorService {

	private DoctorRepository repo = new DoctorRepository();
	
	public boolean DeleteDoctor(int id)
	{
		boolean res = false;
		if( id < 0 ) 
			return res;
		
		return repo.DeleteDoctor(id);
	}
	
	public int InsertDoctor(Doctor doctor)
	{
		int res = -1;
		if( doctor.getFirstName().isEmpty() || 
			doctor.getLastName().isEmpty() ||
			doctor.getEmail().isEmpty() || 
			doctor.getSpeciality().isEmpty() ||
			doctor.getGender().isEmpty() ||
			doctor.getPassword().isEmpty() 
		  )
			return res;
		
		if( doctor.getPassword().length() < 64)
			//Need to hash password - Dummy check
			doctor.setPassword(PasswordEncoder.encode(doctor.getPassword()));
		return repo.InsertDoctor(doctor);
	}
	
	public List<Doctor> GetDoctors()
	{
		return repo.GetDoctors();
	}
	
	public Doctor GetDoctor(int id)
	{
		Doctor doc = null;
		if (id > 0 ) return doc;
		doc = repo.GetDoctor(id);
		return doc;
	}
	
	public Doctor Login(String username, String password)
	{
		Doctor doc = null;
		if( username.isEmpty() || password.isEmpty() ) return doc;
		//Needs to hash it
		String hashed_pass = PasswordEncoder.encode(password);
		doc = repo.Login(username, hashed_pass);
		return doc;
	}
}
