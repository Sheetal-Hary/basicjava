package BasicJavaProgram;
import java.util.Arrays;
import java.util.Scanner;

public class array_2 
{

	public static void main(String[] args) 
	
	{
		// write a program to create an array of size 4 using scanner class.
		
		Scanner s1=new Scanner(System.in);
		System.out.println("Please enter the size of your array: ");
		boolean [] answer=new boolean[s1.nextInt()];
		for (int i=0; i<=answer.length-1;i++)
		{
			System.out.println("This is your Input Array: "+i);
			answer[i]=s1.nextBoolean();
		}
		
		System.out.println("This is your input array: " +Arrays.toString(answer));
		s1.close();
		boolean [] answer1=new boolean [answer.length];
		for (int j=0;j<=answer1.length-1;j++)
		{
			answer1[j]=answer[j];
		}
		System.out.println("This is your output/copied Array: "+ Arrays.toString(answer1));
	}

}
