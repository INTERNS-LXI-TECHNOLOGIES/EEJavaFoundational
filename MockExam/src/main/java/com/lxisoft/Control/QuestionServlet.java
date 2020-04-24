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
   
    public ArrayList<ExamModel> models=new ArrayList<ExamModel>();
    public SqlRepository sqlrepo=new SqlRepository();

    public void doGet(HttpServletRequest request,HttpServletResponse response)throws ServletException,IOException  
    {
        PrintWriter out = response.getWriter();
        models.clear();       
        models = sqlrepo.readFromDatabase(models);
        HttpSession sessions = request.getSession(true);        
        sessions.setAttribute("qstn",models);        
        request.getRequestDispatcher("Questionview.jsp").forward(request,response);
    }    
    
}

 