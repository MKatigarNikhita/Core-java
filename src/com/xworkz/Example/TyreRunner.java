package com.xworkz.Example;

import com.xworkz.Example.MethodoverridExample.*;

public class TyreRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		{
			Tyre tyre=new Tyre();
				System.out.println(tyre);
				System.out.println(tyre.hashCode());
				System.out.println(System.identityHashCode(tyre));
				
				Tyre tyre2=new Tyre();
				System.out.println(tyre2);
				System.out.println(tyre2.hashCode());
				System.out.println(System.identityHashCode(tyre2));
				
				tyre.setBrand("eee");
				  tyre.setBrand("aaaa");
				   
				   boolean equal=tyre.equals(tyre2);
				 
				System.out.println(equal);
					
				
	}

}
}