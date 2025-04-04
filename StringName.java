package BasicJavaProgram;

public class StringName 

{

	public static void main(String[] args) 
	
	{
		// Reverse a name
		
		String input ="sahana";
		String output="";
		for (int i=input.length()-1;i>=0;i--)
		{
			char a=input.charAt(i);
			output=output+a;
			
		}
System.out.println("The output of the given input is:> "+output);
	}

}
