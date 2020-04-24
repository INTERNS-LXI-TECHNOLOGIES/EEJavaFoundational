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
		
		rmvt.setNameMVT(request.getParameter("nameMVT"));
		rmvt.setPhnNoMVT(request.getParameter("phnNoMVT"));
		rmvt.setAddressMVT(request.getParameter("addressMVT"));
		rmvt.setVehicleNoMVT(request.getParameter("vehicleNoMVT"));
		rmvt.setVehicleTypeMVT(request.getParameter("vehicleTypeMVT"));
		rmvt.setStartingLocationMVT(request.getParameter("startingLocationMVT"));
		rmvt.setDestinationMVT(request.getParameter("destinationMVT"));
		rmvt.setStartingTimeMVT(request.getParameter("startingTimeMVT"));
		rmvt.setStartingDateMVT(request.getParameter("startingDateMVT"));
		rmvt.setEndingTimeMVT(request.getParameter("endingTimeMVT"));
		rmvt.setEndingDateMVT(request.getParameter("endingDateMVT"));
		rmvt.setCoPassengerNameMVT(request.getParameter("coPassengerNameMVT"));
		rmvt.setRelationMVT(request.getParameter("relationMVT"));
		rmvt.setReasonMVT(request.getParameter("reasonMVT"));
		repo.insertRequestMVT(rmvt);
		request.setAttribute("request",rmvt);
		RequestDispatcher rd=request.getRequestDispatcher("View.jsp");
		rd.forward(request,response);
	}
}