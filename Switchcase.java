package BasicJavaProgram;

import java.util.Scanner;

public class Switchcase 

{

	public static void main(String[] args) 
	
	{
		
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter which case you want to execute:");
		int input=s1.nextInt();
		s1.close();
	
		
		switch (3)
		//switch(101)
		{
		
		case 1: System.out.println("Chrome browser automation");
		break;
		
		case 2: System.out.println("Mozilla browser automation");
		break;
		
		case 3: System.out.println("Edge browser automation");
		break;
		
		case 4: System.out.println("Safari browser automation");
		break;
		
		default:
			System.out.println("Wrong Selection please select 1, 2, 3 or 4 only");
		}

	}

}
