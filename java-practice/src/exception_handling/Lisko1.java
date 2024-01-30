package exception_handling;

import java.util.InputMismatchException;

class Super {
	void show() throws ArithmeticException{
		System.out.println("Parent method");
	}
}

class Sub extends Super {
	@Override
	void show() throws InputMismatchException {
		System.out.println("Child method");
	}
}

public class Lisko1 {
	public static void main(String[] args) {
		Sub s = new Sub();
		s.show();
		
	}
}