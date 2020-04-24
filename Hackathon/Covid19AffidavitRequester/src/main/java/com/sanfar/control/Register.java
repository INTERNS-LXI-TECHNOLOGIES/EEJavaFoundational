package com.sanfar.control;
import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;
import com.sanfar.sqlrepository.*;
public class Register extends HttpServlet
{
	private Sqlrepository sqlReppo ;

	public void doPost(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException 
	{
		PrintWriter out = response.getWriter();
		try{
		sqlReppo = Sqlrepository.getInstance();
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		
		/*out.println("username"+username);
		out.println("userpassword"+password);*/
		sqlReppo.userRoles(username,password);
		request.getRequestDispatcher("Register1.jsp").forward(request,response);
		} 
	catch (Exception e) 
	{
		e.printStackTrace();
		out.println(e);
	}
	}
}