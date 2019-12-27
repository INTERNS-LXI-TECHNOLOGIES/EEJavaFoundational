package com.lxisoft.Servlet;
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import com.lxisoft.Domain.*;
import com.lxisoft.Repository.*;
import com.lxisoft.Servlet.*;
import javax.servlet.annotation.*;
@WebServlet("/Delete")
public class Delete extends HttpServlet
{
	public void doGet(HttpServletRequest request,HttpServletResponse response)throws ServletException,IOException
	{
		String id = request.getParameter("id");
		DataRepository drr = new DataRepository();
		HttpSession session= request.getSession();
		session.setAttribute("c",drr.delete(id));
		RequestDispatcher rs=request.getRequestDispatcher("ViewAll.jsp");
	 	rs.forward(request,response);
                                  
	}
}
  
 