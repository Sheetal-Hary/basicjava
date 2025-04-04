package BasicJavaProgram;

public class Grotechminds 
{

	Grotechminds()//this is constructor
	//access specifier - default package
	//Return type - no return type
	//modifier - non static
	//parameterized or non parameterized - non para
	{
		System.out.println("This is Constructor");
	}
	public static void main(String[] args) 
	
	{
		// To call a constructor, create an object no reference variable is needed here.
		//two object creation will call the constructor twice.
		//when you call the nonstatic the below syntax would be advisable.
		//g1 and g2 - reference variable
		
		//Method 1:
		//Grotechminds g1=new Grotechminds();//just create an object no reference variable is needed. also to call non static method this is the best way to do so.
		//Grotechminds g2=new Grotechminds();//don't create a duplicate so make sure to create a new object.
		
		//2nd syntax to create an object is 
		//new ClassName();
		
		//Method 2:
		new Grotechminds();//static method - no specific object variable needed.
		new Grotechminds();

	}

}
