package Assignments_MKT;

import java.util.Arrays;
import java.util.Scanner;

public class Assignment75_SH 
{

	public static void main(String[] args) 
	{
		// WAP to pass anything at Runtime using args variable in the main method
		
		String [] n=new String[5];
		Scanner s1 = new Scanner(System.in);
		System.out.println("Please enter the size of an array(min size is 4): ");	
		String n1 [] = new String [s1.nextInt()];
		
		for (int i=0;i<4;i++)
		{
	System.out.println("Please enter the array at index position->" +i);
			n1[i] = s1.next();	

	}
		System.out.println(Arrays.toString(n1));
		s1.close();
	}

}
