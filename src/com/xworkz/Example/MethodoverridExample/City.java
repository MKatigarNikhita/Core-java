package com.xworkz.Example.MethodoverridExample;

public class City {
	private String name;
	private String stateName;
	private String CountryName;
	
	
	public City()
	{
		
	}


	public City(String name, String stateName, String countryName) {
		super();
		this.name = name;
		this.stateName = stateName;
		CountryName = countryName;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getStateName() {
		return stateName;
	}


	public void setStateName(String stateName) {
		this.stateName = stateName;
	}


	public String getCountryName() {
		return CountryName;
	}


	public void setCountryName(String countryName) {
		CountryName = countryName;
	}
	public String toString() {
System.out.println("invoking city name");
	
	return "gadag";
	}
    public boolean equals(Object obj)
    {
  	  System.out.println("invoking city from eqaul");
    
    if(obj==null)
    {
  	  System.out.println("passing values");
  	  return false;
    
     }
    if(obj instanceof City) 
    {
  	  System.out.println("correct argument passed");
  	  City casted=(City) obj;
  	  String castname=casted.name;
  	  if(this.name.equals( castname))
        {
System.out.println("city name matched");
return false;
  }
    
else
{
System.err.println("city name not matched");
}
    }
    else
{
System.err.println("show me correct answers");
}
    
return true;
  	  
    
    
	
	

}
}
