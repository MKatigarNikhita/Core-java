class MiPhone
{
	String brand;
	float price;
	String color;
	long ime1;
	String phonepay;
	
	MiPhone()
	{
		
	}
	
	
	MiPhone(String brand,float price,String color,long ime1,String phonepay)
	{
		this.brand=brand;
		this.price=price;
		this.color=color;
		this.ime1=ime1;
		this.phonepay=phonepay;
		
	}
	MiPhone(String brand,float price,String color)
	{
		this.brand=brand;
		this.price=price;
		this.color=color;
	}
	void setBrand(String brand)
	{
		this.brand=brand;
	}
	
	void setPrice(float price)
	{
		this.price=price;
		
	}
    void setColor(String color)
	{
		this.color=color;
	}
	void setIme1(long ime1)
	{
		this.ime1=ime1;
		
	}
	void setPhonepay(String phonepay)
	{
		this.phonepay=phonepay;
	}
}
