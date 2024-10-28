package com;
public class Walk {
	//static method calls non static method=object creation;
	//2 static and 2 non static methods
	public void go() {
		System.out.println("1");
		go1();
	}
    public void go1() {
    	System.out.println("2");
	}
	public static void run() {
		System.out.println("3");
		Walk a=new Walk();
		a.go();
	}
     public static void run1() { 
    	 System.out.println("4");
	}
	public static void main(String[] args) {
		run();
	}

}
