package com.main.egeia.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.main.egeia.models.Appointment;
import com.main.egeia.models.Availability;
import com.main.egeia.models.Doctor;
import com.main.egeia.services.AppointmentService;
import com.main.egeia.services.DocAvailabilityService;
import com.main.egeia.services.DoctorService;
import com.main.egeia.utils.SessionUtils;

/**
 * Servlet implementation class PatientDate
 */
@WebServlet("/PatientDate")
public class PatientDate extends HttpServlet {
	private static final long serialVersionUID = 1L;
    private AppointmentService service = new AppointmentService();
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public PatientDate() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		response.sendRedirect("DoctorAvailability.jsp");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		int doctorId= Integer.parseInt(request.getParameter("doctorId"));
		int patientId= Integer.parseInt(request.getParameter("patientId"));
		String date = request.getParameter("date");
		String duration = request.getParameter("duration");
		String time = request.getParameter("time");
		int price= Integer.parseInt(request.getParameter("price"));
		
		Appointment appointment = new Appointment (0,doctorId,patientId,date,duration,time,price);
		AppointmentService service = new AppointmentService();
		int res = service.InsertAppointment(appointment);
		
		if( res > -1 )
			response.getWriter().append("Succesfully inserted doctor with id : " + appointment.getId());
		else
			response.getWriter().append("Unuccesfully inserted doctor with");
	}

}
