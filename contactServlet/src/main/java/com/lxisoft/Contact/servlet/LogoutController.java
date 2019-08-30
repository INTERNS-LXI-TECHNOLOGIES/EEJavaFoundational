package com.lxisoft.Contact.servlet;

import java.io.*;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Map.Entry;
import java.util.Properties;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.http.Part;
import javax.sql.DataSource;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileItemFactory;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;
import org.apache.commons.io.FilenameUtils;

@WebServlet("/logout")
public class LogoutController extends HttpServlet
{
	public void service(HttpServletRequest req,HttpServletResponse res) throws ServletException, IOException {
		HttpSession session=req.getSession();
		try {
			session.removeAttribute("uname"); 
			session.invalidate();
			res.sendRedirect("Login.jsp");
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}
