package exception_handling;

public class Exercise {

	int count = 0;

	void A() throws Exception {
		try {
			System.out.println("A");
			count++;
			try {
				System.out.println("B");
				count++;
				try {
					System.out.println("C");
					count++;
					throw new Exception();
				} catch (Exception e) {
					System.out.println("D");
					count++;
					throw new Exception();
				}
			} catch (Exception e) {
				System.out.println("E");
				count++;
			}
		} catch (Exception e) { // this block does not executed
			System.out.println("F");
			count++;
		}
	}

	public static void main(String[] args) throws Exception {

		Exercise obj = new Exercise();
		obj.A();
		System.out.println(obj.count);
	}
}
