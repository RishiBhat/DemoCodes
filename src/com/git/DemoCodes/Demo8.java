package com.git.DemoCodes;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Demo8 {

	public static void main(String[] args) throws IOException {
	FileWriter fw = new FileWriter ("c:\\java\\output.txt");
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter the string");
	String data = scan.next();
	for ( int i = 0; i<data.length();i++)
	{
		fw.write(data.charAt(i)+"\n");
	}
fw.flush();
fw.close();

	}

}
