package BasicJavaProgram;

class PreCondition
{
	void login()
{
		System.out.println("Login using email id");
}
}

public class MethodOverride extends PreCondition

{
	void login()
{
		super.login(); //super keyword can be used anywhere not just on the first line.
		System.out.println("Login using mobile no");
}
	public static void main(String[] args) 
	
	{
		// method override
		
	MethodOverride m1=new MethodOverride();
	m1.login();

	}

}
