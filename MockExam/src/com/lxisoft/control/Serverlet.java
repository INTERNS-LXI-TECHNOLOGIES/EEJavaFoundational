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
     // String name=request.getParameter("username"); 
       	model=sql.selectFrom(model);
       //	out.println("array size : "+model.size());
       	 HttpSession session=request.getSession();  
        session.setAttribute("array",model); 

        if(session.get)
      	// for(int i=0;i<model.size();i++)
      	// {
      	// 	out.println("slno : "+model.get(i).getSlno());
      	// 	out.println("qn : "+model.get(i).getQn());
      	// 	out.println("opt 1 : "+model.get(i).getOpt1());
      	// 	out.println("opt 2 : "+model.get(i).getOpt2());
      	// }
      response.sendRedirect("page1.jsp"); 
      

  }
}