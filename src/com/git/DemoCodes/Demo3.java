package com.git.DemoCodes;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;
import java.util.Scanner;

public class Demo3 {

	public static void main(String[] args) throws ArrayIndexOutOfBoundsException
	
	
	{
	
		HashMap <String,String> phonebook = new HashMap <String, String >();
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Enter the user and phone number when done enter exit");
		while(!scan.hasNext("exit")) {
			String data= scan.next();
			String [] split = data.split("_");
			phonebook.put(split[0],split [1]);
			
			
		}
                //fetch the keys (names) 
		
		Set < String> keys = phonebook.keySet();
		for (String tempKeys : keys) {
			System.out.println(tempKeys);
			
		}
		 //fetch the values (phone numbers ) 
		
		Collection <String> values = phonebook.values();
		for( String tempValue: values) {
			System.out.println(tempValue);
			
		//fetch the entries (name=phone number)
			Set<Entry <String, String >> entrySets = phonebook.entrySet();
			for(Entry <String , String> tempEntry : entrySets) {
				System.out.println(tempEntry);
				
			}
			
		}
	}

}
