package com.xworkz.core.Strings;

public class DustbinStarter {

	public static void main(String[] args) {
		
		int  shoeSize=9;
		Integer SlipperSize=15;
		System.out.println(SlipperSize.intValue());
		
		
		
		double productSize=123.1;
		Double aSize=15.1;
		System.out.println(aSize.doubleValue());
		
		
		
		int a=20;
		Integer aa=30;
		System.out.println(aa.valueOf(a));
		
	
		
		
		long phoneNo=91234;
		Long pNumber=28923L;
		System.out.println(pNumber.valueOf(SlipperSize));
		
		
		
	boolean b1=true;
	boolean b2=false;
	String  s1=String.valueOf(b1);
	String  s2=String.valueOf(b2);
	System.out.println(s1);
	System.out.println(s2);
        
	
	
	boolean a1=true;
	boolean a2=false;
	String  ref1=Boolean.toString(a1);
	String  ref2=Boolean.toString(a2);
	System.out.println(ref1);
	System.out.println(ref2);
	
	
	String first="java programs";
	String second="java programs";
	String third="python programs";
	boolean result=first.equals(second);
	System.out.println("String first and second are equal:"+result);
	
	
	boolean result2=first.equals(third);
	System.out.println("Strings first and Third are equal:"+result2);
	}


	

}
