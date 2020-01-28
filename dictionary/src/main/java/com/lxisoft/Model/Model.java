package com.lxisoft.Model;

/*
*Model class
*/
public class Model
{   
	private int no;
	private String word;
 /*
  *to set word
  */
	public void setWord(String w)
	{
     this.word=w;
	}
	 /*
  *to get word
  */
	public String getWord()
	{
      return this.word;
	}
	 /*
  *to set no
  */
	public void setNo(int no)
	{
		this.no=no;
	}
	 /*
  *to get id
  */
	public int getNo()
	{
		return this.no;
	}
}