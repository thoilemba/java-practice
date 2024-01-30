package oop;

class Demo {
	Demo() {
		System.out.println("Parent constructor");
	}
	
	{
		System.out.println("Parent instance block");
	}
	
	static {
		System.out.println("Parent static block");
	}
}

public class Flow2 extends Demo {
	
	{
		System.out.println("Child instance block");
	}
	
	Flow2() {
		
		System.out.println("Child constructor");
	}
	
	static {
		System.out.println("Child static block");
	}

	public static void main(String args[]) {
		new Flow2();
	}
}