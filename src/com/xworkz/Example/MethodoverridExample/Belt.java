
package com.xworkz.Example.MethodoverridExample;

public class Belt {
	
	private float price;
	private String material;
	private int size;
	private String gemder;
	
	Belt()
	{
	}

	public Belt(float price, String material, int size, String gemder) {
		super();
		this.price = price;
		this.material = material;
		this.size = size;
		this.gemder = gemder;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public String getGemder() {
		return gemder;
	}

	public void setGemder(String gemder) {
		this.gemder = gemder;
	}
	
	}

}
