class  ContractorRunner
{
public static void main(String[] args)
{
	Contractor ref=new Contractor();
	String name=ref.getName();
	System.out.println("The contractor name is:"+name);
	
	
	int age=ref.getAge();
	System.out.println("The Contractor type is:"+age);
	float since =ref.getSince();
	System.out.println("The Contractor Since is:"+since);
	float experience=ref.getExperience();
	System.out.println("The Contractor Experience:"+experience);
	String location=ref.getLocation();
	System.out.println(" Contractor location: "+location);
	String qualification=ref.getQualification();
	System.out.println(" Contractor qualification: "+qualification);
	
	
	
	
	ref.setName("anu");
	String name1=ref.getName();
	System.out.println("The contractor name is:"+name1);
	
	ref.setAge(34);
	int age1=ref.getAge();
	System.out.println("The contractor age is:"+age1);
	
	ref.setSince(1996);
	float since1=ref.getSince();
	System.out.println("The contractor since is:"+since1);
	
	ref.setExperience(39);
	float experience1=ref.getExperience();
	System.out.println("The contractor Experience is:"+experience1);
	
	
	ref.setLocation("banglore");
	String location1=ref.getLocation();
	System.out.println("The contractor location is:"+location1);
	
	ref.setQualification("BE");
	String qualification1=ref.getQualification();
	System.out.println("The contractor qualification is:"+qualification1);
	
	
	
	
	

}
}