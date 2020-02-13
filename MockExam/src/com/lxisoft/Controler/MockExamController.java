package com.lxisoft.Controler;
import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;
import java.util.ArrayList;
import com.lxisoft.Model.MockExamModel;
import com.lxisoft.Repository.SqlRepository;
public class MockExamController extends HttpServlet
{
	private ArrayList<MockExamModel> model = new ArrayList<MockExamModel>();
	private SqlRepository sqlReppo = SqlRepository.getInstance();
	public void doGet(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException 
	{
			PrintWriter out= response.getWriter(); 
			out.println("Adarsh");
		// PrintWriter out = response.getWriter();
		// out.println("Welcome");
		// response.sendRedirect("welcome.jsp");
		// out.close();
			RequestDispatcher rd = request.getRequestDispatcher("StartPage.jsp");
			rd.forward(request,resonse);
		
		//Date date = new Date();
		
       // do something in here
  	}
}