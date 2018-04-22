package com.main.egeia.models;

public class Doctor {

	private int Id;
	
	private String FirstName;
	private String LastName;
	private String Username;
	private String Password;
	private String Email;
	private String Speciality;
	private String Gender;
	
	
	
	public Doctor(int id, String firstName, String lastName, String username, String password, String email,
			String specialty, String gender)
	{
		super();
		Id = id;
		FirstName = firstName;
		LastName = lastName;
		Username = username;
		Password = password;
		Email = email;
		Speciality = specialty;
		Gender = gender;
	}
	public Doctor() {
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
	public String getSpeciality() {
		return Speciality;
	}
	public void setSpeciality(String specialty) {
		Speciality = specialty;
	}
	public String getGender() {
		return Gender;
	}
	public void setGender(String gender) {
		Gender = gender;
	}

	
	
	
	
	
	
}

