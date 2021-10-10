class DeveloperRunner
{
public static void main(String[] args)
{
	Developer ref=new Developer();
	String name=ref.getName();
	System.out.println("The developer name is:"+name);
	
	
	String type=ref.getType();
	System.out.println("The developer type is:"+type);
	float salary =ref.getSalary();
	System.out.println("The developer Salary is:"+salary);
	int experience=ref.getExperience();
	System.out.println("The developer Experience:"+experience);
	
	
	
	
	ref.setName("anu");
	String name1=ref.getName();
	System.out.println("The developer name is:"+name1);
	
	ref.setType("android developer");
	String type1=ref.getType();
	System.out.println("The developer type is:"+type1);
	
	ref.setSalary(20000);
	float salary1=ref.getSalary();
	System.out.println("The developer]salary is:"+salary1);
	
	ref.setExperience(39);
	int experience1=ref.getExperience();
	System.out.println("The developer Experience is:"+experience1);
	
	
	
	

}
}