package com.git.DemoCodes;
import java. io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;




public class Demo2 {

	public static void main(String[] args) throws NumberFormatException  {
		HashSet hs = new HashSet();
		int count = 0;
		Scanner sc = new Scanner(System.in);
		int numCases= Integer.parseInt (sc.nextLine());
		for(int i =0 ;i<numCases ; i++) {
			if (hs.add(sc.nextLine())) {
				count ++;
				
			}
			System.out.println(count);
			
		}

	}

}
