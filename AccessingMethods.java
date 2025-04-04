package BasicJavaProgram;

public class AccessingMethods {

	static void mul()
	{
		System.out.println("Multiplication");
	}
	
	public static void main(String[] args) 
	
	{
		add();
		System.out.println("I am main method");
		sub();

	}
	
		
	
	static void add ()
	{
		System.out.println("Adding");
		
	}
	
	static void sub ()
	{
		mul();
		System.out.println("Subtraction");
	}
	
	
	
	
	
	
	
}
