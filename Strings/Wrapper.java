package com.xworkz.core.Strings;

public class Wrapper {

	public static void main(String[] args) {
		
		byte b=45;
		Byte str=55;
		Byte  x=new Byte(b);
		Byte  y=new Byte(str);
		System.out.println("toString(b)="+Byte.toString(b));
		
		 Byte z=Byte.valueOf(b);
		 System.out.println("valueOf(b)"+ z);
		 
		 
		 
		 
		 
		 int a=5;
		 Integer aObj=Integer.valueOf(a);
		 System.out.println(aObj.valueOf(a));
		 
		 
		 Integer intObj1=new Integer(35);
		 Integer intObj2=new Integer("45");
		 Integer intObj3=new Integer(70);
		 System.out.println("comparing obj1 and obj2:" +intObj1.compareTo(intObj2));
		 System.out.println("comparing obj1 and obj3:" +intObj1.compareTo(intObj3));
		 System.out.println("comparing obj1 and obj2:" +intObj1.compareTo(intObj1));
		 
		 
		Number num=new Integer("25");
		 System.out.println("float value of the number:"+num.floatValue()); 
		 System.out.println("double value of the number:"+num.doubleValue()); 
		 System.out.println("long value of the number:"+num.longValue()); 
		 System.out.println("short value of the number:"+num.shortValue());
		 
		 
		 
      
		
       
	}

}
