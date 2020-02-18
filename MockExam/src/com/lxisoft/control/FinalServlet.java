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
   public static int c=0;
	public ArrayList<Model> model=new ArrayList<Model>();
	public SqlRepository sql=new SqlRepository();
  public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
  {	 // response.setContentType("text/html");
       model.clear();
        model=sql.selectFrom(model);
      PrintWriter out = response.getWriter(); 
     String name= request.getParameter("opt");
     int a=Integer.parseInt(name);
     if(a==(model.get(c).getAns()))
     {
        count++;
     }
     c++;
     String url="page2.jsp?questionNo="+c;
     //out.println("url:"+url);
     // out.println("c : "+c);
      response.sendRedirect(url);

  }
}