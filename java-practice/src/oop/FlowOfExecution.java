package oop;

class Example5 {
	
	int i = 200;
	
	{
		System.out.println("Instance block of another class : "+i);
	}
	
	Example5(){
		
		System.out.println("Constructor of another class called.");
	}
	
	static String s = "World";
	
	static {
		System.out.println("Static block of another class : "+s);
	}
	
	
}

public class FlowOfExecution {
	
	int i = 100;
	
	FlowOfExecution(){
		System.out.println("Constructor of the same class called.");
	}
	
	{
		System.out.println("Instance block of same class : "+i);
	}
	
	static String s = "Hello";

	static {
		System.out.println("Static block of same class : "+s);
	}

	public static void main(String[] args) {
		System.out.println("main method called.");
		new Example5();
		new FlowOfExecution();
	}
}
