package com.lxisoft.classroom;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpServletRequest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.annotation.WebServlet;

//@WebServlet("/AddUser")
public class AddUser extends HttpServlet{

    public void doGet(HttpServletRequest request,HttpServletResponse response)throws IOException{
        PrintWriter out = response.getWriter();
        out.println("hellooweede");
    }
     
}