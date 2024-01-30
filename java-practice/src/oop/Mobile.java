package oop;

class OS {
	private String name;
	private int size;

	public OS(String name, int size) {
		super();
		this.name = name;
		this.size = size;
	}

	public String getName() {
		return name;
	}

	public int getSize() {
		return size;
	}
}

class Charger {
	private String brand;
	private int volt;

	public Charger(String brand, int volt) {
		super();
		this.brand = brand;
		this.volt = volt;
	}

	public String getBrand() {
		return brand;
	}

	public int getVolt() {
		return volt;
	}
}

public class Mobile {

	// OS is a composition which is a part of Mobile
	OS os = new OS("Android", 512);
	
	// Charger is an aggregation
	void hasACharger(Charger c) {
		System.out.println(c.getBrand());
		System.out.println(c.getVolt());
	}
	
	public static void main(String[] args) {
		Mobile m = new Mobile();
		Charger c = new Charger("iball", 15);
		
		System.out.println(m.os.getName());
		System.out.println(m.os.getSize());
		m.hasACharger(c);
		
		m = null;
//		System.out.println(os.getName());  // error
//		System.out.println(os.getSize());  // error
//		m.hasACharger(c);				   // error
		System.out.println(c.getBrand()); // without mobile, charger can be accessed
		System.out.println(c.getVolt());
	}
}
