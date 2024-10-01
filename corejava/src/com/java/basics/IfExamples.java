package com.java.basics;

import java.util.Scanner;

public class IfExamples {
	
	public static void validate(int num) {
		if (num>0) {
			System.out.println("Entered Number Is Positive");
			
		}
		else {
			System.out.println("Enterd number is Negative");
			
		}
		System.out.println("Execution Completed");
		
	}
	private static void validateEvenOdd(int n)
	{
		if(n%2==0)
			System.out.println("Entered Number is Even number: "+n);
		else
			System.out.println("Entered Number is Odd: "+n);
	}
	private static void validateGrade(int num)
	{
		if(num<35 && num>=0)
			System.out.println("Grade : Fail= "+num);
		else if(num>=35 && num<45)
			System.out.println("Grade : Third class= "+num);
		else if(num>=45 && num<60)
			System.out.println("Grade : Second class= "+num);
		else if(num>=60 && num<75)
			System.out.println("Grade : First Class= "+num);
		else if(num>=75 && num<100)
			System.out.println("Grade : Distinction= "+num);
		else 
			System.out.println("Invalid input");
	}
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter the number: ");
		//validate(scan.nextInt());
		//validateEvenOdd(scan.nextInt());
		validateGrade(scan.nextInt());
		

	}

}
