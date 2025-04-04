package BasicJavaProgram;

public class Case1ofAccessSpecifier 
{
	public static void add()
	{
		System.out.println("add");
	}
	private static void sub()
	{
		System.out.println("sub");
	}
	protected static void mul()
	{
		System.out.println("mul");
	}
	static void div()
	{
		System.out.println("div");
	}
	
	public static void main(String[] args) 
	
	{
		// TODO Auto-generated method stub
		add();
		sub();
		mul();
		div();

	}

}
