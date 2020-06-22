package com.git.DemoCodes;

import java.io.*;
import java.util.*;



public class Demo1 {

	public static void printCombination (ArrayList listArray, int money ) 
	{
		int startPos = 0;
		while ( startPos <listArray.size ()-1) {
			for (int i = startPos+1 ; i<listArray.size(); i++) {
				int sum = (int )listArray.get(startPos)+(int)listArray.get(i);
				if (sum==money) {
					System.out.println((startPos+1)+ " " +(i+1));
					return ;
				}
			}
		  
	      startPos++;        	
		}
		

	}
               public static void main (String[] args) {
                     Scanner sc = new Scanner (System.in) ;
                     int numTestCases = sc.nextInt();
                      for (int i =0; i<numTestCases; i++) {
                    	  int money = sc.nextInt();
                    	  ArrayList<Integer > costArrayList =  new ArrayList  ();
                    	  int numFlavors = 0;
						for ( int j= 0 ; j< numFlavors ; j++) {
                    		  costArrayList.add(sc.nextInt());
                    	  }
                    	  printCombination (costArrayList,money);
                    	  
                    	  
                      }
            	   
               }
	
	
	
	
	
	
}
