package com.lxisoft.test;

import com.lxisoft.moviescript.Movie;
import java.io.BufferedReader;
 import java.io.FileReader;
  import java.io.IOException; 
  import java.nio.charset.StandardCharsets;
   import java.nio.file.Files; 
   import java.nio.file.Paths; 
   import java.util.ArrayList; 
   import java.util.Collections;
    import java.util.List;


public class TDD{
	public static void main(String[] args) throws Exception{
		Movie movie=new Movie();
		movie.randomCheck();
		BufferedReader bufReader = new BufferedReader(new FileReader("F:\\Program files\\EEJavaFoundational\\MovieScript\\src\\com\\lxisoft\\moviescript\\moviescriptfile.csv"));
		 ArrayList<String> listOfLines = new ArrayList<>();
		  String line = bufReader.readLine();
		   while (line != null) 
		   	{
		   	 listOfLines.add(line);
		   	  line = bufReader.readLine(); } 
		   	  bufReader.close();
		   	  
		   	}


		   }
		
	
