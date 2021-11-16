package com.xworks.bridge;
import com.xworks.bridge.*;

public class AfricanCitizen implements VotingRule,TrafficRule, MarriageRules{

	@Override
	public boolean validAge(char gender, int age) {
		
		
		return false;
	}

	@Override
	public boolean validLicence() {
		
		return false;
	}

	@Override
	public String licenseNo() {
		System.out.println("cizitizen licenseNo");
		
		return "a2344";
	}

	@Override
	public boolean validInsurance() {
		
		return false;
	}

	@Override
	public int validAge() {
		System.out.println("cizitizen age is");
		return 18;
	}

	@Override
	public String validId() {
		System.out.println("cizitizen id is");
		
		return "a1234";
	}
	
	
	
}