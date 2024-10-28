package com;

public class Sample {
	//static method calls the static method=directly
	public static void a(){
		System.out.println("I am a property");
		//b()-->if we call like this this is a stack overflow condition the control goes among these methods only
	}
	public static void b(){
		a();
		System.out.println("I am b property");
	}
	public static void main(String[] args) {
		a();
	}

}
