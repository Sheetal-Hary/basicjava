package BasicJavaProgram;

import java.util.Arrays;
import java.util.Scanner;

public class array_4 

{

	public static void main(String[] args) 
	
	{
		// WAP to accept the values of array using scanner class and copy it into another array in reverse order.
		{
			
			Scanner s1=new Scanner(System.in);
			System.out.println("Please enter the size of your array: ");
			int [] input=new int[s1.nextInt()];
			
			//int input[]=new int[3];
			input[0]=74;
			input[1]=84;
			input[2]=94;
		
			
			
			int [] output=new int[input.length];
			
			for (int i=0, j=2;i<=input.length-1;i++,j--)
			{
				
				output[j]=input [i];
			}
			
			System.out.println("Input Array is : " +Arrays.toString(input));
			System.out.println("Output Array is : " +Arrays.toString(output));
			s1.close();
		}
	}

}
