package oop;

class Example{
	
	private int salary;
	
	public void setSalary(int salary) {
		
		if(salary <= 0) {
			System.out.println("Invalid input");
			System.exit(0);
		}
		
		this.salary = salary;
	}
	
	public int getSalary() {
		return salary;
	}
}


class Example2 {
	
	private int[] scores;
	
	// Do not pass an object reference into a setter method. Instead, find some
	// ways to copy the values of the passed object into the internal object.
	public void setScores(int[] scores) {
		this.scores = scores;
	}
		
	// Do not return reference of the original object in getter method.
	// Instead, it should return a copy of the original object.
	public int[] getScores() {
		return scores;
	}

	public void displayScore() {
		System.out.print("Encapsulated Scores : ");
		for(int i = 0; i < scores.length; i++) {
			System.out.print(scores[i] + " ");
		}
		System.out.println();
	}
}

public class Encapsulation {
	
	public static void main(String[] args) {

		Example eg = new Example();
		eg.setSalary(1000);
		System.out.println("Salary = "+eg.getSalary());
//		eg.setSalary(-100);  // invalid input
		
		
		int[] myScore = {1,2,3,4,5};
		Example2 eg2 = new Example2();
		eg2.setScores(myScore);
		eg2.displayScore();
		myScore[0] = 6;
		eg2.displayScore();
		
		int[] copyScore = eg2.getScores();
		copyScore[0] = 7;
		eg2.displayScore();
		
	}
}
