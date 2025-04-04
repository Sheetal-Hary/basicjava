package BasicJavaProgram;

abstract class Authentication //abstract class
{
	abstract void login();	//abstract method
}

public class Google_Auth extends Authentication //relationship
{

	public static void main(String[] args) 
	
	{
		

	}

	void login()
	{
		System.out.println("Login with OTP");
		
	}
}
