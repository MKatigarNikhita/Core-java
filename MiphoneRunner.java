class MiphoneRunner
{
public static void main(String[] args)
{
	MiPhone ref=new MiPhone();
	ref.setBrand("redmi note");
	System.out.println(ref.brand);
	
	ref.setPrice(10000);
	System.out.println(ref.price);
	
	ref.setColor("blue");
	System.out.println(ref.color);
	
	
	ref.setIme1(123);
	System.out.println(ref.ime1);
	
	
	
	PhonePay ref1=new PhonePay();
	ref1.setCompany("phonepe india");
	System.out.println(ref1.company);
	ref1.setVersion(13);
	System.out.println(ref1.version);
	ref1.setArchitect("aa");
	System.out.println(ref1.architect);
	ref1. setWorking(true);
	System.out.println(ref1.working);
	
	
}
}	