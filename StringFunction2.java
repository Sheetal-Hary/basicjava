package BasicJavaProgram;

public class StringFunction2 

{

	public static void main(String[] args) 
	
	{
		// Class 19 - String Functions
		//indexing always starts with 0,1,2.....
		
		String input="manish tiwari";
		String output= input.substring(7);
		System.out.println(output);
		String output1= input.substring(3);
		System.out.println(output1);
		String output3= input.substring(6, 9);
		System.out.println(output3);

	}

}
