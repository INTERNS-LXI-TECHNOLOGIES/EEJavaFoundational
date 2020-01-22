package com.lxisoft.model;
/**
 *pojo: class for set and get word details
 */
public class WordUnit
{
	/**
	 *instance variables word and meaning
	 */
	private String word;
	private String meaning;
	/**
	 *to set word
	 *
	 *@param word
	 */
	public void setWord(String word)
	{
		this.word=word;
	}
	/**
	 *to get word
	 *
	 *@return word
	 */
	public String getWord()
	{
		return word;
	}
	/**
	 *to set meaning
	 *
	 *@param meaning
	 */
	public void setMeaning(String meaning)
	{
		this.meaning=meaning;
	}
	/**
	 *to get meaning
	 *
	 *@return meaning
	 */
	public String getMeaning()
	{
		return meaning;
	}
}