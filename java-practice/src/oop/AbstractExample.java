package oop;

abstract class Animal {
	
	abstract void eats();
	
	abstract void walks();
}

class Bird extends Animal {
	
	void eats() {
		System.out.println("Bird eats insects.");
	}
	
	void walks() {
		System.out.println("Bird flies.");
	}
}

class Cat extends Animal {
	
	void eats() {
		System.out.println("Cat eats meats.");
	}
	
	void walks() {
		System.out.println("Cat walks and runs.");
	}
}

class Functions {
	
	static void display(Animal ref) {
		ref.eats();
		ref.walks();
	}
}

public class AbstractExample {
	
	

	public static void main(String[] args) {
		
		Bird bird = new Bird();
		Cat cat = new Cat();
		
		Functions.display(bird);
		Functions.display(cat);
		
	}

}
