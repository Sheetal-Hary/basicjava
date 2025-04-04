package BasicJavaProgram;

class ParentClass100
{
	static void add()
	{
		int a=10;
		int b=20;
	System.out.println("The sum is");
	System.out.println(a+b);
	}
}

public class ChildClass100 extends ParentClass100
{
	static void sub()
	{
	int b=20;
	int c=10;
	System.out.println("The difference is");
	System.out.println(b-c);
	}

	public static void main(String[] args) 
	
	{
		// Since this is present under the Package explorer (on the left side under BasicJavaProgram) this will be the main method. 	
		sub();
		add();
	}

}
