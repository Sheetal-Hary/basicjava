package BasicJavaProgram;

public class GlobalLocal 

{
static int noofdays2025=365;

	public static void main(String[] args) 
	
	{
		int earningperday=200;
		earningperday=210; //updating the value of a local variable.
		
		GlobalLocal g1=new GlobalLocal();
		
		g1.noofdays2025=366; //updating the global variable which is nonstatic
		
		int totallearning =earningperday*g1.noofdays2025;
		System.out.println(totallearning);
		

	}

}
