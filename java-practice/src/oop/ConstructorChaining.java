package oop;

class Parent2 {
	
	Parent2(){
		System.out.println("No parameter parent constructor");
	}
	
	Parent2(int i){
		System.out.println("One parameter parent constructor");
	}
	
	Parent2(int i, int j){
		System.out.println("Two parameter parent constructor");
	}
}

class Child2 extends Parent2{
	
	Child2(){
		System.out.println("No parameter child constructor");
	}
	
	Child2(int i){
		super(i);
		System.out.println("One parameter child constructor");
	}
	
	Child2(int i, int j){
		super(i,j);
		System.out.println("Two parameter child constructor");
	}
	
}

// Child class constructor calling parent class constructor is called
// constructor chaining

public class ConstructorChaining {

	public static void main(String[] args) {
		new Child2();
		new Child2(10);
		new Child2(10,20);

	}

}
