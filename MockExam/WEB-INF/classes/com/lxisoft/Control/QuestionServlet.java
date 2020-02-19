package com.lxisoft.Control;
import java.io.*;
import java.util.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;
import com.lxisoft.Model.ExamModel;
import com.lxisoft.Repository.SqlRepository;
public class QuestionServlet extends HttpServlet
{
    public ArrayList<ExamModel> emodels=new ArrayList<ExamModel>();
    public SqlRepository sqlrepo=new SqlRepository();
    public void doGet(HttpServletRequest request,HttpServletResponse response)throws ServletException,IOException  
    {
        PrintWriter out = response.getWriter();
        emodels.clear();
        emodels = sqlrepo.readFromDatabase(emodels);
        HttpSession sessions = request.getSession(true);
        sessions.setAttribute("questions",emodels);
        String url="Questionview.jsp?questionNo=0";   
        response.sendRedirect(url);
       // request.getRequestDispatcher(url).forward(request,response);
        
        
    }     

    
  
}
 