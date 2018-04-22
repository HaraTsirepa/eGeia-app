package com.main.egeia.servlets;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dbconnection.java.DbConnection;
import com.main.egeia.utils.PasswordEncoder;
import com.main.egeia.utils.SessionUtils;

/**
 * Servlet implementation class AdminLogIn
 */
@WebServlet("/AdminLogIn")
public class AdminLogIn extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AdminLogIn() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String un = request.getParameter("uname");
		String pass=request.getParameter("password");
		Connection con= DbConnection.getMysqlConnection();
		Statement stmt=null;
		ResultSet rs =null;
		
		
		String sql="select * from admins where username='"+un+"' and password='"+
		PasswordEncoder.encode(pass)
		+"' ";
		if (con == null)
		{
			System.out.println("geiaaa");
		}
		try
		{
			System.out.println("sql :"+sql);
			stmt = con.createStatement();
			rs =stmt.executeQuery(sql);
			if(rs.next())
			{
			
				SessionUtils.setSessionUserType(request.getSession(true),"ADMIN");
				response.sendRedirect("AdminMenu.jsp");
				
			}
			else
			{
				response.sendRedirect("index.jsp");
				//response.sendRedirect("AddNewDoctorByAdmin.jsp");
			}
		}
		catch(SQLException ex)
		{
			ex.printStackTrace();
		}
	}

}
