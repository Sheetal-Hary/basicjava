package Assignments_MKT;

import java.util.Arrays;
import java.util.Scanner;

public class Assignment78_SH 
{

	public static void main(String[] args) 
	{
		// WAP to check if 2 arrays are equals to each other at run time
		
		Scanner s1= new Scanner (System.in);
		System.out.println("Enter the size of the array1: ");
		int[] a1= new int [s1.nextInt()];
		System.out.println("Enter the size of the array2: ");
		int[] a2= new int [s1.nextInt()];
		
		for (int i=0;i<=a1.length-1;i++)
		{
			System.out.println("Please enter the value at index position->" +i);
			a1 [i] =s1.nextInt();
			System.out.println("Please enter the value at index position->" +i);
			a2 [i] =s1.nextInt();
			
		}
		
		System.out.println("This is your first Array: " +Arrays.toString(a1));
		System.out.println("This is your second Array: " +Arrays.toString(a2));
		s1.close();
		
		boolean b1=Arrays.equals(a1, a2);
		if (b1==true)
			
		{
			
			System.out.println("They are EQUAL");
		}
		else 
		{
			
			System.out.println("They are NOT EQUAL");
		}
	}

		
	}

	
