package Assignments_MKT;

interface one
{
	void method1(); //abstract method
	void method2(); //abstract method
}

public class Assignment52_SH implements one
{
	
	public void method1()
	{
		System.out.println("Method1");
	}
	
	public void method2()
	{
		System.out.println("Method2");
	}

	public static void main(String[] args) 	
	{
		// WAP on Interface with 2 Abstract methods
		one m1=new Assignment52_SH();
		m1.method1();
		m1.method2();

	}	
}
