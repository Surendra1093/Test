package com.java.basics;

import java.util.Scanner;

public class scannersample {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Hi What's your name ?");
		String name= scan.nextLine();
		System.out.printf("Hi %s what's your age: ",name);		
		int age=Integer.parseInt(scan.nextLine());
		System.out.println("How was the day ?" );
		String day=scan.nextLine();
		System.out.printf("Name: %s\nAge: %d\nDay: %s",name,age,day);
	}

}
