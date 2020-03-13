package com.lxisoft.control;
import com.lxisoft.sqlRepository.*;
import com.lxisoft.model.Model;
import java.io.*;
import java.util.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.PrintWriter;

public class FinalServlet extends HttpServlet 
{ public int count;
  int c1;
  int c2;
  int a;
   // public int c=0;
	public ArrayList<Model> model=new ArrayList<Model>();
	public SqlRepository sql=new SqlRepository();
  public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
  {	 
  // c2 = 0;
  HttpSession session1=request.getSession(true);
      model=(ArrayList<Model>) session1.getAttribute("array");
      PrintWriter out = response.getWriter();
       int c = Integer.parseInt(request.getParameter("questionNo")); 
     String name= request.getParameter("opt");
     if(name==null)
      { a=0;}
    else
    {  a=Integer.parseInt(name);}
     if(a!=0)
     {
     if(a==(model.get(c).getAns()))
     {
        count++;
        c2++;
     }
     else
     {
      c2++;
     }
     c1+=count;}
     else{c2++;}
      count=0;
     c++;
       if(c2==model.size())
       {
        HttpSession session=request.getSession(true); 
       session.setAttribute("count",c1);
        c1=0;
        c2=0;
       }
        
     String url="page2.jsp?questionNo="+c;
      response.sendRedirect(url);
  }
}