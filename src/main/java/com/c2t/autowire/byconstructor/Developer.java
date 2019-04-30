package com.c2t.autowire.byconstructor;

public class Developer {
	private Language language;

	public Developer(Java j) {
		System.out.println("this is constructor222");
	}
	
	public Developer(Language language) {
		this.language = language;
		System.out.println("this is constructor111");
	}
	
/*	public Developer(Language language, Java j) {
		this.language = language;
		System.out.println("this is constructor111,222");
	}*/
	
	
	
	/*public Developer(Language language, Java language2) {
		this.language = language;
		System.out.println("two");
	}
*/
	@Override
	public String toString() {
		return "Developer [language=" + language + "]";
	}

}