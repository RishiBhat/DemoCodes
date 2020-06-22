package com.git.DemoCodes;
import java.io.File;
import java.io.IOException;

public class Demo7 {

	public static void main(String[] args) throws IOException {
		
		//create folder name java
		File f = new File ("c:\\java");
		System.out.println(f.mkdir());
		//create a ouput.txt
		f =new File ("c:\\java\\output.txt");
		System.out.println(f.createNewFile());

	}

}
