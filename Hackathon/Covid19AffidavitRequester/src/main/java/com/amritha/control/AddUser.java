package com.amritha.control;
import javax.servlet.*;
import javax.servlet.http.*;

import com.amritha.model.CovidAmrModel;
import com.amritha.repository.SqlRepositoryAmr;

import java.io.IOException;
import java.io.PrintWriter;
public class AddUser extends HttpServlet
{  
  public void doGet(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException 
  {
    PrintWriter out = response.getWriter();
    SqlRepositoryAmr sqlrepoAmr=new SqlRepositoryAmr();
    CovidAmrModel modelAmr=new CovidAmrModel();
    modelAmr.setNameAmr(request.getParameter("name"));
    modelAmr.setAddressAmr(request.getParameter("address"));                     
    modelAmr.setPhnoAmr(request.getParameter("phno"));
    modelAmr.setVehicleNoAmr(request.getParameter("vehicleno"));
    modelAmr.setVehicleTypeAmr(request.getParameter("vehicleType"));
    modelAmr.setLocationAmr(request.getParameter("location"));
    modelAmr.setDestinationAmr(request.getParameter("destination"));
    modelAmr.setCoPassengerAmr(request.getParameter("copassenger"));
    modelAmr.setRelationAmr(request.getParameter("relation"));
    modelAmr.setReasonAmr(request.getParameter("reason"));
    modelAmr.setTimeAmr(request.getParameter("time"));   
    sqlrepoAmr.insertIntoDatabase(modelAmr); 
    HttpSession session = request.getSession(true);
    request.getRequestDispatcher("Add.jsp").forward(request,response);
  }  
}
