package BasicJavaProgram;

public class GlobalVariable 

{
	double pi=3.14; //global
	static int noofdays2025=365; //global
	static double bankbalance; //declaration
//static String name;
	static String name="Sheetal";
	static boolean answer;
	static void add()
	{
		int a=100; //local
	}

	void sub()
	{
		int b=200; //local
		
	}
	public static void main(String[] args) 
	
	{
		int c=300; //local
		System.out.println(bankbalance);
		System.out.println(name);
		System.out.println(answer);
		System.out.println(noofdays2025);
		
	}

}
