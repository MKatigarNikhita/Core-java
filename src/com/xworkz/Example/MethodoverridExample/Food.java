package com.xworkz.Example.MethodoverridExample;

public class Food {
	
	private String name;
	private int price;
	private String quality;
	private String quantity;
	
	public Food()
	{
	
	}
	public Food(String name, int price, String quality, String quantity) {
		super();
		this.name = name;
		this.price = price;
		this.quality = quality;
		this.quantity = quantity;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getQuality() {
		return quality;
	}
	public void setQuality(String quality) {
		this.quality = quality;
	}
	public String getQuantity() {
		return quantity;
	}
	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}
	
	public String toString1() 
	{
		System.out.println("invoking food name");
        return "rice";
	}
	
	
	
	public boolean equals1(Object obj)
    {
  	  System.out.println("invoking ipod from eqaul");
    
    if(obj==null)
    {
  	  System.out.println("passing values");
  	  return false;
    
     }
    if(obj instanceof Food) 
    {
  	  System.out.println("correct argument passed");
  	  Food casted=(Food) obj;
  	  String castname=casted.name;
  	  if(this.name.equals( castname))
        {
System.out.println("Food matched");
return false;
  }
    }
    
else
{
System.err.println("Food not matched");
}
    
else
{
System.err.println("show me correct answers");
}
    
return true;
 }
    
public String toString() {
	System.out.println("invoking fish name");
    return "shark";
    }



public boolean equals(Object obj)
{
	  System.out.println("invoking ipod from eqaul");

if(obj==null)
{
	  System.out.println("passing values");
	  return false;

 }
if(obj instanceof Food) 
{
	  System.out.println("correct argument passed");
	  Food casted=(Food) obj;
	  String castname=casted.name;
	  if(this.name.equals( castname))
    {
System.out.println("Food matched");
return false;
}

else
{
System.err.println("Food not matched");
}
}
else
{
System.err.println("show me correct answers");
}

return true;
	  
  	  
}
}
