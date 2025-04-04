package BasicJavaProgram;

import java.util.Arrays;

public class ArrayAnagramProblem 

{

	public static void main(String[] args) 
	
	{
		// array anagram problem
		
		//Scanner s1=new Scanner (System.in);
		//System.out.println("Enter first string: ");
		
		String a="manish";//[a,e,r]
		String b="sunita";//[a,e,r]
		
		if (a.length()!=b.length())
		{
			
			System.out.println("They are NOT ANAGRAM");
		}
		else 
		{
			
			System.out.println("OK, the length of the 2 Strings are same: ");
			char c1[]=a.toCharArray();
			char c2[]=b.toCharArray();
			System.out.println("Before Sorting c1=> " +Arrays.toString(c1));
			System.out.println("Before Sorting c2=> " +Arrays.toString(c2));
			Arrays.sort(c1);
			Arrays.sort(c2);
			
			System.out.println("After Sorting c1=> " +Arrays.toString(c1));
			System.out.println("After Sorting c2=> " +Arrays.toString(c2));
			
			boolean b1=Arrays.equals(c1, c2);
			if (b1==true)
				
			{
				
				System.out.println("They are ANAGRAM");
			}
			else 
			{
				
				System.out.println("They are NOT ANAGRAM");
			}
		}

	}

}
