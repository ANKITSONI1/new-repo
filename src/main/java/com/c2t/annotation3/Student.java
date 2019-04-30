package com.c2t.annotation3;

import org.springframework.beans.factory.annotation.Value;

public class Student {
	
	@Value("spring")
	String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
