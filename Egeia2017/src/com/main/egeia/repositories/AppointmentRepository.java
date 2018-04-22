package com.main.egeia.repositories;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.dbconnection.java.DbConnection;
import com.main.egeia.models.Appointment;
import com.main.egeia.models.Availability;
import com.main.egeia.models.Appointment;

public class AppointmentRepository {
	
	public boolean DeleteAppointment(int id)
	{
		boolean res = false;
		Connection conn = DbConnection.getMysqlConnection();
		String loginquery = "DELETE FROM appointments WHERE id = ?";
		try {
			PreparedStatement pstmt = conn.prepareStatement(loginquery);
			pstmt.setInt(1, id);
			res = pstmt.executeUpdate() == 0;
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return res;
		
	}
	
	
	
	public int InsertAppointment(Appointment appointment)
	{
		
		int res = -1;
		String sql="insert into  appointments(doctor_id,patient_id,appointment_date,duration,time,price)values(?,?,?,?,?,?)";
		Connection con=DbConnection.getMysqlConnection();
		PreparedStatement ps;
		try {
			ps = con.prepareStatement(sql);
			ps.setInt(1, appointment.getDoctorId());
			ps.setInt(2, appointment.getPatientId());
			ps.setString(3, appointment.getDate());
			ps.setString(4, appointment.getDuration());
			ps.setString(5, appointment.getTime());
			res = ps.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return res;
		
	}
	
	
	
	public List<Appointment> GetAppointments()
	{
		List<Appointment> appointments = new ArrayList<>();
		
		String sql = "SELECT * FROM appointments";
		Connection con=DbConnection.getMysqlConnection();
		PreparedStatement ps;
		try {
			ps = con.prepareStatement(sql);
			ResultSet result = ps.executeQuery();
			while(result.next())
			{
				Appointment appointment = new Appointment();
				appointment.setId(result.getInt("id"));
				appointment.setDate(result.getString("date"));
				appointment.setTime(result.getString("time"));
				appointments.add(appointment);
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return appointments;
	}
	
	public List<Appointment> GetAppointments(int patientId)
	{
		List<Appointment> appointments = new ArrayList<>();
		
		String sql = "SELECT * FROM appointments where patient_id=?";
		Connection con=DbConnection.getMysqlConnection();
		PreparedStatement ps;
		try {
			ps = con.prepareStatement(sql);
			ps.setInt(1, patientId);
			ResultSet result = ps.executeQuery();
			while(result.next())
			{
				Appointment appointment = new Appointment();
				appointment.setId(result.getInt("id"));
				
				appointments.add(appointment);
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return appointments;
	}
	
	
}
