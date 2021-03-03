package com.lxisoft.servlet;
import java.util.*;
import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;
import com.lxisoft.repository.*;
import com.lxisoft.model.*;

public class UpdateServlet extends HttpServlet
{
		UserRepository userrepo = new UserRepository();

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException , IOException
	{
	   String id = request.getParameter("id");
	   String newname= request.getParameter("name");
	   String newage= request.getParameter("age");
	   String newaddress= request.getParameter("address");
	   String newemail= request.getParameter("email");
	   String newnumber= request.getParameter("number");
	   String newblood= request.getParameter("blood");
	   Userdetails userdetails = new Userdetails();
	   userdetails.setName(newname);
	   userdetails.setAge(newage);
	   userdetails.setAddress(newaddress);
	   userdetails.setMailId(newemail); 
	   userdetails.setNumber(newnumber);
	   userdetails.setBloodGroup(newblood);
	   userrepo.updateDatabase(id,newname,newage,newaddress,newemail,newnumber,newblood);
	   		RequestDispatcher rd = request.getRequestDispatcher("/ViewServlet");
	   		rd.forward(request,response);
	}

}