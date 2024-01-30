package exception_handling;

import java.util.Scanner;

class UnderAgeException extends Exception {

	private static final long serialVersionUID = 6562730616367060076L;

	@Override
	public String getMessage() {
		return "You are too young to apply.";
	}
}

class OverAgeException extends Exception {

	private static final long serialVersionUID = 8829860961420257716L;

	@Override
	public String getMessage() {
		return "You are too old to apply";
	}
}

class Applicant {

	Scanner sc = new Scanner(System.in);
	int age;

	void inputAge() {
		System.out.print("Enter your age : ");
		age = sc.nextInt();
	}

	void validateAge() throws UnderAgeException, OverAgeException {
		if (age < 18) {
			UnderAgeException ue = new UnderAgeException();
			throw (ue);
		} else if (age > 59) {
			OverAgeException oe = new OverAgeException();
			throw (oe);
		} else {
			System.out.println("Come to RTO to get your license.");
		}
	}
}

class RTO {

	Scanner sc = new Scanner(System.in);

	void initiate() {
		
		Applicant a = new Applicant();
		
		String answer = "yes";

		while (true) {
			System.out.println("Do you want to apply :");
			answer = sc.next();

			if (answer.equalsIgnoreCase("yes")) {
				a.inputAge();
				try {
					a.validateAge();
				} catch (UnderAgeException | OverAgeException e) {
					System.out.println(e.getMessage());
				}
			} else {
				System.out.println("Thank you.");
				return;
			}
		}
	}
}

public class CustomException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RTO rto = new RTO();
		rto.initiate();
	}
}
