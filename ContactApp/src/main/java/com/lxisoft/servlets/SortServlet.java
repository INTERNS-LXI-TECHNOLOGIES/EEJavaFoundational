package com.lxisoft.servlets;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import com.lxisoft.Domain.*;
import com.lxisoft.models.*;
import com.lxisoft.repository.*;
import java.util.*;
import java.sql.*;

public class SortServlet extends HttpServlet 
{
	private Repository repo=new MySqlRepo();
	public void doGet(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException
    {
    	PrintWriter out=response.getWriter();
    	String sortvalue=request.getParameter("sortvalue");
    	// out.println(fn);
    	try{
				switch(sortvalue)
				{
					case "firstname":repo.sortContactByFirstName();break;
					case "lastname":repo.sortContactByLastName();break;
				}
				response.sendRedirect("View");
			}catch(Exception excep)
			{
				excep.printStackTrace();
			}


    }
}
