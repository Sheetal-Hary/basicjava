package BasicJavaProgram;

public class StringFunction7 

{
	public static void main(String[] args) 
	
	{
	
		String input ="mouse";
		
		String output="";
		
		for(int j=4;j>=0;j--)
		{
			char a=input.charAt(j);
			output=output+a;
			System.out.println(output); //if the output should not be repeated write the sysout after the for loop
		}
		System.out.println("The output of the given input is: " + output);
	}

}
