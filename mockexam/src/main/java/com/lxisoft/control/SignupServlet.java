package com.lxisoft.control;
import com.lxisoft.sqlRepository.*;
import com.lxisoft.model.Model;
import java.io.*;
import java.util.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.PrintWriter;

public class SignupServlet extends HttpServlet 
{ 
	public SqlRepository sql=new SqlRepository();
	ArrayList<String>user=new ArrayList<String>();
  int c=0;
  //public Model model;
  public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
  {	 
    HttpSession session=request.getSession(true);
  	  PrintWriter out = response.getWriter();
      String username = (String)request.getParameter("newusername");
      String password = (String)request.getParameter("newpassword");
      String role="user";
      user=sql.signUp3(user);
      for(int i=0;i<user.size();i++)
      {
        // out.println(user.get(i));
        // out.println("username : "+username);
        if(user.get(i).equals(username))
        {
            c++;
        }
      }
      if(c==0)
      {
     sql.signUp1(username,password);
     sql.signUp2(username,role);
     response.sendRedirect("success.jsp");
      }
      else
      {
        response.sendRedirect("notsuccess.jsp");
      }
  
  }
}