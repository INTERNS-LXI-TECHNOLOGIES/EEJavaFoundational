package com.lxisoft.moviescript;
import java.io.*;
import java.io.FileWriter;
import java.io.FileNotFoundException; 
import java.util.ArrayList;
import java.util.Scanner;


import java.util.Scanner;

public class FileReppo{

	public void fileCreation(){
		File file = new File("newfile.txt");
		 try {
	    	
	  	file.createNewFile();
	  }
	  catch(Exception ex){
	  	System.out.println(" "+ex);
	  }
	}

	public void readFromFile(){
    	
    
      			Scanner myReader = new Scanner("newfile.txt");
      			while (myReader.hasNextLine()) {
        		String data = myReader.nextLine();
        		System.out.println(data);
      	
      		myReader.close();
    
    	}

  	}




}