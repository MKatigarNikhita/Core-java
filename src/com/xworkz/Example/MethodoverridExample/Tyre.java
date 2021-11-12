package com.xworkz.Example.MethodoverridExample;

public class Tyre {
	
	private String brand;
	private String  type;
	private float price;
	
	
	public Tyre()
	{
		
	}


	public String getBrand() {
		return brand;
	}


	public void setBrand(String brand) {
		this.brand = brand;
	}


	public String getType() {
		return type;
	}


	public void setType(String type) {
		this.type = type;
	}


	public float getPrice() {
		return price;
	}


	public void setPrice(float price) {
		this.price = price;
	}
	
	public String toString()
	{
	
System.out.println("invoking watch brand");
return "aa";
	}
    public boolean equals(Object obj)
    {
  	  System.out.println("invoking ipod from eqaul");
    
    if(obj==null)
    {
  	  System.out.println("passing values");
  	  return false;
    
     }
    if(obj instanceof Tyre) 
    {
  	  System.out.println("correct argument passed");
  	  Tyre casted=(Tyre) obj;
  	  String castbrand=casted.brand;
  	  if(this.type.equals( castbrand))
        {
System.out.println("Tyre matched");
return false;
  }
    
else
{
System.err.println("Tyre not matched");
}
    }
    else
{
System.err.println("show me correct answers");
}
    
return true;
  	  
    
    
	
    }
	

}
