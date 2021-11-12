package com.xworkz.Example.MethodoverridExample;
public class Aeroplane {

	private int no;
	private String company;
	private String govt;
	
	
	public Aeroplane()
	
	{
		
	}


	public Aeroplane(int no, String company, String govt) {
		super();
		this.no = no;
		this.company = company;
		this.govt = govt;
	}


	public int getNo() {
		return no;
	}


	public void setNo(int no) {
		this.no = no;
	}


	public String getCompany() {
		return company;
	}


	public void setCompany(String company) {
		this.company = company;
	}


	public String getGovt() {
		return govt;
	}


	public void setGovt(String govt) {
		this.govt = govt;
	}
	
	public String toString() {
		System.out.println("invoking watch brand");
	
	return "AirIndia";
	}
    public boolean equals(Object obj)
    {
  	  System.out.println("invoking Aeroplane from eqaul");
    
    if(obj==null)
    {
  	  System.out.println("passing values");
  	  return false;
    
     }
    if(obj instanceof Watch) 
    {
  	  System.out.println("correct argument passed");
  	  Aeroplane casted=(Aeroplane) obj;
  	  String castcompany=casted.company;
  	  if(this.company.equals( castcompany))
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
