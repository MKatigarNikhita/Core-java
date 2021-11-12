package com.xworkz.Example.MethodoverridExample;

public class Fish {

	
	private String name;
	private String type;
	private int price;
	private String color;
	
	
	public Fish()
	{
		
	}


	public Fish(String name, String type, int price, String color) {
		super();
		this.name = name;
		this.type = type;
		this.price = price;
		this.color = color;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getType() {
		return type;
	}


	public void setType(String type) {
		this.type = type;
	}


	public int getPrice() {
		return price;
	}


	public void setPrice(int price) {
		this.price = price;
	}


	public String getColor() {
		return color;
	}


	public void setColor(String color) {
		this.color = color;
		
	
	}
	public String toString() {
		System.out.println("invoking fish brand");
	
	return "Sark";
	}
    public boolean equals(Object obj)
    {
  	  System.out.println("invoking fish from eqaul");
    
    if(obj==null)
    {
  	  System.out.println("passing values");
  	  return false;
    
     }
    if(obj instanceof Fish) 
    {
  	  System.out.println("correct argument passed");
  	  Fish casted=(Fish) obj;
  	  String castname=casted.name;
  	  if(this.type.equals( castname))
        {
System.out.println("fish matched");
return false;
  }
    
else
{
System.err.println("fish not matched");
}
    }
    else
{
System.err.println("show me correct answers");
}
    
return true;
  	  
    
	
}
}