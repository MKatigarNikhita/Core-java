package com.xworks.bridge;
import com.xworks.bridge.constant.*;

public class IndianCitizen implements VotingRule,TrafficRule, MarriageRules
{

	private String name="Anu";
	private Address address;
	@Override
	public boolean validAge(char gender, int age) {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public boolean validLicence() {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public String licenseNo() {
		// TODO Auto-generated method stub
		return "ab423";
	}
	@Override
	public boolean validInsurance() {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public int validAge() {
		// TODO Auto-generated method stub
		return 18;
	}
	@Override
	public String validId() {
		// TODO Auto-generated method stub
		return "ab123";
	}
	public void displayNameAndDetails(String name,Address address)
	{
		
		System.out.println(this.name);
		System.out.println(this.address);
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	
}
	
	