package com.git.DemoCodes;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class Demo4 {

	public static void main(String[] args)
	{
		HashMap <Character, Integer> table = new HashMap<Character, Integer>();
		Scanner scan =  new Scanner (System.in);
		 
		String data = scan.next();
		for(int i= 0 ; i<data.length();i++) {
			char c = data.charAt(i);
			if( table.containsKey(c))
			{
				Integer count = table.get(c);
				table.put(c, ++count);
				
				
			}
	         	
			else 
			{
				table.put(c, 1);
			}
		
		}
		
		Set <Character> keys = table.keySet();
		for (Character tempKey : keys) {
		       System.out.println(tempKey+ ": "+table.get(tempKey));	
		}
		
		

	}

}
