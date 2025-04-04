package BasicJavaProgram;

public class SudhaAssignment22 

{
	
	static int global_variable=100; //declared a global variable
	int totalhrsperday=24; //declared a global variable
	static int noofdaysperweek=7; //declared a global variable
	
	static void add()
	{
		
		int a=10;
		int b=20;
		int sum=(a+b)+global_variable; //utilized and initialized the global variable
		System.out.println("The sum is:" +sum);
	}
	
	void hours()
	{
		int noofsecs=60;
		int noofmins=60;
		long totalmins=(noofsecs*noofmins)*totalhrsperday;
		System.out.println("Total number of minutes per day is:" +totalmins);
	}
	
	static void days()
	{
		int weekend=2;
		int week=noofdaysperweek-weekend;
		System.out.println("Total numebr of minutes per day is:" + week);
	}

	public static void main(String[] args) 
	
	{
		// Assignment 22 done by Sudha
		add();
		SudhaAssignment22 m1=new SudhaAssignment22();
		m1.hours();
		days();
		

	}

}
