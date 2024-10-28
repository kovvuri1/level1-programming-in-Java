package com;
public class WorkFlow {
	
//	write different methods for following Requirement
//	1.Turning on the laptop
//	2.open google chrome
//	3.search for the movie
//	4.watch movie
//	5.Turn off the laptop
	
	public static void start() {
		System.out.println("Turning on the Laptop");
		WorkFlow w=new WorkFlow();
		w.openchrome();
	}
	
	public void openchrome() {
		System.out.println("Opening Google Chrome");
		search();
	}
	public static void search() {
		System.out.println("Searching for Movie");
		WorkFlow w=new WorkFlow();
		w.watch();
		
	}
	public void watch() {
		System.out.println("Watching Movie");
		end();
	}
	public void end() {
		System.out.println("Turn Off the Laptop...........");
	}
	public static void main(String[] args) {
		start();
		
	}

}
