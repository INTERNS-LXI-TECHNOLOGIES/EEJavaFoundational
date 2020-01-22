package com.lxisoft.servlets;
import java.util.ResourceBundle;
import javax.servlet.jsp.jstl.core.Config;
import java.util.Locale;
import java.util.ResourceBundle;
import java.util.ResourceBundle.Control;
import java.net.*; 
import java.net.URLConnection;
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.util.*;

public class LanguageSelectorServlet extends HttpServlet

{
	// public class UTF8Control extends Control {
 //    public ResourceBundle newBundle (String baseName, Locale locale, String format, ClassLoader loader, boolean reload)
 //    				throws IllegalAccessException, InstantiationException, IOException
 //    {
 //        // The below is a copy of the default implementation.
 //        String bundleName = toBundleName(baseName, locale);
 //        String resourceName = toResourceName(bundleName, "messages");
 //        ResourceBundle bundle = null;
 //        InputStream stream = null;
 //        if (reload) {
 //            URL url = loader.getResource(resourceName);
 //            if (url != null) {
 //                URLConnection connection = url.openConnection();
 //                if (connection != null) {
 //                    connection.setUseCaches(false);
 //                    stream = connection.getInputStream();
 //                }
 //            }
 //        } else {
 //            stream = loader.getResourceAsStream(resourceName);
 //        }
 //        if (stream != null) {
 //            try {
 //                // Only this line is changed to make it to read properties files as UTF-8.
 //                bundle = new PropertyResourceBundle(new InputStreamReader(stream, "UTF-8"));
 //            } finally {
 //                stream.close();
 //            }
 //        }
 //        return bundle;
 //    }
	// }

	// public  String getLocale(String word,String lang,String country)
	// {
	// 	Locale.setDefault(new Locale(lang,country));
	// 	ResourceBundle bundle = ResourceBundle.getBundle("messages", new UTF8Control());
	// 	return(bundle.getString(word));
	// }
    public void doGet(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException
    {
       PrintWriter out=response.getWriter();
       String lang= request.getParameter("lang");
       HttpSession session=request.getSession(); 
       session.setAttribute("currentlocale",lang);
       out.println(lang);
       response.sendRedirect("View");
       

    }
}
