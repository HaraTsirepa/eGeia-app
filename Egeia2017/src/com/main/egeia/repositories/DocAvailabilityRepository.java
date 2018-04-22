package com.main.egeia.repositories;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.dbconnection.java.DbConnection;
import com.main.egeia.models.Availability;
import com.main.egeia.models.Doctor;

public class DocAvailabilityRepository {
	
	
	public boolean DeleteAppointment(int id)
	{
		boolean res = false;
		Connection conn = DbConnection.getMysqlConnection();
		String loginquery = "DELETE FROM docavailability WHERE id = ?";
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
	
	
	public int InsertAvailability(Availability availability)
	{
		
		int res = -1;
		String sql="insert into  docavailability(doctor_id,date,time)values(?,?,?)";
		Connection con=DbConnection.getMysqlConnection();
		PreparedStatement ps;
		try {
			ps = con.prepareStatement(sql);
			ps.setInt(1, availability.getDoctorId());
			ps.setString(2, availability.getDate());
			ps.setString(3, availability.getTime());
			res = ps.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return res;
		
	}
	
	public List<Availability> GetAppointments()
	{
		List<Availability> availabilities = new ArrayList<Availability>();
		
		String sql = "SELECT * FROM docavailability";
		Connection con=DbConnection.getMysqlConnection();
		PreparedStatement ps;
		try {
			ps = con.prepareStatement(sql);
			ResultSet result = ps.executeQuery();
			while(result.next())
			{
				Availability availability = new Availability();
				availability.setId(result.getInt("id"));
				availability.setDoctorId(result.getInt("doctor_id"));
				availability.setDate(result.getString("date"));
				availability.setTime(result.getString("time"));
				availabilities.add(availability);
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return availabilities;
	}
	
	public List<Availability> GetAppointments(int doctorId)
	{
		List<Availability> availabilities = new ArrayList<Availability>();
		
		String sql = "SELECT * FROM docavailability WHERE doctor_id = ?";
		Connection con=DbConnection.getMysqlConnection();
		PreparedStatement ps;
		try {
			ps = con.prepareStatement(sql);
			ps.setInt(1, doctorId);
			ResultSet result = ps.executeQuery();
			while(result.next())
			{
				Availability availability = new Availability();
				availability.setId(result.getInt("id"));
				availability.setDoctorId(result.getInt("doctor_id"));
				availability.setDate(result.getString("date"));
				availability.setTime(result.getString("time"));
				availabilities.add(availability);
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return availabilities;
	}

}
