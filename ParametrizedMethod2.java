package BasicJavaProgram;

public class ParametrizedMethod2 

{

	static void name(String Name)
	{
		
		System.out.println(Name);
	}
	
	static void student_details(String Name, char gender, double salary)
	{
		System.out.println(Name);
		System.out.println(gender);
		System.out.println(salary);
	}
	static void teacherdetails (boolean a, boolean b)
	{
		System.out.println(a);
		System.out.println(b);
	}
	
	public static void main(String[] args) 
	{
		
		name("Abhinav");
		teacherdetails(true, false);
		student_details("Ramu",'M',99000);
		
		
	}

}
