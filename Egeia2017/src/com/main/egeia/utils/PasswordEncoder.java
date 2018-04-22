package com.main.egeia.utils;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class PasswordEncoder {
	//kathe fora p o xrhsths kanei log in 
		//pername apo ena hashing operation gia na einai pio asfalhs
		public static String encode(String password)
		{
			MessageDigest md;
			String str = "";
			try {
				md = MessageDigest.getInstance("SHA-256");
				md.update(password.getBytes("UTF-8")); // Change this to "UTF-16" if needed
				byte[] digest = md.digest();
				str = String.format("%064x", new java.math.BigInteger(1, digest));

			} catch (NoSuchAlgorithmException | UnsupportedEncodingException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			return str;
			
		}

}
