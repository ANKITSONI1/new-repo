package com.c2t.aop1;



public class CustomerBoImpl implements CustomerBo {
 
	/*public void addCustomer(TheDto dto){
		System.out.println("addCustomer() is running ::"+dto.getName());
	}*/
	
	public void addCustomer(String customer){
		//Logs
		System.out.println("addCustomer() is running customer:"+customer);
		System.out.println("Actual logic to add customer in db....");
	}
 
	public String addCustomerReturnValue(){
		System.out.println("addCustomerReturnValue() is running ");
		return "abc";
	}
 
	public void addCustomerThrowException() throws Exception {
		System.out.println("addCustomerThrowException() is running ");
		throw new Exception("Generic Error");
	}
 
	public void addCustomerAround(String name){
		System.out.println("addCustomerAround() is running, args : " + name);
	}
}