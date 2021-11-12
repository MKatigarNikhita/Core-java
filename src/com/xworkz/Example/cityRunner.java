package com.xworkz.Example;

import com.xworkz.Example.MethodoverridExample.*;

public class cityRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			City city=new City();
				System.out.println(city);
				System.out.println(city.hashCode());
				System.out.println(System.identityHashCode(city));
				
				City city2=new City();
				System.out.println(city2);
				System.out.println(city2.hashCode());
				System.out.println(System.identityHashCode(city2));
				
				city.setName("laxmeshwar");
				  city.setName("hubli");
				   
				   boolean equal=city.equals(city2);
				 
				System.out.println(equal);
					
				
	}

}
