package BasicJavaProgram;

import java.util.Arrays;
import java.util.Scanner;

public class array_1 

{

	public static void main(String[] args) 
	
	{
		// Write a program to accept the values of array using scanner class
		
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter the value of the array: ");
		int rollno[] =new int[s1.nextInt()];
		
		for (int i=0;i<=rollno.length-1;i++)
			
		{
			System.out.println("Enter the roll number: ");
			rollno[i] = s1.nextInt();
			
		}
		
	
		System.out.println(Arrays.toString(rollno));
		
		
/*
		
		rollno[0] =s1.nextInt();
		rollno[1] =s1.nextInt();
		rollno[2] =s1.nextInt();
		rollno[3] =s1.nextInt();
		rollno[4] =s1.nextInt();
		*/
		
	}

	
}

