package com.lxisoft.Servlet;
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.util.*;
import com.lxisoft.Repository.*;
import com.lxisoft.Domain.*;
public class Add extends HttpServlet
{
  public void doGet(HttpServletRequest request,HttpServletResponse response)throws ServletException,IOException
  {
	 Dictionary d = new Dictionary();
	 d.setWord(request.getParameter("word"));
	 d.setMeaning(request.getParameter("meaning"));
	 DataRepository drr=new DataRepository();
	 Dictionary di = drr.add(d); 
	 request.setAttribute("Dictionary",di);
	 RequestDispatcher rs=request.getRequestDispatcher("Dictionary.jsp");
	 rs.forward(request,response);
  }

}
