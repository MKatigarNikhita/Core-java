class CurtainRunner
{
public static void main(String[] args)
{
	Curtain ref=new Curtain();
	String material=ref.getMaterial();
	System.out.println("The Curtain material is:"+material);
	
	
	String brand=ref.getBrand();
	System.out.println("The Curtain Brand is:"+brand);
	String color=ref.getColor();
	System.out.println("The Curtain Color is:"+color);
	int size=ref.getSize();
	System.out.println("The Curtain Size is:"+size);
	float itemweight=ref.getItemweight();
	System.out.println("The Curtain Brand is:"+itemweight);
	
	
	
	ref.setMaterial("aa");
	String material1=ref.getMaterial();
	System.out.println("The Curtain material is:"+material1);
	
	ref.setBrand("bb");
	String brand1=ref.getBrand();
	System.out.println("The Curtain brand is:"+brand1);
	
	ref.setColor("pink");
	String color1=ref.getColor();
	System.out.println("The Curtain color is:"+color1);
	
	ref.setSize(39);
	int size1=ref.getSize();
	System.out.println("The Curtain size is:"+size1);
	
	
	ref.setItemweight(20);
	float itemweight1=ref.getItemweight();
	System.out.println("The Curtain itemweight is:"+itemweight1);
	

}
}