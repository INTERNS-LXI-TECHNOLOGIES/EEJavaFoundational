package com.lxisoft.Servlet;
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.util.*;
import com.lxisoft.Repository.*;
import com.lxisoft.Domain.*;
public class Add extends HttpServlet
{
  public void doPost(HttpServletRequest request,HttpServletResponse response)throws ServletException,IOException
  {
	 Contact c = new Contact();
	 c.setName(request.getParameter("name"));
	 c.setNumber(request.getParameter("number"));
	 DataRepository drr=new DataRepository();
	 drr.add(c); 
	 //request.setAttribute("contact",c);
	 RequestDispatcher rd=request.getRequestDispatcher("start");
	 rd.forward(request,response);

  }

}
