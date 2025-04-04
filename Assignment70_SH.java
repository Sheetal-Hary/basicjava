package Assignments_MKT;

public class Assignment70_SH 

{

	public static void main(String[] args) {
		
		
		// WAP on String Function using equals and equalsIgnoreCase concept
		
		//equals
		String input="I love the moon";
		boolean output=input.equals("moon"); //the input and the output are not equal so the output is returning false
		System.out.println(output);
		
		
		//equalsIgnoreCase
		String input1="VIKRAM";
		String input2="vikram";
		boolean output1=input1.equalsIgnoreCase(input2);
		System.out.println(output1);
		

	}

}
