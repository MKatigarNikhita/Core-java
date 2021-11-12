package com.xworkz.Example;

import com.xworkz.Example.MethodoverridExample.*;

public class ShoeRunner {
	
	
	{
		Shoe shoe=new Shoe();
			System.out.println(shoe);
			System.out.println(shoe.hashCode());
			System.out.println(System.identityHashCode(shoe));
			
			Shoe shoe2=new Shoe();
			System.out.println(shoe2);
			System.out.println(shoe2.hashCode());
			System.out.println(System.identityHashCode(shoe2));
			
			Shoe.setBrand("Woodland");
			  Shoe.setBrand("Woodland1");
			   
			   boolean equal=shoe.equals(shoe2);
			 
			System.out.println(equal);
				
			
	}
}



