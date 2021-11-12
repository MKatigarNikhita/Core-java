package com.xworkz.Example;
import com.xworkz.Example.MethodoverridExample.*;

public class ipodRunner 
{
	public static void main(String[] args) {
	
	Ipod ipod=new Ipod();
	System.out.println(ipod);
	System.out.println(ipod.hashCode());
	System.out.println(System.identityHashCode(ipod));
	
	Ipod ipod2=new Ipod();
	System.out.println(ipod2);
	System.out.println(ipod2.hashCode());
	System.out.println(System.identityHashCode(ipod2));
	
   ipod.setModelNo("HD123");
   ipod.setModelNo("HD1990");
   
   boolean equal=ipod.equals(ipod2);
 
System.out.println(equal);
	

	
	

}
}