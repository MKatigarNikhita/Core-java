package com.xworkz.core.Strings;

public class TrainStater {
	
	public static void main(String[] args) {
		String trainNo="02845";
		trainNo=trainNo.concat("anu travelled to meet mom");
		System.out.println(trainNo);
		
		
		String trainNo1=new String("0287");
		trainNo=trainNo1.concat("anu is back");
		System.out.println(trainNo1);
		System.out.println(trainNo);
		System.out.println(trainNo1+null);
		
		
		
		
		String max=null;
		System.out.println(max);
		
		String hospital=new String("jaydeva");
		hospital=hospital.toUpperCase();
		System.out.println(hospital);
		
		hospital=hospital.toLowerCase();
		System.out.println(hospital);
		
		String hospital1=new String("jaydeva");
		hospital1.toUpperCase();
		System.out.println(hospital1);
		
		
		if(hospital==hospital1)
		{
			System.out.println("both hospital and hospital1 pointing tosame memory");
			
		}
		else 
		{
			System.out.println("both hospital and hospital1 pointing to different memory");
		}

	
	String medicine="Dolo 65";
	String instanceMedicine=new String("Dolo 65");
	if(medicine==instanceMedicine)
	System.out.println("both medicine and instance medicine are same memory");

else 
{
	
	System.out.println("both medicine and instance medicine are different memory");
}

	
	medicine="45";
	boolean equal=medicine.equals(null);
	System.out.println("both content is"+equal);
	
	medicine=null;
	{
		System.out.println(medicine);
		medicine=medicine.toUpperCase();
		System.out.println(medicine);
	}
	

}
}