package com.git.DemoCodes;
import java.util.HashMap;

public class Demo6 {

	public static void main(String[] args) {
		String s1 = new String ("rama");
		String s2 = new String ("Rama");
		
		HashMap <String ,Integer> map = new HashMap <String, Integer>();
		 map.put(s1, 10);
		 map.put(s2, 20);
		 
		 System.out.println(map);
 
	}

}
