package com.xworkz.Example;
import com.xworkz.Example.MethodoverridExample.*;

public class WatchRunner {

	public static void main(String[] args)
	{
		Watch watch=new Watch();
			System.out.println(watch);
			System.out.println(watch.hashCode());
			System.out.println(System.identityHashCode(watch));
			
			Watch watch2=new Watch();
			System.out.println(watch2);
			System.out.println(watch2.hashCode());
			System.out.println(System.identityHashCode(watch2));
			
			watch.setType("digital");
			  watch.setType("analog");
			   
			   boolean equal=watch.equals(watch2);
			 
			System.out.println(equal);
				
			
	}
}
