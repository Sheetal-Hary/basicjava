package BasicJavaProgram;

public class ReversingString 

{

	public static void main(String[] args) 
	
	{
		// Reversing String and check if the string is a palindrome
		
		String input="random";
		String output="";
		for (int i=input.length()-1;i>=0;i--)
		{
			char a=input.charAt(i);
			output=output+a;
		}
		System.out.println("The output of the given input is:" + output);
		
		if(input.equals(output))
		{
			System.out.println("The input string is a palindrome");
		}
		else 
		{
			
			System.out.println("The input string is NOT a palindrome");
		}
	}

}
