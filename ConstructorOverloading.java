package BasicJavaProgram;

public class ConstructorOverloading 

{
	ConstructorOverloading()
	{
		System.out.println("1");
	}
	
	ConstructorOverloading(int a)
	{
		System.out.println("2");
	}
	
	ConstructorOverloading(int a, int b)
	{
		System.out.println("3");
	}
	
	ConstructorOverloading(int a, double b)
	{
		System.out.println("4");
	}
	
	
	ConstructorOverloading(double b, int a)//order of operation
	{
		System.out.println("5");
	}
	
	ConstructorOverloading(int a, double b, int c)
	{
		System.out.println("6");
	}
	
	public static void main(String[] args) 
	
	{
		// Chapter on Constructor Overloading.
		new ConstructorOverloading();
		new ConstructorOverloading(100);
		//new ConstructorOverloading(100,200);
		new ConstructorOverloading(500, 3.14);
		new ConstructorOverloading(2.56, 400);
		new ConstructorOverloading(1,2.22, 3);
	}

}
