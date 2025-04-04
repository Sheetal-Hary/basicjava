package BasicJavaProgram;

class GoogleAuth123
{
	GoogleAuth123()
	{
		System.out.println("Constructor 2");
	}
}

public class TwoConstructors_super extends GoogleAuth123

{
	
	TwoConstructors_super()
	{
			super();
			System.out.println("Constructor 1");
	}

	public static void main(String[] args) 
	
	{
		// We cannot inherit constructors in java. TwoConstructors_super
		//super calling statement.
		new TwoConstructors_super();

	}

}
