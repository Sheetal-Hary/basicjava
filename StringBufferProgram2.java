package BasicJavaProgram;

public class StringBufferProgram2 

{

	public static void main(String[] args) 
	
	{
		// Capacity and length
		
		StringBuffer s1=new StringBuffer ("Sheetal Hary");
	//	int s2= s1.capacity();
	//	System.out.println(s2);
		
		s1.capacity();
		System.out.println(s1.capacity());
		
		int s3 = s1.length();
		System.out.println(s3);
	}

}
