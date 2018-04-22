package com.main.egeia.models;

public class Availability {
	
	private int Id;
	private int DoctorId;
	private String Date;
	private String Time;
	
	
	public Availability(int id,int doctorId, String date, String time)
	{
		super();
		Id = id;
		DoctorId = doctorId;
		Date = date;
		Time = time;
	
	}
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getDate() {
		return Date;
	}
	public void setDate(String date) {
		Date = date;
	}
	public String getTime() {
		return Time;
	}
	public void setTime(String time) {
		Time = time;
	}
	public Availability() {
		// TODO Auto-generated constructor stub
	}
	public int getDoctorId() {
		return DoctorId;
	}
	public void setDoctorId(int doctorId) {
		this.DoctorId = doctorId;
	}
	
	

}
