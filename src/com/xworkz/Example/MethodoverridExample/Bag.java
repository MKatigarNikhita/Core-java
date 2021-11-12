package com.xworkz.Example.MethodoverridExample;

public class Bag {
	
	private float price;
	private String color;
    private String type;
    
    public Bag()
    {
    	
    }

	public Bag(float price, String color, String type) {
		super();
		this.price = price;
		this.color = color;
		this.type = type;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}


	public String toString() {
		System.out.println("invoking watch color");
	
	return "black";
	}
	 public boolean equals(Object obj)
	    {
	  	  System.out.println("invoking bag from eqaul");
	    
	    if(obj==null)
	    {
	  	  System.out.println("passing values");
	  	  return false;
	    
	     }
	    if(obj instanceof Watch) 
	    {
	  	  System.out.println("correct argument passed");
	  	  Bag casted=(Bag) obj;
	  	  String castcolor=casted.color;
	  	  if(this.type.equals( castcolor))
	        {
	System.out.println("bag color matched");
	return false;
	  }
	    
	else
	{
	System.err.println("bag number not matched");
	}
	    }
	    else
	{
	System.err.println("show me correct answers");
	}
	    
	return true;
	  	  
	    
	    
		
   

	    }
}
