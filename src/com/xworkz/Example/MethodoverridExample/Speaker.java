package com.xworkz.Example.MethodoverridExample;

public class Speaker {
	
	
	public void toString1() {
		System.out.println("invoking Sock type"); 

	}
	
	@Override
	protected void finalize() throws Throwable {
		System.out.println("invoking finalize  for speaker class");
		super.finalize();
	}
}
