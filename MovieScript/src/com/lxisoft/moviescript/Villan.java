package com.lxisoft.moviescript;
import com.lxisoft.moviescript.Movie;
import java.util.*;
public class Villan{
	public ArrayList<String> villanScript = new ArrayList<String>();
	private String villanDialogue;
	public void setvillanDialogue(String a){
		this.villanDialogue=a;

	}
	public String getvillanDialogue(){
		return villanDialogue;
	}

	public void villanDialogueMethod(){
		villanScript.add("YOUR SON IS UNDER MY CUSTODY");
		villanScript.add("IF YOU WANT TO RELEASE HIM GIVE MY 5 LAKHS");
		
		
	}

	
	
}