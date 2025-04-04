package Assignments_MKT;

public class Assignment69_SH 
{

	public static void main(String[] args) 
	
	{
		// Wap on String Function using concat and contains concept
		
		//contains
		String input="I studied in Avila";
		System.out.println("Input String: " +input);
		boolean output= input.contains("learnt");
		System.out.println(output);
		
		//concat
		String input1="Avila Convent Matriculation Higher Secondary School ";
		System.out.println("Original String: " +input1);
		String output1=input1.concat(input1);
		System.out.println("String to be appended: " +output1);


	}

}
