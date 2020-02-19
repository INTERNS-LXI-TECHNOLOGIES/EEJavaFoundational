package com.lxisoft.control;
import com.lxisoft.sqlRepository.*;
import com.lxisoft.model.Model;
import java.io.*;
import java.util.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.PrintWriter;

public class Serverlet extends HttpServlet 
{ 
	public ArrayList<Model> model=new ArrayList<Model>();
	public SqlRepository sql=new SqlRepository();
  public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
  {	 // response.setContentType("text/html");
       PrintWriter out = response.getWriter(); 
       model.clear();
       	model=sql.selectFrom(model);
       //	out.println("array size : "+model.size());
       	 HttpSession session=request.getSession(); 
        session.setAttribute("array",model); 
         response.sendRedirect("page2.jsp?questionNo=0"); 


  }
}