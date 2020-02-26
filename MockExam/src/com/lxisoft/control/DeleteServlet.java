package com.lxisoft.control;
import com.lxisoft.sqlRepository.*;
import com.lxisoft.model.Model;
import java.io.*;
import java.util.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.PrintWriter;

public class DeleteServlet extends HttpServlet 
{ 
	public SqlRepository sql=new SqlRepository();
	public ArrayList<Model>model=new ArrayList<Model>();
  public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
  {	 
  	  PrintWriter out = response.getWriter();
       String count = request.getAttribute("count").toString();
       sql.delete(count);
       out.println("haiiii");
      // response.sendRedirect("delete2.jsp");
}
}