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

	 	System.out.println("\n SCENE 1");
	 	comedianScript.add("\n COMEDIAN: what................");
		comedianScript.add("\n COMEDIAN: HE WAS GOOD FOR NOTHING YOU KEEP HIM");
		comedianScript.add("\n COMEDIAN:NOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO");
		comedianScript.add("\n COMEDIAN:SAVE USSSSSSSSSSSSSSSSS");

		System.out.println(comedianScript.get(random.nextInt(comedianScript.size())));

        
    }


	
	
}