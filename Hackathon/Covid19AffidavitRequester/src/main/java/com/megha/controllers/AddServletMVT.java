package com.megha.controllers;
import java.io.*;
import java.util.*;
import javax.servlet.*;
import javax.servlet.http.*;
import com.megha.repository.*;
import com.megha.models.*;

public class AddServletMVT extends HttpServlet
{
	public void doPost(HttpServletRequest request,HttpServletResponse response)throws ServletException,IOException
	{
		RequestMVT rmvt=new RequestMVT();
		SqlRepositoryMVT repo=new SqlRepositoryMVT();
		
		rmvt.setName(request.getParameter("name"));
		rmvt.setPhnNo(request.getParameter("phnNo"));
		rmvt.setAddress(request.getParameter("address"));
		rmvt.setVehicleNO(request.getParameter("vehicleNO"));
		rmvt.setVehicleType(request.getParameter("vehicleType"));
		rmvt.setStartingLocation(request.getParameter("startingLocation"));
		rmvt.setDestination(request.getParameter("destination"));
		rmvt.setStartingTime(request.getParameter("startingTime"));
		rmvt.setStartingDate(request.getParameter("startingDate"));
		rmvt.setEndingTime(request.getParameter("endingTime"));
		rmvt.setEndingDate(request.getParameter("endingDate"));
		rmvt.setCoPassengerName(request.getParameter("coPassengerName"));
		rmvt.setRelation(request.getParameter("relation"));
		rmvt.setReason(request.getParameter("reason"));
		repo.insertRequest(rmvt);
		request.setAttribute("request",rmvt);
		RequestDispatcher rd=request.getRequestDispatcher("View.jsp");
		rd.forward(request,response);
	}
}