package oop;

class Parent {
	
	public void fun() {
		System.out.println("Parent Method 1");
	}
	
	public void fun2() {
		System.out.println("Parent Method 2");
	}
	
}

class Child extends Parent {
	
	public void fun2() {
		System.out.println("Parent's method 2 overridden by child");
	}
	
	public void fun3() {
		System.out.println("Child's specialised method");
	}
}


public class Inheritance {

	public static void main(String[] args) {
		
		Child c1 = new Child();
		c1.fun(); // inherited method
		c1.fun2(); // overridden method
		c1.fun3(); // specialized method
	}

}
