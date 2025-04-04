package BasicJavaProgram;

public class ParameterizedMethod
{
	static void add(int a,int b)
	//parametrized method
	
	{
		System.out.println(a+b);
	}
	
	static void mul(int a, int b)
	{
		System.out.println(a*b);
	}
	
	static void mul()
	//mul() - non parametrized method
	{
		int a= 10;
		int b=20;
		System.out.println(a*b);
	}
	
	void sub (int a, int b)
	{
		
		System.out.println(b-a);
	}
	
	public static void main(String[] args) 
	
	{
		mul();
		add(100,333);
		ParameterizedMethod p1=new ParameterizedMethod();
		p1.sub(10,30);
		mul(10,50);//This is how you call parameterized static method.

	}

}
 