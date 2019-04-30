package com.c2t.factory;

public class PrinterFactory {
	public static Printer getPrinter() {
		// return new B();
		return new Dell();// return any one instance, either A or B
	}
}
