package com.c2t.aop1;
 
public interface CustomerBo {
 
	//void addCustomer(TheDto dto);
	
	void addCustomer(String customer);
 
	String addCustomerReturnValue();
 
	void addCustomerThrowException() throws Exception;
 
	void addCustomerAround(String name);
}