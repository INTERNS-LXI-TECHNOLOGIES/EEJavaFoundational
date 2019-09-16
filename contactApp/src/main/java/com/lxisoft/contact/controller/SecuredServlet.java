package com.lxisoft.contact.controller;
 
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
 

public class SecuredServlet extends HttpServlet{
 
    private static final long serialVersionUID = 1L;
 
    /***** This Method Is Called By The Servlet Container To Process A 'GET' Request *****/
    public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {      
       // handleRequest(req, res);
        if (!req.isUserInRole("contact")) {
          LoginServlet.forwardToLogin(req, res, null);
          return;
      }
        /***** Set Response Content Type *****/
        res.setContentType("text/html");
 
        /***** Print The Response *****/
        PrintWriter out = res.getWriter();
        out.println("Welcome to the secured app!");
      out.printf("<br/>User: " + req.getRemoteUser());
     // out.printf("<br/>time: " + LocalDateTime.now());
     // out.println("<br/><a href='/logout'>Logout</a>");
  }

  @Override
  protected void doPost(HttpServletRequest req, HttpServletResponse res)
          throws ServletException, IOException {
      doGet(req, res);
  }
}