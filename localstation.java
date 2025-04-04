package BasicJavaProgram;

public class localstation 

{
	double pi=3.14;
	static int m=200;
	static float f;
	
	static void statemethod()
	{
		int a=10;
		System.out.println(a);
	}
	void nonstaticmethod1()
	{
		System.out.println(pi);
	
	}
	
	void nonstaticmethod2()
	{
		int b=20;
		localstation s=new localstation();
		s.pi=4.15;
		System.out.println(s.pi);
		s.nonstaticmethod1();
	}
	public static void main(String[] args) 
	
	{
		// program written by someone else.
		statemethod();
		localstation n=new localstation();
		n.nonstaticmethod2();
		System.out.println(m);
		m=300;
		System.out.println(m);
		System.out.println(n.pi);

	}

}
