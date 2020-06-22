package com.git.DemoCodes;
import java.util.Scanner;
public class Demo11 {

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter the number of Students");
		int n = scan.nextInt();
        int a[]= new int[n];
        //inserting the values into array
	
	  for  ( int i =0 ; i<n-1 ; i++) 
	  {
		  System.out.println("Enter the student" +(i+1)+ "marks");
		  a[i]= scan.nextInt();
		  
	  }
	//retreival the values from array 
	  
	  for (int i = 0 ; i<=n-1 ; i++)
	  {
		  System.out.println("Student "+(i+1)+"marks is---> " +a[i]);
		  
	  }
	
	
	}
	
	
	
	

}
