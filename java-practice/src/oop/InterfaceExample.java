package oop;

interface Math1 {
	default void fun() {
		System.out.println("Default Method of Math1 interface");
	}
}

interface Math2 {
	default void fun() {
		System.out.println("Default Method of Math2 interface");
	}
}

class Operation implements Math1, Math2 {

	@Override
	public void fun() {
		System.out.println("Overridding Method of class Operation");
	}

	public void display() {
		fun();
		Math1.super.fun(); // calling overridden method of Math1
		Math2.super.fun(); // calling overridden method of Math2
	}
}

interface A {
	int x = 10; // public, static and final by default
}

interface B {
	int x = 20; // public, static and final by default
}

public class InterfaceExample implements A, B{

	public static void main(String args[]) {

		Operation op = new Operation();
		op.display();
		
//		System.out.println(x); // ambiguity error
		System.out.println(A.x);
		System.out.println(B.x);
	}
}