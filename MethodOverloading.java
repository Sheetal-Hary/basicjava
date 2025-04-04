package BasicJavaProgram;

public class MethodOverloading 

{
	static void add()
	{
		System.out.println("1");
	}
	
	static void add(int a)
	{
		System.out.println(a+6);
	}

	
	static void add(int a, int b)
	{
		System.out.println(a+b+6);
	}
	
	static void add(int a, double b)
	{
		System.out.println(a+b+6);
	}
	
	void add(double d, int c)
	{
		System.out.println(d+6+c);
	}
	
    void add(double a, int b, int c)
	{
		System.out.println(a+b+c+6);
	}
	

	public static void main(String[] args) 
	
	{
		// Method Overloading concept in class.
	
		add();
		add(6);
		add(5,5);
		add(100,200.5);
		MethodOverloading m1=new MethodOverloading();
		m1.add(2.22, 4);
		m1.add(0.6, 6, 10);

	}

}
