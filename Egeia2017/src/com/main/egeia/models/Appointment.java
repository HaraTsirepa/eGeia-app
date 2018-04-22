package com.main.egeia.models;

public class Appointment {
	
	private int Id;
	private int DoctorId;
	private int PatientId;
	private String Date;
	private String Duration;
	private String Time;
	private int Price;
	
	
	public Appointment(int id,int doctorId,int patientId, String date, String duration,String time, int price)
	{
		super();
		Id = id;
		DoctorId = doctorId;
		PatientId=patientId;
		Date = date;
		Duration = duration;
		Time = time;
		Price = price;
	
	}


	public Appointment() {
		super();
		// TODO Auto-generated constructor stub
	}


	public String getTime() {
		return Time;
	}


	public void setTime(String time) {
		Time = time;
	}


	public int getId() {
		return Id;
	}


	public void setId(int id) {
		Id = id;
	}


	public int getDoctorId() {
		return DoctorId;
	}


	public void setDoctorId(int doctorId) {
		DoctorId = doctorId;
	}


	public int getPatientId() {
		return PatientId;
	}


	public void setPatientId(int patientId) {
		PatientId = patientId;
	}


	public String getDate() {
		return Date;
	}


	public void setDate(String date) {
		Date = date;
	}


	public String getDuration() {
		return Duration;
	}


	public void setDuration(String duration) {
		Duration = duration;
	}


	public int getPrice() {
		return Price;
	}


	public void setPrice(int price) {
		Price = price;
	}

}
