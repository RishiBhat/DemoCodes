package com.git.DemoCodes;
import java.util.Scanner;
import java.util.Random;

public class Demo14 {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		System.out.println("enter your name");
		String name = scan.nextLine();
		System.out.println("enter the password");
		int p1 = scan.nextInt();
		System.out.println("enter confirm password");
		int c1 = scan.nextInt();
		if (c1==p1) {
			
			Random r = new Random();
			int n1 = r.nextInt(10000);
			System.out.println(n1);
			System.out.println("enter your OTP");
			int n2 = scan.nextInt();
			if (n1==n2)
			{
				System.out.println("Login Succesfully");
				
			}
			else 
			{
				System.out.println("mismatch in OTP");
				
			}
			
			
		}else
		{
			System.out.println("Entered Pssword and Confirm password are not matching");
			
		}

	}

}
