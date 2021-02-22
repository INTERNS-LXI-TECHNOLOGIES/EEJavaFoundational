package com.lxisoft.servlet;
import java.util.*;
import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;
import com.lxisoft.repositry.*;
import com.lxisoft.model.*;

public class AddApplicationServlet extends HttpServlet
{
	CovidDatabase database = new CovidDatabase();

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException,IOException
	{
		CovidForm covidform= new CovidForm(); 
    	String name=request.getParameter("name");
    	String phno=request.getParameter("phno");
    	String type=request.getParameter("type");
    	String address=request.getParameter("address");
    	String people=request.getParameter("people");
			
			covidform.setName(name);	
			covidform.setPhoneNumber(phno);
			covidform.setFunctionType(type);
			covidform.setAddress(address);
			covidform.setNumberOfPeople(people);
			database.addtoDatabase(covidform);


			RequestDispatcher req = request.getRequestDispatcher("AddApplicaionMessage.jsp");
			req.forward(request, response);
		}
    	
	}
