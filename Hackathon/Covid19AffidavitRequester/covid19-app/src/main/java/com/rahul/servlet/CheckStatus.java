package com.rahul.servlet;
import com.rahul.model.*;
import com.rahul.repository.*;
import java.util.*;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class CheckStatus extends HttpServlet
{
	Model a = new Model();
	Database d = new Database();
	ArrayList<Model> status = new  ArrayList<Model>();
	public void doGet(HttpServletRequest request ,HttpServletResponse response)throws IOException,ServletException
	{
		String pno = request.getParameter("phno");
		status = d.check(status,pno);
		response.sendRedirect("reqSuccessMsg.jsp");


	}
}
