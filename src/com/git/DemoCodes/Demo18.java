package com.git.DemoCodes;


import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.io.IOException;
public class Demo18{
	public static void main(String[] args) throws IOException
	{
		// creating the files
	 File f = null;
	 f= new File ("E:\\java.txt");
	 f.createNewFile();
	 f= new File ("E:\\javaPhoneNumber.txt");
	 f.createNewFile(); 
	 //input from user and writing inot file
	 Scanner scan = new Scanner(System.in);
	 FileWriter fw1 = new FileWriter ("E:\\java.txt");
	 FileWriter fw2 = new FileWriter ("E:\\javaPhoneNUmber.txt");
	 System.out.println("Enter the name = phone number");
	 while (true) {
		 String data = scan.next();
		 if (data.equalsIgnoreCase("exit"))
		 		 break;
		 else {
			 String[] split = data.split("=");
			 fw1.write(split[0]+"\n");
			 fw2.write(split[1]+"\n");
		 }
	 }
	 fw1.close();
	 fw2.close();
	 fw1.flush();
	 fw2.flush();
	 scan.close();
	}

}

