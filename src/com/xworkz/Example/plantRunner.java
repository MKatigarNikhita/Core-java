
package com.xworkz.Example;

import  com.xworkz.Example.MethodoverridExample.*;

public class plantRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		{
			Plant plant=new Plant();
				System.out.println(plant);
				System.out.println(plant.hashCode());
				System.out.println(System.identityHashCode(plant));
				
				Plant plant2=new Plant();
				System.out.println(plant2);
				System.out.println(plant2.hashCode());
				System.out.println(System.identityHashCode(plant2));
				
				plant.setType("digital");
				  plant.setType("analog");
				   
				   boolean equal=plant.equals(plant2);
				 
				System.out.println(equal);
					
				
		}
	}


	}


