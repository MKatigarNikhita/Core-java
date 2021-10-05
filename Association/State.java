class State
{
	String name;
	int noOfDistricts;
	String cmName;
	CapitalCity capitalcity;
	
	
	State(String cmName)
	{
		this.cmName=cmName;
	
	}
	
	
	State(String name,String cmName,int noOfDistricts)
{
	this(cmName);
	this.name=name;
	this.noOfDistricts=noOfDistricts;
}	
	
}