package BasicJavaProgram;

public class GrotechmindsProgram 

{
	GrotechmindsProgram (int a)
	{
		this(45, 9.8);
		System.out.println("1");
	}
	
	GrotechmindsProgram (int a, double b)
	{
		System.out.println("2");
	}
	
	GrotechmindsProgram ()
	{
		this(100);
		System.out.println("3");
	}

	public static void main(String[] args) 
	
	{
		new GrotechmindsProgram();
	}

}
