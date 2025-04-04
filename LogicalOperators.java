package BasicJavaProgram;

public class LogicalOperators {

	public static void main(String[] args) 
	
	
	{
		// TODO Auto-generated method stub
		
		
		int a=10;
		int b=20;
		if (a==b && (b>a && a==10))
		{
			System.out.println("Hello");
		}

		if (a!=b && b>a)
		{
			
			System.out.println("Bye");
		}
		
		if (!(a==b && b>a))
		{
			System.out.println("Hello NOT");
		}

		if (!(a!=b && b>a))
		{
			
			System.out.println("Bye NOT");
		}
		
		
	}

}
