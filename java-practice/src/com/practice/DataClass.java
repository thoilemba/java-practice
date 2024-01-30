package com.practice;

import java.util.Objects;

class Person {
	
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getters
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    // Equals method
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age && name.equals(person.name);
    }

    // HashCode method
    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    // ToString method
    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}


public class DataClass {
	
	public static void main(String[] args) {
		
		Person person1 = new Person("John", 30);
		Person person2 = new Person("Mike", 25);
		Person person3 = new Person("John", 30);
		
		System.out.println("toString :");
		System.out.println(person1);
		System.out.println(person2);
		
		System.out.println("hashCode :");
		System.out.println(person1.hashCode());
		System.out.println(person2.hashCode());
		System.out.println(person3.hashCode());
		
		System.out.println("equals :");
		System.out.println(person1.equals(person2));
		System.out.println(person1.equals(person3));
	}
}













