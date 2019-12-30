package com.lxisoft.domain;
/**
 *class for user registration
 */
public class User
{
	/**
	 *instance variables user name and password
	 */
	private String userName;
	private String password;
	/**
	 *to set user name
	 *
	 *@param userName
	 */
	public void setUserName(String userName)
	{
		this.userName=userName;
	}
	/**
	 *to get user name
	 *
	 *@return userName
	 */
	public String getUserName()
	{
		return userName;
	}
	/**
	 *to set password
	 *
	 *@param password
	 */
	public void setPassword(String password)
	{
		this.password=password;
	}
	/**
	 *to get password
	 *
	 *@return password
	 */
	public String getPassword()
	{
		return password;
	}
}
