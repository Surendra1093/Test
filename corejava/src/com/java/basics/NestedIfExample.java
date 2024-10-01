package com.java.basics;

import java.util.Scanner;

public class NestedIfExample {

	private static Scanner scan;
	
	private static void validateWeight( int weight)
	{
		if(weight>50)
		{
			System.out.printf("Your eligible for the blood donation");
		}
		else
		{
			System.out.println("Your not eligible for the blood donation");
		}
	}
	
	private static void validateAge(int age)
	{
		if(age>18)
		{
			System.out.println("Enter the weight: ");
			validateWeight(scan.nextInt());
		}
		else
		{
			System.out.println("Age should be grater than 18");
		}
	}
	
	public static void main(String[] args) {
		 scan=new Scanner(System.in);
		System.out.println("Enter the Age:");
		validateAge(scan.nextInt());

	}

}
