package BasicJavaProgram;

public class Assignment3_SH {

	static void smethod()
	{
		
		System.out.println("I am static method1");
	}
	
	static void smethod2()
	{
		
		System.out.println("I am static method2");
	}

	
	public static void main(String[] args) 
	
	{
	
		smethod();
		smethod2();
		smethod3();
		
		System.out.println("I am main method");

	}

	
	static void smethod3()
	{
		
		System.out.println("I am static method3");
	}
}
