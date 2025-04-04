package BasicJavaProgram;

public class Teacher {


	void add()
	{
		
		int a=10;
		int b=20;
		System.out.println(a+b);
	}
	void sub()
	{
		
		int a=10;
		int b=20;
		System.out.println(a-b);
	}
	public static void main(String[] args) 
	
	{
		// TODO Auto-generated method stub
		
		Teacher t=new Teacher();//object creation
		//Classname variable=new Classname ();
		t.add();
//variable.nonstaticmethod()
		t.sub();
		t.sub();
	}

}
