package com.Lxisoft.Files;
import com.Lxisoft.MovieScriptApp.*;
import java.util.io.*;
import java.util.Scanner;

public class File1{

	public void fileCreation(){
		File file = new File();
		 try {
	    	
	  	file.createNewFile();
	  }
	  catch(Exception ex){
	  	System.out.println(" "+ex);
	  }
	}

}