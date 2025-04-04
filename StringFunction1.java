package BasicJavaProgram;

public class StringFunction1 
{

	public static void main(String[] args) 
	
	{
		// Class 19 - String Functions
		
		String input =  "  My name is Ram.  ";
		System.out.println("Input String: " + input);
		String output = input.trim();
		System.out.println("Output String: "+output);
		
		String name1="ram";
		String name2="Ram";
		boolean b1=name1.equals(name2);
		System.out.println(b1);
		
		String name3="Ashwini";
		String name4="ashwini";
		boolean b2=name3.equalsIgnoreCase(name4);
		System.out.println(b2);
		
		String name5="ram tiwari";
		boolean b3=name5.contains("manish");
		System.out.println(b3);

	}

}
