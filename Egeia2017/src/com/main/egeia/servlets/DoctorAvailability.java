package com.main.egeia.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.main.egeia.models.Availability;
import com.main.egeia.models.UserType.Type;
import com.main.egeia.services.DocAvailabilityService;
import com.main.egeia.utils.SessionUtils;

/**
 * Servlet implementation class DoctorAvailability
 */
@WebServlet("/DoctorAvailability")
public class DoctorAvailability extends HttpServlet {
	private static final long serialVersionUID = 1L;
    private DocAvailabilityService service = new DocAvailabilityService();
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DoctorAvailability() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		
		SessionUtils.checkTypePermission(request, response, Type.DOCTOR, "index.jsp");
		response.sendRedirect("DoctorAvailability.jsp");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String date = request.getParameter("date");
		String time = request.getParameter("time");
		
		HttpSession session = request.getSession();
		
		Availability avail = new Availability();
		avail.setDate(date);
		avail.setTime(time);
		avail.setDoctorId(SessionUtils.getSessionUserId(session));
		
		int res = service.InsertAvailability(avail);
		if( res >= 0 )
		{
			response.sendRedirect("DoctorAvailability.jsp");
		} else 
		{
			response.getWriter().append("Error at inserting value. Please try again later.").append(request.getContextPath());
		}
		
		
	}

}
