package com.xworkz.Example.MethodoverridExample;

public class Plant {
	private static final float String = 0;
	private String name;
	private String alive;
	private String lifeSpan;
	private float type;
	
	
	public Plant()
	{
	}


	public Plant(String name, String alive, String lifeSpan, float type) {
		super();
		this.name = name;
		this.alive = alive;
		this.lifeSpan = lifeSpan;
		this.type = type;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getAlive() {
		return alive;
	}


	public void setAlive(String alive) {
		this.alive = alive;
	}


	public String getLifeSpan() {
		return lifeSpan;
	}


	public void setLifeSpan(String lifeSpan) {
		this.lifeSpan = lifeSpan;
	}


	public float getType() {
		return type;
	}


	public void setType(String string) {
		this.type = String;
	}
	public String toString() {
		System.out.println("invoking palnt brand");
	
	return "China Pink";
	}
    public boolean equals(Object obj)
    {
  	  System.out.println("invoking plant from eqaul");
    
    if(obj==null)
    {
  	  System.out.println("passing values");
  	  return false;
    
     }
    if(obj instanceof Plant) 
    {
  	  System.out.println("correct argument passed");
  	  Plant casted=(Plant) obj;
  	  String castname=casted.name;
  	  if(this.name.equals( castname))
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
