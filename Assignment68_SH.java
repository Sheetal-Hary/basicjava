package Assignments_MKT;
public class Assignment68_SH 
{
	public static void main(String[] args) 
	{
		// Wap on String Function using toupperCase,toLowerCase,length,charAt,trim concepts
		
		//toupperCase
		String input="Manish";
		System.out.println("Input String: "+ input);
		String output=input.toUpperCase();
		System.out.println("Output String: " +output);
		
		//toLowerCase
		String input1="SHEETAL";
		System.out.println("Input String: "+ input1);
		String output1=input1.toLowerCase();
		System.out.println("Output String: "+ output1);
		
		//length
		String input2="school";
		System.out.println("Input String: "+ input2);
		int output2=input2.length();
		System.out.println("Index Value is: " +output2);
		
		//charAT
		String input3="Umbrella";
		System.out.println("Input String: "+ input3);
		char output3=input3.charAt(5);
		System.out.println("Letter at the 5th index is: "+output3);
		
		//trim
		String input4 =  "  I love the moon.  ";
		System.out.println("Input String: " + input4);
		String output4 = input4.trim();
		System.out.println("Output String: "+output4);


	}

}
