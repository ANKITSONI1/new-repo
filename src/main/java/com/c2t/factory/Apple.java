package com.c2t.factory;

public class Apple {
	private static final Apple obj = new Apple();

	private Apple() {
		System.out.println("private constructor");
	}

	public static Apple getApple() {
		System.out.println("factory method ");
		return obj;
	}

	public void msg() {
		System.out.println("hello Apple");
	}
}