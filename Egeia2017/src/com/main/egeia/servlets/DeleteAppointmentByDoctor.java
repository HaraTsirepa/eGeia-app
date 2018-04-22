package com.main.egeia.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.dbconnection.java.DbConnection;
import com.main.egeia.services.DoctorService;
import com.main.egeia.services.DocAvailabilityService;

/**
 * Servlet implementation class DeleteAppointmentByDoctor
 */
@WebServlet("/DeleteAppointmentByDoctor")
public class DeleteAppointmentByDoctor extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DeleteAppointmentByDoctor() {
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

        String id = request.getParameter("Id");
		DocAvailabilityService service = new DocAvailabilityService();
		boolean res = service.DeleteAppointment(Integer.parseInt(id));
		//response.setContentType("application/json");  
		PrintWriter out = response.getWriter();
		out.print(res);
		out.flush();
		
	}

}
