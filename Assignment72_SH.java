package Assignments_MKT;

public class Assignment72_SH 
{

	public static void main(String[] args) 
	
	{
		// WAP to check if the given string is a Palindrome
		
		String input="Mom";
		String output="";
		
		for (int i=input.length()-1;i>=0;i--)
				
		{
				char a=input.charAt(i);
				output=output+a;
			//	System.out.println("The reversed string is: " + output);
		}
				System.out.println("The reversed string is: " + output);
				
				if (input.equals(output))
				{
					System.out.println("The given string is a Palindrome");
				}
				else
				{
					System.out.println("The given string is NOT a Palindrome");
				}
	}


	}
