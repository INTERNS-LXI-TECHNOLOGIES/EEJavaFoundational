package com.LxiSoft.Movie;
import java.io.File;
import java.io.*;
import java.io.IOException;

public class CreateFile
{
	File file = new File("C:\\home\\Desktop\\lxi_works1\\EEJavaFoundational\\MovieScript\\classes\\dialogues.txt");

	public void fileMake()
	{
		try
		{
	
	if(file.createNewFile())
	{
		System.out.println("File created"+file.getName());
	}
	else
	{
		System.out.println("File Already Created");
	}

}
catch(IOException e)
{
	System.out.println("An error occured");
   e.printStackTrace();
   }
   this.fileInfo();
  }
  public void fileInfo()
  {
  	if(file.exists())
  	{
  		System.out.println("File name: "+file.getName());
  		System.out.println("File path: "+file.getAbsolutePath());
  			System.out.println("File Writable: "+file.canWrite());
  		System.out.println("File readable: "+file.canRead());
  		System.out.println("File size in bytes: "+file.length());
  		
  	}
  	else
{
	System.out.println("File Doesnt excist;");  		
}
  }
  }