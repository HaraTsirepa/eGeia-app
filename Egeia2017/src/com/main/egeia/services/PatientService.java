package com.main.egeia.services;

import java.util.List;

import com.main.egeia.models.Doctor;
import com.main.egeia.models.Patient;
import com.main.egeia.repositories.DoctorRepository;
import com.main.egeia.repositories.PatientRepository;

public class PatientService {
	
private PatientRepository repo = new PatientRepository();
	

	
	public int InsertPatient(Patient patient)
	{
		int res = -1;
		if( patient.getFirstName().isEmpty() || 
				patient.getLastName().isEmpty() ||
				patient.getEmail().isEmpty() || 
				patient.getGender().isEmpty() ||
				patient.getPassword().isEmpty() ||
				patient.getUsername().isEmpty() ||
				patient.getAmka().isEmpty() 
		  )
			return res;
		
		return repo.InsertPatient(patient);
	}
	
	
	public Patient Login(String username, String password)
	{
		Patient pat = null;
		if( username.isEmpty() || password.isEmpty() ) return pat;
		pat = repo.Login(username, password);
		return pat;
	}
	

	
	public Patient GetPatient(int id)
	{
		Patient pat = null;
		if (id > 0 ) return pat;
		pat = repo.GetPatient(id);
		return pat;
	}

}
