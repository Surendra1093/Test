package com.java.basics;

import java.util.Random;
import java.util.Scanner;

public class ATMApplication {


	public static void main(String[] args) {
		int lang;
		int withoption;
		int opt;
		int currentBal;
		int bal = 20000;
	
		Random rand=new Random();
		currentBal=rand.nextInt(10000,20000);
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Welcome to the HDFC Bank ATM");
		try {
			do {
				System.out.printf("Please choose the below option for the language\n1.English\n2.Hindi\n3.Telugu");
				lang= Integer.parseInt(scan.nextLine());
				if (lang>=4 || lang<=0)
					System.err.println("invalid option");
			}while(lang>=4 || lang<=0);
				
		}catch(Exception e)
		{
			System.err.println("Please choose on the numbers");
			
		}
		System.out.printf("Please choose the below options\n1.Banking\n2.SetPIN");
		opt=Integer.parseInt(scan.nextLine());
		System.out.println("Your available bal: "+bal);
		if(opt==1)
		{
			System.out.printf("Please choose the below options\n1.Withdraw\n2.Balance\n3.Print Statement");
			withoption =Integer.parseInt(scan.nextLine());
			
			System.out.printf("Please Enter the Amount: ");
			bal=Integer.parseInt(scan.nextLine());
			if(currentBal>=bal)
			System.out.println("Please collect your Cash ");
			else
				System.out.println("Insufficient Funds");
			
		}
			
			System.out.println("Current bal: "+currentBal);
			
		


	}

}
