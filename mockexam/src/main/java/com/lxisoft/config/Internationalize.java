package com.lxisoft.config;
import java.util.*;
import java.io.*;
import java.util.Locale;
import java.util.ResourceBundle.*;
import java.net.*;

public class Internationalize
{
	public class UTF8Control extends Control
	{
		public ResourceBundle newBundle(String baseName,Locale locale,String format,ClassLoader loader,boolean reload)
		throws IllegalAccessException,InstantiationException,IOException
		{
			String bundleName= toBundleName(baseName,locale);
			String resourceName=toResourceName(bundleName,"properties");
			ResourceBundle bundle=null;
			InputStream stream=null;
			if(reload)
			{
				URL url =loader.getResource(resourceName);
				if(url!=null)
				{
					URLConnection connection=url.openConnection();
					if(connection!=null)
					{
						connection.setUseCaches(false);
						stream=connection.getInputStream();
					}
				}
			}else
			{
				stream=loader.getResourceAsStream(resourceName);
			}
			if(stream!=null)
			{
				try
				{
					bundle=new PropertyResourceBundle(new InputStreamReader(stream,"UTF-8"));
				}finally
				{
					stream.close();
				}
			}return bundle;
		}
	}
	public String localization(String language,String country,String word)
	{
		Locale.setDefault(new Locale(language,country));
		ResourceBundle resourceBundle=ResourceBundle.getBundle("text",new UTF8Control());
		return resourceBundle.getString(word);
	}
}