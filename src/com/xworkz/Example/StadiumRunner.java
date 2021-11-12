package com.xworkz.Example;

import com.xworkz.Example.MethodoverridExample.*;

public class StadiumRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		{
			Stadium studium=new Stadium();
				System.out.println(studium);
				System.out.println(studium.hashCode());
				System.out.println(System.identityHashCode(studium));
				
				Stadium studium2=new Stadium();
				System.out.println(2);
				System.out.println(studium2.hashCode());
				System.out.println(System.identityHashCode(studium2));
				
				studium.setName("salt lake");
				  studium.setName("factord");
				   
				   boolean equal=studium.equals(studium2);
				 
				System.out.println(equal);
					
				
	}

	}
}
