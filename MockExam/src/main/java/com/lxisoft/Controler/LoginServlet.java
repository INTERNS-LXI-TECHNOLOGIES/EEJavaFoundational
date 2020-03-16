package com.lxisoft.Controler;
import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;
import com.lxisoft.Repository.SqlRepository;
public class LoginServlet extends HttpServlet
{
	private SqlRepository sqlReppo ;
	public void doGet(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException 
	{
		sqlReppo = SqlRepository.getInstance();
		PrintWriter out = response.getWriter();
		String username = request.getRemoteUser();
		//out.println("User : "+username);
		String userrole = sqlReppo.selectRole(username);
		//out.println("UserRole : "+userrole);
			if(userrole.equals("admin"))
			{
				response.sendRedirect("Admin.jsp");
			}
			else if(userrole.equals("user"))
			{
				response.sendRedirect("Introduction.jsp");	
			}
	}
	
}