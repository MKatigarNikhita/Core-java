
package com.xworkz.Example.MethodoverridExample;

public class Watch {
	
	private String brand;
	private String type;
	private int price;
	
	public Watch()
	{
	}

	public Watch(String brand, String type, int price) {
		super();
		this.brand = brand;
		this.type = type;
		this.price = price;
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

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	public String toString() {
		System.out.println("invoking watch brand");
	
	return "Sonata";
	}
    public boolean equals(Object obj)
    {
  	  System.out.println("invoking ipod from eqaul");
    
    if(obj==null)
    {
  	  System.out.println("passing values");
  	  return false;
    
     }
    if(obj instanceof Watch) 
    {
  	  System.out.println("correct argument passed");
  	  Watch casted=(Watch) obj;
  	  String casttype=casted.type;
  	  if(this.type.equals( casttype))
        {
System.out.println("model number matched");
return false;
  }
    
else
{
System.err.println("model number not matched");
}
    }
    else
{
System.err.println("show me correct answers");
}
    
return true;
  	  
    
    
	
	

}
}
