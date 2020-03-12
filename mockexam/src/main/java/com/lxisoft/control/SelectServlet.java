package com.lxisoft.control;
import com.lxisoft.sqlRepository.*;
import com.lxisoft.model.Model;
import java.io.*;
import java.util.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.PrintWriter;

public class SelectServlet extends HttpServlet 
{ 
	public SqlRepository sql=new SqlRepository();
	//ArrayList<Model>model=new ArrayList<Model>();
  //public Model model;
  public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
  {	 
    HttpSession session=request.getSession(true);
  	  PrintWriter out = response.getWriter();
      String username = (String)request.getRemoteUser();
      // out.println("username: "+username);
     String role=sql.select(username);
     // out.println("role: "+role);
      if(role.equals("admin"))
        {
          response.sendRedirect("AdminMenu.jsp");
        }
        else if(role.equals("user"))
        {
          response.sendRedirect("page1.jsp");
        }
  }
}