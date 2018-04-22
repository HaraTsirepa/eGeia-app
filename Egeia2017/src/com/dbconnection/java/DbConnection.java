package com.dbconnection.java;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConnection {
	public static Connection getMysqlConnection()
	{
		String driver="com.mysql.jdbc.Driver";
		String url="jdbc:mysql://localhost:3306/egeiatelikhdb";
		String user="root";
		String pass="";
		Connection con=null;
		
		try{
			Class.forName(driver);
			con=DriverManager.getConnection(url,user,pass);
		}
		catch(ClassNotFoundException ex)
		{
			ex.printStackTrace();
		}
		catch(SQLException ex)
		{
			ex.printStackTrace();
		}
		return con;
	}

}
