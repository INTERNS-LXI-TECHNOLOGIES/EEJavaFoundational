package com.lxisoft.facegram.controller;

import java.io.IOException;
import java.io.InputStream;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

import com.lxisoft.facegram.repo.Repo;

@WebServlet("/upload")
@MultipartConfig(maxFileSize = 9999999)
public class ImageServlet extends HttpServlet {
protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		Repo r = new Repo(); 
		
		try {
			String name = req.getParameter("name");
			Part filePart = req.getPart("photo");
			InputStream stream = null;
			if(filePart != null) {
				String filecontent = filePart.getContentType();
				stream = filePart.getInputStream();
				r.add(stream,name);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		resp.sendRedirect("homePage.jsp");
	}
}
