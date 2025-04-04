package BasicJavaProgram;

public class StringFunction4
{

	public static void main(String[] args) 
	
	{
		// String Functions
		
		String input ="k v no 2";
		//lets remove all numeric letters with nothing.
		String output= input.replaceAll("[0-9]", "Manish");
		System.out.println(output);
		
		//lets remove all smaller/lower letters
		String input1="Manish Kumar Tiwari";
		String output1 =input1.replaceAll("[a-z]", "");
		System.out.println(output1);
		
		//lets remove all capital letters
		String output2=input1.replaceAll("[A-Z]", "");
		System.out.println(output2);

	}

}
