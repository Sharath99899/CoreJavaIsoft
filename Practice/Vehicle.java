package com.Practice;

public class Vehicle 
{
	private String carName;
	private String colour;
	private String model;
	private int price;
	
	public Vehicle(String carName,String colour ,String model,int price)
	{
		this.carName=carName;
		this.colour=colour;
		this.model=model;
		this.price=price;
	}

	public String getCarName() 
	{
		return carName;
	}
	public void setCarName(String carName) 
	{
		this.carName = carName;
	}

	public String getColour() 
	{
		return colour;
	}
	public void setColour(String colour) 
	{
		this.colour = colour;
	}

	public String getModel() 
	{
		return model;
	}
	public void setModel(String model) 
	{
		this.model = model;
	}

	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}

	public static void main(String[] args)
	{
		Vehicle v = new Vehicle("BMW","Blue","2019",1898643);
		
		System.out.println("By Setter&Getter calling:");
		System.out.println();
//		v.setCarName("TATA");
//		v.setColour("black");
//		v.setModel("2020");
//		v.setPrice(1500000);
//		System.out.println("Car Name : " + v.getCarName());
//		System.out.println("Car Colour : " + v.getColour());
//		System.out.println("Car Model : " + v.getModel());
//		System.out.println("Car Price : " + v.getPrice());
		System.out.println("----------------------------------------------------");
		System.out.println("By Constructor calling:");
		System.out.println();
		System.out.println(v.carName);
		System.out.println(v.colour);
		System.out.println(v.model);
		System.out.println(v.price);
	}

}




/*
 * Constructor                                               Getter & Setter
 * 
 * Initialize object                                          Access and modify private variables
 * 
 * Automatically during                                       whenever you need we can created
 * object created                                                   
 * 
 * no return type                                              getter: return the variable value
 *                                                             setter:return void
 * 
 * 
 * not used in Encapsulation                                    used in Encapsulation
 * 
 * 
 * car c = new car("TATA");                                      p.setName("Sharath")
 *                                                               String name=p.getName();
 *                                                                 
 * 
 * 
 * 
 * 
 */
