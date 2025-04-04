package BasicJavaProgram;

class GoogleAuth
{
	GoogleAuth()
	{
		System.out.println("I am Constructor 2");
	}
}

public class Supercallingstatement extends GoogleAuth
{
	Supercallingstatement()
{
		super ();
		System.out.println("I am Constructor 1");
}

	public static void main(String[] args) 
	
	{
		// Super Calling Statement non para
		new Supercallingstatement();
	}

}
