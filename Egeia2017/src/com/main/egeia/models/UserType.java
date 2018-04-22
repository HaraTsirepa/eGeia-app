package com.main.egeia.models;

import com.main.egeia.models.UserType.Type;

public class UserType {
	//xrhsimopoiume enum type
		// wste an kanoume allages sto type
		// na mh xreiastei na kanoume pantoy allages kai ephreasoume th logikh
		public enum Type { PATIENT, ADMIN, DOCTOR }
		

		private UserType() {
		}
		
		public static UserType create()
		{
			return new UserType();
		}
		
		public Type getUserType(String usrType){
			
			Type usr = null;
			switch(usrType)
			{
			case "ADMIN":            
				usr = Type.ADMIN;
				break;
			case "PATIENT":
				usr = Type.PATIENT;
				break;
			case "DOCTOR":
				usr = Type.DOCTOR;
				break;
			}
			return usr;
				
		}
		
		

}
