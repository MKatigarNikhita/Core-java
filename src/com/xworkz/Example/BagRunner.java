package com.xworkz.Example;

import com.xworkz.Example.MethodoverridExample.*;

public class BagRunner {

	public static void main(String[] args) {
		
		
	
		
		
			    Bag bag=new Bag();
				System.out.println(bag);
				System.out.println(bag.hashCode());
				System.out.println(System.identityHashCode(bag));
				
				Bag bag2=new Bag();
				System.out.println(bag2);
				System.out.println(bag2.hashCode());
				System.out.println(System.identityHashCode(bag2));
				
				bag.setColor("red");
				  bag.setColor("blue");
				   
				   boolean equal=bag.equals(bag2);
				 
				System.out.println(equal);
					
				

	}

}
