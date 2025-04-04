package BasicJavaProgram;

public class ParametrizedMethod3 
{
	void add(int a,int b)
	//parametrized method
	
	{
		System.out.println(a+b);
	}
	
   void mul()
	//mul() - non parametrized method
	{
		int a= 10;// local variable and the scope of the local variable is only within the method.
		int b=20;
		System.out.println(a*b);
	}
   
   void sub(int a, int b)
   {
	   
	   System.out.println(a-b);
   }
	
	public static void main(String[] args) 
	
	{
		ParametrizedMethod3 p1=new ParametrizedMethod3();
		p1.add(100,433);
		p1.mul();
		p1.sub(10,20);
		
	}

}