package BasicJavaProgram;

public class Amazon 

{
	Amazon (String UserName, String PWD)
	{
		System.out.println("Constructor 1");
	}
    
	Amazon (int age, char gender)
    {
	System.out.println("Constructor 2");
	}
    
	public static void main(String[] args)
	
	
	{
		new Amazon("mkt123@gmail.com", "manish123");
		new Amazon(23,'F');
		

	}

}
