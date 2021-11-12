package com.xworkz.Example.MethodoverridExample;

public class Stadium {
	private String name;
	private String city;
	private float areaInMeters;
	
	
	public Stadium()
	{
		
	}


	public Stadium(String name, String city, float areaInMeters) {
		super();
		this.name = name;
		this.city = city;
		this.areaInMeters = areaInMeters;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getCity() {
		return city;
	}


	public void setCity(String city) {
		this.city = city;
	}


	public float getAreaInMeters() {
		return areaInMeters;
	}


	public void setAreaInMeters(float areaInMeters) {
		this.areaInMeters = areaInMeters;
	}
	
	public String toString() {
		System.out.println("invoking stadium name");
	
	return "eden gardens";
	}
    public boolean equals(Object obj)
    {
  	  System.out.println("invoking gardens from eqaul");
    
    if(obj==null)
    {
  	  System.out.println("passing values");
  	  return false;
    
     }
    if(obj instanceof Watch) 
    {
  	  System.out.println("correct argument passed");
  	  Stadium casted=(Stadium)obj;
  	  String castname=casted.name;
  	  if(this.name.equals( castname))
        {
System.out.println("Studium  matched");
return false;
  }
    
else
{
System.err.println("studiun name not matched");
}
    }
    else
{
System.err.println("show me correct answers");
}
    
return true;
  	  
    
    
    }
}
	


