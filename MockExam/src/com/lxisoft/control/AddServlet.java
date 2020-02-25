package com.lxisoft.control;
import com.lxisoft.sqlRepository.*;
import com.lxisoft.model.Model;
import java.io.*;
import java.util.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.PrintWriter;

public class AddServlet extends HttpServlet 
{ 
	public SqlRepository sql=new SqlRepository();
	ArrayList<Model>model=new ArrayList<Model>();
  public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
  {	 
  	  PrintWriter out = response.getWriter();
  HttpSession session1=request.getSession(true);
  model.clear();
  
  model.add(new Model());
  model.get(0).setQn(request.getParameter("question"));
  model.get(0).setOpt1(request.getParameter("option1"));
  model.get(0).setOpt2(request.getParameter("option2"));
  model.get(0).setOpt3(request.getParameter("option3"));
  model.get(0).setOpt4(request.getParameter("option4"));
  model.get(0).setAns(Integer.parseInt(request.getParameter("ans")));

 		
  sql.insertInto(model);
 


}
}