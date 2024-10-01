package com.java.basics;

public class Dog {
	String breed = "Lab";
	String colour = "Black";
	int weight = 20;
	
	public void barking()
	{
		System.out.println("barking");
		
	}
	
	public void jump()
	{
		System.out.println("jumping");
		
	}
	
	public static void main(String[] args) {
		
		Dog dog= new Dog();
		dog.barking();
		dog.jump();
		System.out.println("Breed = " + dog.breed);
		System.out.println("Colour = "+ dog.colour);
		System.out.println("Weight = "+ dog.weight);
		
		
		
}
	
}
