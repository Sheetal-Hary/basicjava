package BasicJavaProgram;

public class StringPalindrome 

{

	public static void main(String[] args) 
	
	{
		// Palindrome
		
			
			String input ="mom";
			String output="";
			for (int i=input.length()-1;i>=0;i--)
			{
				char a=input.charAt(i);
				output=output+a;
				
			}
	System.out.println("The output of the given input is:> "+output);
	
	if (input.equals(output))
	{
		System.out.println("The input string is a Palindrome");
	}
	
	else 
	{
		System.out.println("The input string is Not a Palindrome");
		
	}
	}

	}


