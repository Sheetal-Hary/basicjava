package BasicJavaProgram;

class Super_3
{
	Super_3(String name, double b)
{
	System.out.println("3");
}
}

class Super_2 extends Super_3
{
	Super_2()
{
	super ("Sheetal", 9.87); //Super calling statement can be called from the constructor only.
	System.out.println("2");	
}
}

public class SuperCallingParameterized extends Super_2
{
	SuperCallingParameterized()
	{
		//super ();
		System.out.println("1"); //here super calling statement will be called implicitely
		
	}


	public static void main(String[] args) 
	
	{
		// Supercalling statement parameterized.
		new SuperCallingParameterized();
		

	}

}
