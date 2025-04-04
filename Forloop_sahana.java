package BasicJavaProgram;

import java.util.Arrays;
import java.util.Scanner;

public class Forloop_sahana 

{
	public static void main(String[] args) 
	
	{
		// using Sahana's script to run the for loop.
		
		String [] name=new String[5];
		Scanner s1 = new Scanner(System.in);
		System.out.println("Please enter the size of an array: ");	
		String name1 [] = new String [s1.nextInt()];
		
		/*
		name[0]="Apple";
		name[1]="Pear";
		name[2]="Orange";
		name[3]="Blueberry";
		name[4]="Cherry";
		 */
		
		for (int i=0;i<4;i++)
		{
	System.out.println("Please enter the array at index position->" +i);
			name1[i] = s1.next();	

	}
		System.out.println(Arrays.toString(name1));
		s1.close();
	}
}