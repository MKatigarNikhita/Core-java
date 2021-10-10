class Curtain
{
private String material="Cotton";
private String brand="dekor World";
private String color="White";
private int size=44;
private float itemweight=330;

Curtain()
{
	
}



String getMaterial()
	{
		return this.material;
	}
String  getBrand()
	{
		return this.brand;
	}
String  getColor()
	{
		return this.color;
	}
int  getSize()
	{
		return this.size;
	}
float  getItemweight()
	{
		return this.itemweight;
	}
	
void setMaterial(String material)
	{
       this.material=material;
		
	}
void setBrand(String brand)
	{
       this.brand=brand;
		
	}
void setColor(String color)
	{
       this.color=color;
		
	}
void setSize(int size)
	{
       this.size=size;
		
	}
void setItemweight(float itemweight)
	{
       this.itemweight=itemweight;
		
	}


}