package com.git.DemoCodes;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Demo9 {

	public static void main(String[] args)  throws IOException {
	FileReader fr = new FileReader ("c:\\java\\output.txt");
	BufferedReader br = new BufferedReader (fr);
	int count = 0;
	while(br.readLine()!=null) {
		count ++;
		
	}
        br.close();
        System.out.println("Number of Lines :" +count );
        
	}

}
