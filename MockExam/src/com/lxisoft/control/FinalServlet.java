package com.lxisoft.control;
import com.lxisoft.sqlRepository.*;
import com.lxisoft.model.Model;
import java.io.*;
import java.util.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.PrintWriter;

public class FinalServlet extends HttpServlet 
{ public static int count=0;
  int c1;
   // public int c=0;
	public ArrayList<Model> model=new ArrayList<Model>();
	public SqlRepository sql=new SqlRepository();
  public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
  {	 // response.setContentType("text/html");
  HttpSession session1=request.getSession(true);
      model=(ArrayList<Model>) session1.getAttribute("array");
      PrintWriter out = response.getWriter();
       int c = Integer.parseInt(request.getParameter("questionNo")); 
     String name= request.getParameter("opt");
     int a=Integer.parseInt(name);
     if(a==(model.get(c).getAns()))
     {
        count++;
     }
     c1+=count;
     count=0;
     c++;
    HttpSession session=request.getSession(true); 
       session.setAttribute("count",c1);
    // request.setAttribute("count",c1);
     String url="page2.jsp?questionNo="+c;
      response.sendRedirect(url);
    // out.println("count : "+c1);
  }
}