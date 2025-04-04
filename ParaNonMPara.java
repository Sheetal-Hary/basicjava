package BasicJavaProgram;


public class ParaNonMPara 
{
	static void method1(char a, char b, String Name)
	{
		System.out.println("Method1");
	}
	
	void method2(boolean a, String Name, double d)
	{
		
		System.out.println("Method2");
		
	}
	
	static void method3()
	{
		
		System.out.println("Method3");
	}
	
	static void method4()
	{
	
		System.out.println("Method4");
		
	}
	
	void method5(int a, int b, int c, double d)
	{
		
		System.out.println("Method5");
		
	}
	
	public static void main(String[] args)
	
	{
		method1('M', 'F', "ABC");
		ParaNonMPara p1=new ParaNonMPara();
		p1.method2(true, "Kabir", 3.14);
		method3();
		method4();
		ParaNonMPara p2=new ParaNonMPara();
		p2.method5(1, 2, 3, 3.14);
		p1.method5(2, 4, 6, 3.14);
	}

}
