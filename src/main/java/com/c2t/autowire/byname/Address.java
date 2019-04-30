package com.c2t.autowire.byname;
 
public class Address 
{
	private String fulladdress;

	public String getFulladdress() {
		return fulladdress;
	}

	public void setFulladdress(String fulladdress) {
		this.fulladdress = fulladdress;
		//System.out.println(fulladdress);
	}

	@Override
	public String toString() {
		return "Address [fulladdress=" + fulladdress + "]";
	}
	
}