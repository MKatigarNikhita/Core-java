package com.xworkz.Example.MethodoverridExample;

public class IceCream {

	private String name;
	private String flavour;
	private String type;
	
	public IceCream()
	{
	}

	public IceCream(String name, String flavour, String type) {
		super();
		this.name = name;
		this.flavour = flavour;
		this.type = type;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getFlavour() {
		return flavour;
	}

	public void setFlavour(String flavour) {
		this.flavour = flavour;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	public String toString() {
		System.out.println("invoking icecream type");
	return "venilla";
	
	}
	public boolean equals(Object obj)
    {
  	  System.out.println("invoking icecream from eqaul");
    
    if(obj==null)
    {
  	  System.out.println("passing values");
  	  return false;
    
     }
    if(obj instanceof Sock) 
    {
  	  System.out.println("correct argument passed");
  	  IceCream casted=(IceCream) obj;
  	  String casttype=casted.type;
  	  if(this.type.equals( casttype))
        {
System.out.println("sock matched");
return false;
  }
    
else
{
System.err.println("iceCream not matched");
}
    }
    else
{
System.err.println("show me correct answers");
}
    
return true;
  	  
    
    
	
	
	}
	
	
	

