package BasicJavaProgram;

import java.util.Scanner;

public class ScannerClass 

{

	public static void main(String[] args) 
	
	{
		// Scanner Class
		
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter the value of a");
		int a= s1.nextInt();
		System.out.println("Enter the value of b");
		int b= s1.nextInt();
		System.out.println("The sum is:");
		int sum=a+b;
		System.out.println(sum);
		s1.close();
		

	}

}
