package BasicJavaProgram;

import java.util.Arrays;
import java.util.Scanner;

public class Array10 

{

	public static void main(String[] args) 
	
	{
		int rollno[]=new int[5];
		Scanner s1 =new Scanner(System.in);
		System.out.println("Please enter the size of an Array");
		int rollno1[]=new int[s1.nextInt()];
		for (int i=0;i<=4;i++)
			
		{
			System.out.println("Please enter the array at index position->" +i);
			rollno[i]= s1.nextInt();
			
			
		}
		System.out.println(Arrays.toString(rollno));
		s1.close();
	}

}
