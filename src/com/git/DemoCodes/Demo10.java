package com.git.DemoCodes;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Demo10 {

	public static void main(String[] args) throws IOException {
		Scanner scan = new Scanner(System.in);
		FileWriter fw = new FileWriter ("c:\\java\\output.txt");
		BufferedWriter bw = new BufferedWriter (fw);
		
		System.out.println("enter the numbers ");
		while (scan.hasNextInt()) {
			bw.write(scan.nextInt() + " ");
			
		}
		bw.flush();
		bw.close();
		scan.close();

	}

}
