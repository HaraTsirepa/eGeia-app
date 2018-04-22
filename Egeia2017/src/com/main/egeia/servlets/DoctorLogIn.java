package com.main.egeia.servlets;

import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.dbconnection.java.DbConnection;
import com.main.egeia.models.Doctor;
import com.main.egeia.services.DoctorService;
import com.main.egeia.utils.SessionUtils;

/**
 * Servlet implementation class DoctorLogIn
 */
@WebServlet("/DoctorLogIn")
public class DoctorLogIn extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	private DoctorService service = new DoctorService();
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DoctorLogIn() {
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
		String username = request.getParameter("uname");
		String password =request.getParameter("password");
		
		Doctor doc = service.Login(username, password);
		if( doc != null )
		{
			HttpSession session = request.getSession(true); 
			SessionUtils.setSessionUserId(session, doc.getId());
			response.sendRedirect("DoctorMenu.jsp");
		} else 
		{
			response.sendRedirect("WelcomeDoctor.jsp");
		}
			
	}
}


