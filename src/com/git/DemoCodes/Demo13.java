package com.git.DemoCodes;
import java.util.Scanner;

public class Demo13 {

	public static void main(String[] args)    {
		Scanner scan =new Scanner(System.in);
		System.out.println("Enter the expression");
		int expr = scan.nextInt();
		switch(expr)
		{
		case 1 :
		{
			System.out.println("hi");
			break;
			
		}
		case 2 :
		{
			System.out.println("how are you");
			break;
		}
           default : 
           {
        	   System.out.println("option not exits");
        	   
           }
	}

}
}