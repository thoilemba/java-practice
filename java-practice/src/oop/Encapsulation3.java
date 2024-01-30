package oop;

class Example4 {
	
	private String name;
	
	// "this" refers to the current object
	public void setName(String name) {
		this.name = name;
		System.out.println(this);
	}
	
	public String getName() {
		return this.name;
	}
}

public class Encapsulation3 {
	
	public static void main(String[] args) {
		Example4 obj1 = new Example4();
		obj1.setName("Thoi");
		System.out.println(obj1);
		System.out.println(obj1.getName());
		
		Example4 obj2 = new Example4();
		obj2.setName("Lemba");
		System.out.println(obj2);
		System.out.println(obj2.getName());
	}
}
