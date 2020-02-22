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
    int i=0;
    public void doGet(HttpServletRequest request,HttpServletResponse response)throws ServletException,IOException  
    {
        PrintWriter out = response.getWriter();
        emodels.clear();
        i++;
        emodels = sqlrepo.readFromDatabase(emodels);
        HttpSession sessions = request.getSession(true);
        request.setAttribute("qstn",emodels);
        sessions.setAttribute("questions",i);       
        RequestDispatcher rd=request.getRequestDispatcher("Questionview.jsp");
        rd.forward(request,response);
             
    }    
    
}

 