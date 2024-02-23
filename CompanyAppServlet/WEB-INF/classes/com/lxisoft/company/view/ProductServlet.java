package com.lxisoft.company.view;

import com.lxisoft.company.model.Product;

import java.io.IOException;
//import java.io.PrintWriter;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/ProductServlet")
public class ProductServlet extends HttpServlet 
{
    String url ="jdbc:mysql://localhost:3306/company";
    String userName = "root";
    String pass="Jayaram";

    public Product product;
   
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException 
    {
        String cc = request.getParameter("selected");
     
       switch(cc){
        
             case "Create":
                createP(request, response);
                response.getWriter().println("Product information Created successfully!");
                 break;

                 case "Read":
                 readP(request,response);
                 response.getWriter().println("Product information Read successfully!");
                  break;

                  case "Update":
                  updateP(request, response);
                  response.getWriter().println("Product information Update successfully!");
                   break;

                   case "Delete":
                   deleteP(request, response);
                   response.getWriter().println("Product information Delete successfully!");
                    break;
        }  
    }

        public void createP(HttpServletRequest request,HttpServletResponse responce) throws IOException
        {
            
            String name = request.getParameter("namee");
            String id = request.getParameter("idd");
            String cost = request.getParameter("cost");
            String mfDate =request.getParameter("mfDate");
            String lsDate = request.getParameter("lsDate");
    
            product = new Product(name,id,cost,mfDate,lsDate);
    
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                Connection connection = DriverManager.getConnection(url, userName, pass);
        
                            String p = "INSERT INTO productinfo (name, id, cost, mfDate, lsDate) VALUES (?, ?, ?, ?, ?)";
                        
                        try{ PreparedStatement preparedStatemen = connection.prepareStatement(p);
                            preparedStatemen.setString(1, product.getName());
                            preparedStatemen.setString(2, product.getId());
                            preparedStatemen.setString(3, product.getCost());
                            preparedStatemen.setString(4, product.getMfDate());
                            preparedStatemen.setString(5, product.getLsDate());
                
                            preparedStatemen.executeUpdate();
                        }catch (SQLException e) {
                            e.printStackTrace();
                        }
                    } catch(Exception e) {
                        e.printStackTrace();
                    }  
           //  responce.sendRedirect("CompanyServlet"); 
        }
    
        public void readP(HttpServletRequest request,HttpServletResponse response) throws IOException
        {

            String name = request.getParameter("namee");
            String id = request.getParameter("idd");
            String cost = request.getParameter("cost");
            String mfDate =request.getParameter("mfDate");
            String lsDate = request.getParameter("lsDate");
    
            product = new Product(name,id,cost,mfDate,lsDate);
    
          // PrintWriter  out=response.getWriter();
            
           //out.println("Product Name is"+ product.getName()+"<br/>"+product.getId()+"<br/>"+product.getCost()+"<br/>"+product. getMfDate()+"<br/>"+product.getLsDate());
    
           
           try{  
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connect=DriverManager.getConnection(url,userName,pass);
            String view="select name,cost,mfDate,lsDate from productinfo where id = ?";
            try{
            PreparedStatement statement =connect.prepareStatement(view);
            statement.setString(1,product.getId());
            ResultSet re = statement.executeQuery();
    
                while(re.next())
                {
                    product.setName(re.getString("name"));
                    product.setCost(re.getString("cost"));
                    product.setMfDate(re.getString("mfDate"));
                    product.setLsDate(re.getString("lsDate"));
                }
                request.setAttribute("pprojuct",product);
                RequestDispatcher ree= request.getRequestDispatcher("ProductResult.jsp");
                ree.forward(request,response);
    
    
            }
            catch(SQLException ee){
                        ee.printStackTrace();
            }   
    }
    catch(Exception e)
    {
        e.printStackTrace();
    }
        }
    
        public void updateP(HttpServletRequest request, HttpServletResponse responce)
        {
               String name = request.getParameter("namee");
               String id = request.getParameter("idd");
               String cost =  request.getParameter("cost");
               String mfDate =  request.getParameter("mfDate");
               String lsDate = request.getParameter("lsDtate");
    
                Product product = new Product(name,id,cost,mfDate,lsDate);
    
                try{
                  Class.forName("com.mysql.cj.jdbc.Driver");
                  Connection connection = DriverManager.getConnection(url,userName,pass);
    
                  String query =  "update productinfo  set name =? , cost=? , mfDate=? , lsDate=? where id=?";
                  try{
                  PreparedStatement preparedStatement = connection.prepareStatement(query);
                  preparedStatement.setString(1, product.getName());
                  preparedStatement.setString(2, product.getCost());
                  preparedStatement.setString(3, product.getMfDate());
                  preparedStatement.setString(4, product.getLsDate());
                  preparedStatement.setString(5, product.getId());
                  preparedStatement.executeUpdate();
                }
                catch(SQLException E)
                {
                    E.printStackTrace();
                }
            }
                catch(Exception e)
                {
                    e.printStackTrace();
                }
            }
    
            public void deleteP(HttpServletRequest request, HttpServletResponse response)
            {
                String name = request.getParameter("namee");
                String idd = request.getParameter("idd");
                String cost =  request.getParameter("cost");
                String mfDate =  request.getParameter("mfDate");
                String lsDate = request.getParameter("lsDtate");
     
                 Product product = new Product(name,idd,cost,mfDate,lsDate);    
    
                 try{
                    Class.forName("com.mysql.cj.jdbc.Driver");
                    Connection connection = DriverManager.getConnection(url,userName,pass);
      
                    String query =  "delete from productinfo where id=?";
                    try{
                        PreparedStatement preparedStatement = connection.prepareStatement(query);
                        preparedStatement.setString(1,product.getId());
                        preparedStatement.executeUpdate();
                    }
                    catch(SQLException e)
                    {
                        e.printStackTrace();
                    }
                }
                catch(Exception e)
                {
                    e.printStackTrace();
                }
            }
        }

        