package com.lxisoft.moviescript;

import java.util.*;
public class Comedian{
	 public ArrayList<String> comedianScript = new ArrayList<String>();
	  Random random=new Random();
	 private String randomComedianDialogue;
	public void setcomedianDialogue(String a){
		this.randomComedianDialogue=a;

	}
	public String getcomedianDialogue(){
		return randomComedianDialogue;
	}

	 public void setcomedianDialoges(){
	 	comedianScript.add("COMEDIAN: what................");
		comedianScript.add("COMEDIAN: HE WAS GOOD FOR NOTHING YOU KEEP HIM");

		System.out.println(comedianScript.get(random.nextInt(comedianScript.size())));

        
    }


	
	
}