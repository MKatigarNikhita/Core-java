package com.xworkz.Example.MethodoverridExample;

public class Sock {

	private int size;
	private float price;
	private String material;
	private String type;
	public Sock()
	{
		
	}
	public Sock(int size, float price, String material, String type) {
		super();
		this.size = size;
		this.price = price;
		this.material = material;
		this.type = type;
	}
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public String getMaterial() {
		return material;
	}
	public void setMaterial(String material) {
		this.material = material;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
	public String toString() {
		System.out.println("invoking Sock type");
	return "ankelsock";
	
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
  	  Sock casted=(Sock) obj;
  	  String castmaterial=casted.material;
  	  if(this.type.equals( castmaterial))
        {
System.out.println("sock matched");
return false;
  }
    
else
{
System.err.println("sock not matched");
}
    }
    else
{
System.err.println("show me correct answers");
}
    
return true;
  	  
    
    
	
	

}
	
}
