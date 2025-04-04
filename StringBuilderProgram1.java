package BasicJavaProgram;

public class StringBuilderProgram1 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		StringBuilder s1=new StringBuilder ("manish");
		s1.append("tiwari");
		System.out.println(s1);
		s1.replace(7, 13, "rai");
		System.out.println(s1);

	}

}
