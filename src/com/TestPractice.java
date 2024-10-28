package com;
//create class called demo create 2 static methods create 2 non static method which 
//returns integer value by taking integer as an argument 
//call 2 static methods in second non static method create a main method and call 2 non static methods
public class TestPractice {
	public static void run(){
		System.out.println("running");	
	}
	public static void walk() {
		System.out.println("walking");	
	}
	public int sum(int a) {
		System.out.println("sun");
		return a;
		
	}
	public int add(int a) {
		run();
		walk();
		return a+10;
	}
	public static void main(String[] args) {
		TestPractice a=new TestPractice();
		int res=a.add(5);
		System.out.println(res);
	}
}
