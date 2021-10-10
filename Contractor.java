class Contractor
{
private String name="anu";
private int  age=45;
private float since=1978;
private float experience=4;
private String location="banglore";
private String qualification="BE";

Contractor()
{
	
}



String getName()
	{
		return this.name;
	}
int  getAge()
	{
		return this.age;
	}
float getSince()
	{
		return this.since;
	}
float  getExperience()
	{
		return this.experience;
	}
String  getLocation()
	{
		return this.location;
	}
String  getQualification()
	{
		return this.qualification;
	}



	
void setName(String name)
	{
       this.name=name;
		
	}
void setAge(int age)
	{
       this.age=age;
		
	}
void setSince(int since)
	{
       this.since=since;
		
	}
void setExperience(float Experience)
	{
       this.experience=experience;
		
	}

void setLocation(String location)
	{
       this.location=location;
		
	}
void setQualification(String qualification)
	{
       this.qualification=qualification;
		
	}



}