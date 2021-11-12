package com.xworkz.Example;

import com.xworkz.Example.MethodoverridExample.*;

public class AeroplaneRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		{
			  Aeroplane	aeroplane=new Aeroplane();
				System.out.println(aeroplane);
				System.out.println(aeroplane.hashCode());
				System.out.println(System.identityHashCode(aeroplane));
				
				Aeroplane aeroplane2=new Aeroplane();
				System.out.println(aeroplane2);
				System.out.println(aeroplane2.hashCode());
				System.out.println(System.identityHashCode(aeroplane2));
				
				aeroplane.setCompany("go first");
				aeroplane.setCompany("TruJet");
				   
				   boolean equal=aeroplane.equals(aeroplane2);
				 
				System.out.println(equal);
					
				
	}

}
}
