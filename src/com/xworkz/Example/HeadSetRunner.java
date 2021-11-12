package com.xworkz.Example;

import  com.xworkz.Example.MethodoverridExample.*;

public class HeadSetRunner {

	
	
	public static void main(String[] args)
	{
		 HeadSet headset=new HeadSet();
			System.out.println(headset);
			System.out.println(headset.hashCode());
			System.out.println(System.identityHashCode(headset));
			
			
			HeadSet headset2=new HeadSet();
			System.out.println(headset2);
			System.out.println(headset2.hashCode());
			System.out.println(System.identityHashCode(headset2));
			
			headset.setType("in ear");
			headset.setType("earbubs");
			   
			   boolean equal=headset.equals(headset2);
			 
			System.out.println(equal);
				
		}
}

