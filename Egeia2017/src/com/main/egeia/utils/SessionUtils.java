package com.main.egeia.utils;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.main.egeia.models.UserType;
import com.main.egeia.models.UserType.Type;

public class SessionUtils {

	
	public static String userId = "id";
	public static String userType = "type";
	
	public static void setSessionUserId(HttpSession session, int id)
	{
		if ( session == null || id < 0) return;
		session.setAttribute(userId, id);
	}
	
	public static void setSessionUserType(HttpSession session, String type)
	{
		if ( session == null || type.isEmpty()) return;
		Type usr_type = getUserType(type);
		if( usr_type != null)
			session.setAttribute(userType, usr_type);
	}
	
	public static int getSessionUserId(HttpSession session)
	{
		if ( session == null) return 0;
		return (int)session.getAttribute(userId);
	}
	
	public static Type getUserType(String type)
	{
		if( type == null || type.isEmpty() ) return null;
		type = type.toUpperCase();
		return UserType.create().getUserType(type);
	}
	
	public static void checkTypePermission(HttpServletRequest request, HttpServletResponse response, Type type, String jsp) throws IOException
	{
		HttpSession session = request.getSession();
		Type usertype = (Type) session.getAttribute(userType);
		if( usertype != null || usertype != type)
			response.sendRedirect(response.encodeRedirectURL(request.getContextPath() + jsp));

	}
}
