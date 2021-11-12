package com.xworkz.Example;

import com.xworkz.Example.MethodoverridExample.*;

public class IceCreamRunner {
	
	
	{
		IceCream ob1=new IceCream();
			System.out.println(ob1);
			System.out.println(ob1.hashCode());
			System.out.println(System.identityHashCode(ob1));
			
			Watch ob2=new Watch();
			System.out.println(ob2);
			System.out.println(ob2.hashCode());
			System.out.println(System.identityHashCode(ob2));
			
			ob1.setType("digital");
			  ob2.setType("analog");
			   
			   boolean equal=ob1.equals(ob2);
			 
			System.out.println(equal);
				
			

}
}



