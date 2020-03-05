package com.lxisoft.model;
import java.util.*;
public class Model
{
	int slno;
	String qn;
	int ans;
	String opt1;
	String opt2;
	String opt3;
	String opt4;
	public void setQn(String str)
	{
		this.qn=str;
	}
	public void setOpt1(String opt)
	{
		this.opt1=opt;
	}
	public void setOpt2(String opt)
	{
		this.opt2=opt;
	}
	public void setOpt3(String opt)
	{
		this.opt3=opt;
	}
	public void setOpt4(String opt)
	{
		this.opt4=opt;
	}
	public void setAns(int a)
	{
		this.ans=a;
	}
	public void setSlno(int a)
	{
		this.slno=a;
	}
	public String getQn()
	{
		return qn;
	}
		public String getOpt1()
	{
		return opt1;
	}
	public String getOpt2()
	{
		return opt2;
	}
	public String getOpt3()
	{
		return opt3;
	}
	public String getOpt4()
	{
		return opt4;
	}

		public int getAns()
	{
		return ans;
	}
    	public int getSlno()
	{
		return slno;
	}

}