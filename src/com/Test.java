package com;
public class Test {
	//non-static method calls non-static method=DIRECTLY
	
	public void run() {
		System.out.println("i am running");
	}
	public void walk() {
		run();
		System.out.println("i am walking");
	}
	public static void main(String[] args) {
		Test a=new Test();
		a.walk();
	}

}
