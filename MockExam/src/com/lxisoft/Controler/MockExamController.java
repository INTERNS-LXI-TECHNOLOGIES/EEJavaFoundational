package com.lxisoft.Controler;
import javax.servlet.http.*;  
import javax.servlet.*;  
import java.io.*; 
// import javax.servlet.*;
// import javax.servlet.http.*;
//import javax.HttpServlet.ServletException;
// import javax.servlet.ServletException.
// import javax.HttpServlet.ServletRequest;
// import javax.servlet.ServletResponse;
// import java.io.IOException;
import java.util.ArrayList;
import com.lxisoft.Model.MockExamModel;
import com.lxisoft.Repository.SqlRepository;
public class MockExamController extends HttpServlet
{
	private ArrayList<MockExamModel> model = new ArrayList<MockExamModel>();
	private SqlRepository sqlReppo = SqlRepository.getInstance();
	public void doGet(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException 
	{
		try
		{
		// PrintWriter out = response.getWriter();
		// out.println("Welcome");
		// response.sendRedirect("welcome.jsp");
		// out.close();
		}
		catch(Exception e)
		{
			System.out.println("hahhahahhahhaa");
		}
		
		//Date date = new Date();
		
       // do something in here
  	}
}