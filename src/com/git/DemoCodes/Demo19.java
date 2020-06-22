package com.git.DemoCodes;
import java.util.Scanner;

public class Demo19 
                {

	@SuppressWarnings("resource")
	public static void main(String[] args)
	{
		Scanner scan=new Scanner (System.in);
        System.out.println("Enter the Number of schools");
        int sh=scan.nextInt();
        System.out.println("Enter the Number of Classrooms");
        int cr=scan.nextInt();
        System.out.println("Enter the number of students");
        int st=scan.nextInt();
        int a[][][]=new int[sh][cr][st];
        
        //insertion 
        
        for (int i=0;i<a.length;i++)
        {
        	System.out.println("School"+(i+1)+"details");
        	for(int j=0;j<=a[i].length;j++)
        	{
                         
                  System.out.println("classroom"+(j+1)+"details");
                  for (int k=0;k < a[i][j].length;k++)
                  {
                      
                    System.out.println("Enter the marks of student"+(k+1)+":");
                    a[i][j][k]=scan.nextInt();
                      
                  }
        	}     

        }	
        
        //retreiving the data
        
        for (int i=0;i<a.length;i++)
        {
        	System.out.println("School"+(i+1)+"Details");
        	{
        		for(int j = 0;j<a[i].length;j++)
        	 		
        		{
        			System.out.println("classroom"+(j+1)+"Details");
        			for(int k=0;k< a[i][j].length ;k++)
        			{
        				System.out.println("the marks of the student"+(k+1)+"is------>"+a[i][j][k]);
        				
        				
        			}
        		System.out.println();
        }
 
        	System.out.println();
        	}
        	
        }
        
	}
                }



        