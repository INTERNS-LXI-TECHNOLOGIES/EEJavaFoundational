package com.lxisoft.moviescript;
import java.util.io.*;
import java.util.Scanner;

public class FileReppo{

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