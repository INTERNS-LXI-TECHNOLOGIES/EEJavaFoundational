package com.ashik.servlet;
import java.io.*;
import java.util.*;
import javax.servlet.*;
import javax.servlet.http.*;
import com.ashik.repository.*;
import com.ashik.model.*;
public class AddServlet extends HttpServlet
{
	
	public void doGet(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException
	{
		try
		{
			UserDatabase db = new UserDatabase();
			ArrayList<User> users = new ArrayList<User>();
			User userAFS = new User();				
			userAFS.setNameAFS(request.getParameter("user"));
			userAFS.setPhnumberAFS(request.getParameter("phnumber"));
			userAFS.setAdressAFS(request.getParameter("address"));
			userAFS.setVhnumberAFS(request.getParameter("vhnumber"));
			userAFS.setVhtypeAFS(request.getParameter("vhtype"));
			userAFS.setStartinglAFS(request.getParameter("slocation"));
			userAFS.setDestinationAFS(request.getParameter("destination"));
			userAFS.setSdateAFS(request.getParameter("sdate"));
			userAFS.setEdateAFS(request.getParameter("edate"));
			userAFS.setPassengerAFS(request.getParameter("copsnger"));
			userAFS.setRelationAFS(request.getParameter("relation"));
			userAFS.setReasonAFS(request.getParameter("reason"));
			userAFS.setFlagAFS(0);
			db.addToDatabase(userAFS);
			response.sendRedirect("add.html");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}	