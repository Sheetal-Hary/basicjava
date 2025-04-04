package BasicJavaProgram;

public class Globalvariable1 

{
static int a=10;
static int b=20;
	static void add()
{
		int sum=a+b;
		System.out.println(sum);

}
	static void sub()
{
		System.out.println(a-b);

}
	static void mul()
{
		System.out.println(a*b);

}
	public static void main(String[] args) 
	
	{
		add();
		sub();
		mul();

	}

}
