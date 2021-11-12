package com.xworkz.Example.MethodoverridExample;

public class Shoe {
	private int size;
	private  String brand;
	private String color;
	private String gender;
	
	public Shoe()
	{
		
	}

	public Shoe(int size, String brand, String color, String gender) {
		super();
		this.size = size;
		this.brand = brand;
		this.color = color;
		this.gender = gender;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public String getBrand() {
		return brand;
	}

	public static void setBrand(String brand) {
		brand = brand;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}
	public String toString() {
		System.out.println("invoking Show brand");
	return "Bata";
	}
	
	
	public boolean equals(Object obj)
    {
  	  System.out.println("invoking ipod from eqaul");
    
    if(obj==null)
    {
  	  System.out.println("passing values");
  	  return false;
    
     }
    if(obj instanceof Shoe) 
    {
  	  System.out.println("correct argument passed");
  	  Shoe casted=(Shoe) obj;
  	  String castbrand=casted.brand;
  	  if(this.brand.equals( castbrand))
        {
System.out.println("shoe matched");
return false;
  }
    
else
{
System.err.println("shoe not matched");
}
    }
    else
{
System.err.println("show me correct answers");
}
    
return true;
  	  
    
    
}
