package com.java.basics;

public class EvenNumbers {

	private static void EveNumbers()
	{
		for(int i=200; i<=500; i++)
		{
			if (i%2==0)
			{
				System.out.println(i);

			}
		}
	}

	private static void divisible()
	{
		for(int i=150; i<=200; i++)
		{
			if (i%7==0)
			{
				System.out.println(i);

			}
		}

	}

	public static boolean isPrime(int num) {
		if (num <= 1) {
			return false;
		}
		for (int i = 2; i <= Math.sqrt(num); i++) {
			if (num % i == 0) {
				return false;
			}
		}
		return true;
	}


	private static void evenum()
	{
		int sum = 0;

		for (int i = 40; i <= 160; i++) {
			if (i % 2 == 0) {
				sum += i;
			}
		}
		System.out.println("The sum of even numbers between 40 and 160 is: " + sum);
	}

	public static void main(String[] args) {
		//EveNumbers();
		//divisible();
		/*for (int i = 50; i <= 150; i++) {
			if (isPrime(i)) {
				System.out.println(i);
			}
		}*/
		evenum();

	}

}
