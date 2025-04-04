package Assignments_MKT;

import java.util.Arrays;
import java.util.Scanner;

public class Assignment79_SH 
{

	public static void main(String[] args) 
	{
		// WAP to copy one array into another array
		
		Scanner s1= new Scanner(System.in);
		//System.out.println("Enter the size of an array: ");
		
		String input[] = new String[3];
		input[0]="Manish";
		input[1]="Swetha";
		input[2]="Swati";
		String [] output=new String[input.length];
		for(int i=input.length-1,j=0;i>=0;i--,j++)
		{
			output[j]=input[i];
		}

		System.out.println("Input Array is: " +Arrays.toString(input));
		System.out.println("Output Array is: " +Arrays.toString(output));
		s1.close();

	}

}
