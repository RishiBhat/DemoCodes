package com.git.DemoCodes;
import java.util.Scanner;
public class Demo12 {

	public static void main(String[] args) {
	
          Scanner scan = new Scanner (System.in);
          System.out.println("enter the number of Classrooms");
          int c = scan.nextInt();
          System.out.println("enter the number of students");
          int s = scan.nextInt();
           int a [][]= new int  [c] [s];
           //inserting the new elements into array
           for (int i=0 ; i<a.length;i++) {
        	   System.out.println("enter the details of class " +(i+1));
        	   for ( int j=0 ;j <a[i].length; j++) {
        		   System.out.println("enter the marks of student" +(i+1));
        		   a[i][j]=scan.nextInt();
        		   
        		
        		  
        	   }
           }
          //retreival the data elements from array
           for ( int i=0;i<a.length; i++) {
        	   System.out.println("Printing the deatails of "+(i+1)+"classroom");
        	   for ( int j=0 ; j<a[i].length ; j++)
        	   {
        		   System.out.println("student "+(j+1)+"marks --------->" +a[i][j]);
        		   a[i][j]=scan.nextInt();
        		   
        	   }
           }System.out.println();
           
           
	}

}
