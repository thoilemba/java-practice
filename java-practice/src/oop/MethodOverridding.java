package oop;

class Aeroplane {

	void fly() {
		System.out.println("Aeroplane is flying");
	}
}

class CargoPlane extends Aeroplane {

	void fly() {
		System.out.println("CargoPlane is flying at low altitude");
	}
}

class PassengerPlane extends Aeroplane {

	void fly() {
		System.out.println("PassengerPlane is flying at medium altitude");
	}
}

class FighterPlane extends Aeroplane {

	void fly() {
		System.out.println("FighterPlane is flying at high altitude");
	}
}

class Airport {

	void permit(Aeroplane ref) {
		ref.fly();
	}
}

public class MethodOverridding {

	public static void main(String[] args) {

		Aeroplane ap = new Aeroplane();
		CargoPlane cp = new CargoPlane();
		PassengerPlane pp = new PassengerPlane();
		FighterPlane fp = new FighterPlane();

		Airport airport = new Airport();
		airport.permit(ap);
		airport.permit(cp);
		airport.permit(pp);
		airport.permit(fp);
		

	}

}
