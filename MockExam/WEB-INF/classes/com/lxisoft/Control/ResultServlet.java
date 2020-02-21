package com.lxisoft.Control;
import java.io.*;
import java.util.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;
import com.lxisoft.Repository.*;
import com.lxisoft.Control.*;

public class ResultServlet extends HttpServlet
{
    int c;
    int totalMark;
    public void doGet(HttpServletRequest request,HttpServletResponse response)throws ServletException,IOException
	{
        PrintWriter out = response.getWriter();
        HttpSession session = request.getSession();
        if((option) equals(emodels.getAns()))
        {
            totalMark=totalMark+1;
        }       	
        RequestDispatcher rd=request.getRequestDispatcher("Result.jsp");
        rd.forward(request,response);

	}
}

    
        