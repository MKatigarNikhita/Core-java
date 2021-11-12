package com.xworkz.Example.MethodoverridExample;

public class HeadSet {
	private String  brand;
	private String type;
	private boolean battery;
	private String warranty;
	
	
	public HeadSet()
	{
		
	}


	public HeadSet(String brand, String type, boolean battery, String warranty) {
		super();
		this.brand = brand;
		this.type = type;
		this.battery = battery;
		this.warranty = warranty;
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


	public boolean isBattery() {
		return battery;
	}


	public void setBattery(boolean battery) {
		this.battery = battery;
	}


	public String getWarranty() {
		return warranty;
	}


	public void setWarranty(String warranty) {
		this.warranty = warranty;
	}
	
	
	public String toString() {
		System.out.println("invoking Headset type");
	return "earbuds";
	
	}
	public boolean equals(Object obj)
    {
  	  System.out.println("invoking ipod from eqaul");
    
    if(obj==null)
    {
  	  System.out.println("passing values");
  	  return false;
    
     }
    if(obj instanceof Sock) 
    {
  	  System.out.println("correct argument passed");
  	  HeadSet casted=(HeadSet) obj;
  	  String casttype=casted.type;
  	  if(this.type.equals( casttype))
        {
System.out.println("headset matched");
return false;
  }
    
else
{
System.err.println("headset not matched");
}
    }
    else
{
System.err.println("show me correct answers");
}
    
return true;
  	  
    
}
}
