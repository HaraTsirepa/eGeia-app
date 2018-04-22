package com.main.egeia.services;

import java.util.List;

import com.main.egeia.models.Appointment;
import com.main.egeia.models.Availability;
import com.main.egeia.models.Doctor;
import com.main.egeia.repositories.AppointmentRepository;
import com.main.egeia.repositories.DocAvailabilityRepository;

public class AppointmentService {
	
	private AppointmentRepository repo = new AppointmentRepository();
	
	
	public boolean DeleteAppointment(int id)
	   {
	 	boolean res = false;
		if( id < 0 ) 
			return res;
		
		 return repo.DeleteAppointment(id);
	   }

	
	public List<Appointment> GetAppointments()
	{
		return repo.GetAppointments();
	}
	
	public int InsertAppointment(Appointment appointment)
	{
		int res = -1;
		if( appointment == null) return res;
		res = repo.InsertAppointment(appointment);
		return res;
	}
	
	
	public List<Appointment> GetAppointments(int patientId)
	{
		List<Appointment> appointments = null;
		if(patientId < 0) return appointments;
		appointments = repo.GetAppointments(patientId);
		return appointments;
	}

}
