package BasicJavaProgram;

public class Thiscallingstatement
{
	Thiscallingstatement()
	{
		System.out.println("1");
	}
	
	Thiscallingstatement(int a)
	{
		this ();
		System.out.println("2");
	}
	
	Thiscallingstatement(int a, int b)
	{
		//this(100);
		System.out.println("3");
	}
	
	Thiscallingstatement(int a, double b)
	{
		//this (100,200);
		System.out.println("4");
	}
	
	Thiscallingstatement(double b, int a)//order of operation
	{
		this (500,3.14);
		System.out.println("5");
	}
	
	Thiscallingstatement(int a, double b, int c)
	{
		this (2.56, 400);
		System.out.println("6");
	}
	
	public static void main(String[] args) 
	
	{
		//Constructor Overloading.
		//This Calling statement classwork.	
		//In constructor overloading - within a single program you have so many constructors.
		//in order to call them we need to create objects.
		//in order to call 10 constructors we need to create 10 objects.

			
		//new Thiscallingstatement();
		//new Thiscallingstatement(100);
		//new Thiscallingstatement(100,200);
		//new Thiscallingstatement(500, 3.14);
		//new Thiscallingstatement(2.56, 400);
		new Thiscallingstatement(1,2.22, 3);
	}

}
		