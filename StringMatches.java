package BasicJavaProgram;

public class StringMatches 
{

	public static void main(String[] args)  
	
	{
		String input ="manish";
		// check if the given String consist of exact 4 characters

		//boolean b1= input.matches("....");
		//System.out.println(b1);
		
		//Lets check if the string ends with t	
		
		boolean b2= input.matches("(.*)t");
		System.out.println(b2);
		
		//lets check if the string starts with p
		boolean b3= input.matches("p().*");
		System.out.println(b3);
		
		//check if the given input has man in it.
		
		String input1="spiderman";
		//manager
		//Heman
		//batman
		//ironman
		//humanity
		//man
		
	boolean b4=	input1.matches("(.*)man().*");
		
		//case 1: multi char +man
		//case2 : multi char +man +multi char
		//case3: man+multi char
	System.out.println(b4);
		
	}

}
;