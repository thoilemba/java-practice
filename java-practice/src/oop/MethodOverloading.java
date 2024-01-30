package oop;

/*
Method overloading is the process that methods having same name but different
parameters - type, number and order of parameters.
*/

public class MethodOverloading {

	public static int add(int i, int j) {
		return i + j;
	}

	// difference in number of parameter
	public static int add(int i, int j, int k) {
		return i + j + k;
	}

	// difference in data type
	public static double add(double i, int j) {
		return i + j;
	}

	// difference in number of parameter
	public static double add(int i, double j) {
		return i + j;
	}
	
	/*
	 If more than one member method is both accessible and applicable
	 to a method invocation, Java uses the rule that the most specific
	 (closest) method is chosen.
	 Only promotion can be done (bigger data type cannot be demoted
	 to smaller data type.
	*/

	public static void myMethod(Object obj) {
		System.out.println("Object");
	}

	public static void myMethod(String s) {
		System.out.println("String");
	}

	public static void fun(float a, float b) {
		System.out.println("This method accepts two float arguments");
		System.out.println("a = " + a + ", b = " + b);
	}

	public static void fun(double a, double b) {
		System.out.println("This method accepts two double arguments");
		System.out.println("a = " + a + ", b = " + b);
	}
	
	/*
	  Method Ambiguity : Ambiguity error occurs when java compiler fails
	  to find out which of the overloaded methods should be used.
	 */
	
	static void foo(int i, long l) {
		System.out.println("int and long");
	}
	
	static void foo(long l, int i) {
		System.out.println("long and int");
	}

	
	public static void main(String[] args) {

		System.out.println(add(5, 10));
		System.out.println(add(5, 10, 20));
		System.out.println(add(5.5, 10));
		System.out.println(add(5, 20.5));

		myMethod('a');
		myMethod(100);
		myMethod(null);
		
		fun(10, 20); // promoted to float
		fun(10.5, 20); // promoted to double

//		foo(10, 20); ambiguity error
	}

}
