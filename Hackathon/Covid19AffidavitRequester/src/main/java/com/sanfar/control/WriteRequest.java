package com.sanfar.control;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.lang.Math;
import java.util.*;
import com.sanfar.sqlrepository.*;
import com.sanfar.model.*;
public class WriteRequest extends HttpServlet
{    
    Sqlrepository sqlrep=new Sqlrepository();
    public void doGet(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException  
    {  
        
        PrintWriter out=res.getWriter();
      
        Model model=new Model();
        
       //out.println(req.getParameter("question"));
        HttpSession session=req.getSession(); 
    
        String name=req.getParameter("name");
        model.setName(name);
        String phoneNumber=req.getParameter("phoneNumber");
        model.setPhoneNumber(phoneNumber);
        String address=req.getParameter("address");
        model.setAddress(address);
        String vehicleNumber=req.getParameter("vehicleNumber");
        model.setVehicleNumber(vehicleNumber);
        String vehicleType=req.getParameter("vehicleType");
        model.setVehicleType(vehicleType);
        String startingLocation=req.getParameter("startingLocation");
        model.setStartingLocation(startingLocation);
        String destination=req.getParameter("destination");
        model.setDestination(destination);
        String startingDate=req.getParameter("startingDate");
        model.setStartingDate(startingDate);
        String startingTime=req.getParameter("startingTime");
        model.setStartingTime(startingTime);
        String endingDate=req.getParameter("endingDate");
        model.setEndingDate(endingDate);
        String endingtime=req.getParameter("endingtime");
        model.setEndingtime(endingtime);
        String copassengername=req.getParameter("copassengername");
        model.setCopassengername(copassengername);
        String relation=req.getParameter("relation");
        model.setRelation(relation);
        String reason=req.getParameter("reason");
        model.setReason(reason);


        sqlrep.writeRequest(model);
        //out.println("Question : "+model.getQuestion());
        res.sendRedirect("view.jsp");
    }
   
   
}

