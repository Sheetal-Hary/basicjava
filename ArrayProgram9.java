package BasicJavaProgram;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayProgram9 

{

	public static void main(String[] args) 
	
	{
		// Screenshot 237 from classwork screenshots
		
		Scanner s1= new Scanner(System.in);
		System.out.println("Enter the size of the array: ");
		boolean [] answer=new boolean[s1.nextInt()];
		
		for (int i=0;i<=answer.length-1;i++)
		{
			System.out.println("Please enter the boolean value at index position->" +i);
			answer [i] =s1.nextBoolean();
			
		}
		
		System.out.println("This is your input Array: " +Arrays.toString(answer));
		s1.close();
		boolean [] answer1=new boolean [answer.length];
	/*	
		answer1[0]=answer[0];
		answer1[1]=answer[1];
		answer1[2]=answer[2];
		answer1[3]=answer[3];
	*/	
		
		for (int j=0;j<=answer.length-1;j++)
		{
			
			answer1[j]=answer[j];
		}
		
		System.out.println("This is your output Array: " +Arrays.toString(answer1));
	}

}
