package com.lxisoft.hackathon;

import java.io.IOException;
import java.util.Locale;
import java.util.ResourceBundle;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("language")
public class Localizationservlet extends HttpServlet
{
    public void doGet(HttpServletRequest request , HttpServletResponse response)throws ServletException,IOException{
        String lang = request.getParameter("lang");
        ResourceBundle resourcebundle;
        
        if("ml".equals(lang)){
            Locale mlLocale = new Locale.Builder().setLanguage("ml").build();
            resourcebundle = ResourceBundle.getBundle("message_ml",mlLocale);
        }
    }
}