package Assignments_MKT;

import java.util.Arrays;
import java.util.Scanner;

public class Assignment77_SH 
{

	public static void main(String[] args) 
	{
		// WAP to accept the values of your array at run time

		int [] n=new int[5];
		Scanner s1 = new Scanner(System.in);
		System.out.println("Please enter the size of an array(min size is 4): ");	
		int n1 [] = new int [s1.nextInt()];
		
		for (int i=0;i<4;i++)
		{
	System.out.println("Please enter the array at index position->" +i);
			n1[i] = s1.nextInt();	

	}
		System.out.println(Arrays.toString(n1));
		s1.close();
	}

}
