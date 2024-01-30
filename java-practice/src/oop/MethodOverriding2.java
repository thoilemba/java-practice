package oop;

class Parent3 {
	
	static void print() {
		System.out.println("Static method of Parent");
	}
}

class Child3 extends Parent3 {
	
	static void print() {  // this becomes specialized method
		System.out.println("Static method of Child");
	}
}

public class MethodOverriding2 {
	
	public static void main(String args[]) {				
		
//		Parent3 p = new Child3();  // upcasting
//		p.print(); 
	}
}