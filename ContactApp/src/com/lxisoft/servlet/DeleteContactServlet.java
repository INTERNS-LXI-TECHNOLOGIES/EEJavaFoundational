<<<<<<< HEAD
package com.lxisoft.servlet;
import java.io.*;
import java.util.*;
import javax.servlet.*;
import javax.servlet.http.*;
import com.lxisoft.repository.*;
import com.lxisoft.model.*;
public class DeleteContactServlet extends HttpServlet
{
	
	public void doGet(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException
	{
		try
		{
			DataBase db = new DataBase();
			int id = Integer.parseInt(request.getParameter("id"));
			PrintWriter out = response.getWriter();
			out.println(id);
			db.deleteFromDb(id);
			response.sendRedirect("index.jsp");		
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
=======
package com.lxisoft.servlet;
import java.io.*;
import java.util.*;
import javax.servlet.*;
import javax.servlet.http.*;
import com.lxisoft.repository.*;
import com.lxisoft.model.*;
public class DeleteContactServlet extends HttpServlet
{
	
	public void doGet(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException
	{
		try
		{
			DataBase db = new DataBase();
			int id = Integer.parseInt(request.getParameter("id"));
			PrintWriter out = response.getWriter();
			out.println(id);
			db.deleteFromDb(id);
			response.sendRedirect("ViewContacts.jsp");		
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
>>>>>>> b81f6fd2e67710b4348ee6ebc133966c3528ddee
}	