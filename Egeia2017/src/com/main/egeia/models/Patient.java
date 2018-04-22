package com.main.egeia.models;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Patient {
	
	private int Id;
	
	private String FirstName;
	private String LastName;
	private String Username;
	private String Password;
	private String Email;
	private String Gender;
	private String Amka;
	private int Age;
	
	
	
	public Patient(int id, String firstName, String lastName, String username, String password, String email,
			String gender, String amka,int age)
	{
		super();
		Id = id;
		FirstName = firstName;
		LastName = lastName;
		Username = username;
		Password = password;
		Email = email;
		Gender = gender;
		Amka = amka;
		Age = age;
		
		
	}
	public Patient() {
		// TODO Auto-generated constructor stub
	}
	



	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getFirstName() {
		return FirstName;
	}
	public void setFirstName(String firstName) {
		FirstName = firstName;
	}
	public String getLastName() {
		return LastName;
	}
	public void setLastName(String lastName) {
		LastName = lastName;
	}
	public String getUsername() {
		return Username;
	}
	public void setUsername(String username) {
		Username = username;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public String getGender() {
		return Gender;
	}
	public void setGender(String gender) {
		Gender = gender;
	}
	public String getAmka() {
		return Amka;
	}
	public void setAmka(String amka) {
		Amka = amka;
	}
	public int getAge() {
		return Age;
	}
	public void setAge(int age) {
		Age = age;
	}
	
	
	/*λιστα γιατι κανουμε implement καποιες functions, όμως στη πορεία θα πανε στα 
	repositories kai services 
	Χρησιμοποιύμε λίστα γιατί ένας patient μπορεί την ίδια μέρα να έχει πχ. ραντεβού
	3 διαφορετικούς γιατρούς
	*/

	public List<Appointment> DoctorAvailability(Doctor doctor)
	{
		//System.out.println("Searching for Doctor" + doctor.getName());
		return new ArrayList<>();
		
	}
	//enas patient mporei na exei me 3 diaforetikous doctros rantebou

	public List<Appointment> GetMyAppointment()
	{
		return new ArrayList<>();
	}
	
	public List<Appointment> GetPastAppontments()
	{
		return new ArrayList<>();
	}
	
	
	
	
	
	
	
}
