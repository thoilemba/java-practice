package oop;

class Circle {
	
	private float radius;
	static private float pi = 3.14f;
	
	Circle(float radius){
		this.radius = radius;
	}
	
	public float getArea() {
		return pi*radius*radius;
	}
}

public class StaticExample {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle c1 = new Circle(5);
		System.out.println(c1.getArea());
		
		Circle c2 = new Circle(10);
		System.out.println(c2.getArea());
	}

}
