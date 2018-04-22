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
import com.main.egeia.models.Patient;
import com.main.egeia.services.DoctorService;
import com.main.egeia.services.PatientService;
import com.main.egeia.utils.SessionUtils;

/**
 * Servlet implementation class PatientLogIn
 */
@WebServlet("/PatientLogIn")
public class PatientLogIn extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private PatientService service = new PatientService();
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public PatientLogIn() {
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
		
		Patient pat = service.Login(username, password);
		if( pat != null )
		{
			HttpSession session = request.getSession(true); 
			SessionUtils.setSessionUserId(session, pat.getId());
			response.sendRedirect("PatientMenu.jsp");
		} else 
		{
			response.sendRedirect("WelcomePatient.jsp");
		}
			
	}
	}


