package com.lxisoft.control;
import com.lxisoft.sqlRepository.*;
import com.lxisoft.model.Model;
import java.io.*;
import java.util.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.PrintWriter;

public class UpdateServlet extends HttpServlet 
{ 
	public SqlRepository sql=new SqlRepository();
	//ArrayList<Model>model=new ArrayList<Model>();
  //public Model model;
  public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
  {	 
    HttpSession session=request.getSession(true);
     ArrayList<Model> model=(ArrayList<Model>)session.getAttribute("disp");
    int obj=Integer.parseInt(request.getParameter("update"));
    Model update=new Model();
    update.setSlno(model.get(obj).getSlno());
  	  PrintWriter out = response.getWriter();
    if((request.getParameter("Question")).length()==0)
    {
     update.setQn(model.get(obj).getQn());
    }
    else
    {
      update.setQn(request.getParameter("Question"));
    }
    if((request.getParameter("Option1")).length()==0)
    {
     update.setOpt1(model.get(obj).getOpt1());
    }
    else
    {
      update.setOpt1(request.getParameter("Option1"));
    }
    if((request.getParameter("Option2")).length()==0)
    {
     update.setOpt2(model.get(obj).getOpt2());
    }
    else
    {
      update.setOpt2(request.getParameter("Option2"));
    }
    if((request.getParameter("Option3")).length()==0)
    {
     update.setOpt3(model.get(obj).getOpt3());
    }
    else
    {
      update.setOpt3(request.getParameter("Option3"));
    }
    if((request.getParameter("Option4")).length()==0)
    {
     update.setOpt4(model.get(obj).getOpt4());
    }
    else
    {
      update.setOpt4(request.getParameter("Option4"));
    }
    if((request.getParameter("Ans")).length()==0)
    {
     update.setAns(model.get(obj).getAns());
    }
    else
    {
      update.setAns(Integer.parseInt(request.getParameter("Ans")));
    }
    out.println("SlNo : "+update.getSlno());
 		out.println("Answer : "+update.getAns());
    out.println("Question : "+update.getQn());
    out.println("Opt1 : "+update.getOpt1());
    out.println("Opt2 : "+update.getOpt2());
    out.println("Opt3 : "+update.getOpt3());
    out.println("Opt4 : "+update.getOpt4());
  sql.updateName(update);
 // response.sendRedirect("add2.jsp");
 
}
}