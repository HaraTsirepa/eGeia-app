package com.main.egeia.models;

public class Users {
	//κάναμε τροποποίηση και βάλαμε στα strings protected και γι αυτό προσθέσαμε
		//τυπικούς getters kai setters
		
		protected String Username;
		protected String FirstName;
		protected String Lastname;
		protected String Surname;
		protected String Password;
		protected String Email;
		protected String Age;
		
		
		
		
		public String getUsername() {
			return Username;
		}
		public void setUsername(String username) {
			Username = username;
		}
		public String getSurname() {
			return Surname;
		}
		public void setSurname(String surname) {
			Surname = surname;
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
		public String getAge() {
			return Age;
		}
		public void setAge(String age) {
			Age = age;
		}
		
		
}
