package oop;

import java.util.Scanner;

abstract class Shape {
	
	// this constructor is automatically called by the child classes
	Shape(){
		System.out.println("Abstract class constructor");
	}
	
	float area;
	
	abstract void takeInput();
	abstract void calArea();
}

class Circle2 extends Shape {
	
	private float radius;
	
	Scanner sc = new Scanner(System.in);
	
	void takeInput() {
		System.out.print("Enter the radius of the circle : ");
		radius = sc.nextFloat();
	}
	
	void calArea() {
		area = 3.14f * radius * radius;
		System.out.println("Area of the circle : "+area);
	}
}

class Square extends Shape {
	
	private float side;
	
	Scanner sc = new Scanner(System.in);
	
	void takeInput() {
		System.out.print("Enter the side of the square : ");
		side = sc.nextFloat();
	}
	
	void calArea() {
		area = side * side;
		System.out.println("Area of the square : "+area);
	}
}

class Rectangle extends Shape {
	
	private float length;
	private float breadth;
	
	Scanner sc = new Scanner(System.in);
	
	void takeInput() {
		System.out.print("Enter the length and breadth of the rectangle : ");
		length = sc.nextFloat();
		breadth = sc.nextFloat();
	}
	
	void calArea() {
		area = length * breadth;
		System.out.println("Area of the rectangle : "+area);
	}
}

class Geometry {
	
	static void displayArea(Shape ref) {
		ref.takeInput();
		ref.calArea();
	}
}

public class FourOopPrinciple {

	public static void main(String[] args) {

		Circle2 circle = new Circle2();
		Square square = new Square();
		Rectangle rectangle = new Rectangle();
		
		Geometry.displayArea(circle);
		Geometry.displayArea(square);
		Geometry.displayArea(rectangle);
	}

}


