package com.lxisoft.Domain;
public class Dictonary
{ 
  private String word;
	private String m;
	private int no;
  /*
  *to set word
  */
	public void setWord(String w)
	{
      this.word = w;
	}
  /*
  *to get word
  */
	public String getWord()
   {
     return this.word;
   }  
 
   public void setMeaning(String m)
   {
    this.m = m;
   }
  /*
  *to get meaning
  */
   public String getMeaning()
   {
     return this.m;
   }
  /*
  *to set number
  */
     public void setNo(int no)
   {
    this.no = no;
   }
  /*
  *to get number
  */
   public int getNo()
   {
     return this.no;
   }
  
}