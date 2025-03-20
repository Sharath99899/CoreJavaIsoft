package com.Practice;

public class Car 
{
	private String brand;
	private int year;

	public Car(String brand, int year) 
	{
		this.brand = brand;
		this.year = year;
	}

	public String getBrand() 
	{
		return brand;
	}
	public void setBrand(String brand) 
	{
		this.brand = brand;
	}

	public int getYear() 
	{
		return year;
	}
	public void setYear(int year) 
	{
		this.year = year;
	}


	public static void main(String[] args) 
	{
		Car car = new Car("TATA", 2022);

		System.out.println("Brand: " + car.getBrand());
		System.out.println("Updated Year: " + car.getYear());
	}
}
