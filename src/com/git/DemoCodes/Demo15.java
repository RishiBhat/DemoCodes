package com.git.DemoCodes;
import java.util.Scanner;

public class Demo15 {

	public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("kindly enter the limit");
        int count = scan.nextInt();
        int n1 = 0;
        int n2 = 1 ;
        int i= 1 ;
        while(i<count) {
        	System.out.println(n1+" ");
        	int sum = n1+n2;
        	n1=n2;
        	n2=sum;
        	i++;
        }

	}

}
