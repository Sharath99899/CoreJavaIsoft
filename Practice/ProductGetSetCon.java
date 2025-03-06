package com.Practice;

public class ProductGetSetCon 
{
	private String laptopName;
	private String processer;
	
	public ProductGetSetCon(String laptopName,String processer)
	{
		this.laptopName=laptopName;
		this.processer=processer;
	}

	public String getLaptopName()
	{
		return laptopName;
	}
	public void setLaptopName(String laptopName )
	{
		this.laptopName = laptopName;
	}

	public String getProcesser()
	{
		return processer;
	}
	public void setProcesser(String processer )
	{
		this.processer = processer;
	}

	public static void main(String[] args) 
	{
		ProductGetSetCon p = new ProductGetSetCon("Hp","i5");
		System.out.println(p.getLaptopName());
		System.out.println(p.getProcesser());
		
	}
}
