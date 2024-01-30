package oop;

class Example3 {
	
	private int[] scores;
	
	// Do not pass an object reference into a setter method. Instead, find some
	// ways to copy the values of the passed object into the internal object.
	public void setScores(int[] scores) {
		this.scores = new int[scores.length];
		System.arraycopy(scores, 0, this.scores, 0, scores.length);
	}
		
	// Do not return reference of the original object in getter method.
	// Instead, it should return a copy of the original object.
	public int[] getScores() {
		int[] copy = new int[scores.length];
		System.arraycopy(scores, 0, this.scores, 0, scores.length);
		return copy;
	}

	public void displayScore() {
		System.out.print("Encapsulated Scores : ");
		for(int i = 0; i < scores.length; i++) {
			System.out.print(scores[i] + " ");
		}
		System.out.println();
	}
}

public class Encapsulation2 {
	
	public static void main(String[] args) {
		
		int[] myScore = {1,2,3,4,5};
		Example3 eg3 = new Example3();
		eg3.setScores(myScore);
		eg3.displayScore();
		myScore[0] = 6;
		eg3.displayScore();
		
		int[] copyScore = eg3.getScores();
		copyScore[0] = 7;
		eg3.displayScore();
		
	}
}
