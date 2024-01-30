package oop;


// Local chaining example
class ConstructorExample {
	
	String name;
	int age;
	
	ConstructorExample(){
		this("hi");
		System.out.println("Constructor having no parameter called.");
	}
	
	ConstructorExample(String name){
		this("Hello", 30);
		System.out.println("Constructor having two parameter called.");
	}
	
	ConstructorExample(String name, int age){
		System.out.println("Constructor having three parameter called.");
	}
}

public class Constructor {

	public static void main(String[] args) {
		
		ConstructorExample obj1 = new ConstructorExample();
		System.out.println(obj1.age);
		System.out.println(obj1.name);
		
	}

}
