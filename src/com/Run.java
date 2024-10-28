package com;

public class Run {
	//non-static method calls static method =directly
	public static void a() {
		System.out.println("i am static method");
	}
	public static  void b() {
		System.out.println("i am non static method");
	}
    public static void main(String[] args) {
    	a();
    	b();
		
    }
}
