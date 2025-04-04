package Assignments_MKT;

public class Assignment71_SH 
{

	public static void main(String[] args) 
	{
		// WAP to reverse a string
		
		String input="minute";
		String output="";
		
		for (int i=input.length()-1;i>=0;i--)
				
		{
				char a=input.charAt(i);
				output=output+a;
			//	System.out.println("The reversed string is: " + output);
		}
				System.out.println("The reversed string is: " + output);
	}

}
