package com.xworks.bridge;

public class SharavatiHostel implements HostelRule,VistingDay  {
	
	
	public int inTime() {
	System.out.println("invoking hostel");
	return 0;
		

	}
	
	public int  BreakFastTime() {
	
	
		System.out.println("invoking breakfast");
		return 0;
	}
	
	
	public int VistingDay()
	{
		System.out.println("invoking time");
		return 0;
	}
	
	
}
