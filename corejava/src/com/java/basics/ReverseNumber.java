package com.java.basics;

public class ReverseNumber {

	public static int reverse(int num) { 
		int a = num/10; 
		int b = num % 10;
		
		
		return b*10+ a; 
	}

	
	public static int reverse1(int i)
	{
		
		int c=((i%10)*10)+(i/10);		
		return(c);
				
	}
	
	public static int reverse2(int j)
	{
		int d=((j%10)*10)+(j/10);
		return(d);
	}
	
	public static void main(String[] args) { 
		int number = 24; 
		int reversedNumber= reverse(number); 
		System.out.println("Reversed number: " + reversedNumber);
		
		System.out.println("Reverse Number: "+ reverse1(129));
		System.out.println("Reverse Number: "+ reverse2(69));
		

	} 
	
}
