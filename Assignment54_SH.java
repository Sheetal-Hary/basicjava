package Assignments_MKT;

class Humans
{
	void sleep()
	{
		System.out.println("Humanbeings need 8 hours of sleep");	
	}
}

class Man extends Humans
{
	void eat()
	{
		System.out.println("Man is eating his lunch");
	}
}

class Boy extends Man
{
	void play()
	{
	System.out.println("The boy is playing with his friends"); 
	}
}
public class Assignment54_SH 
{

	public static void main(String[] args) 
	{
		// WAP on Multiple Level Inheritance 
		Boy duties =new Boy();
		duties.sleep();
		duties.eat();
		duties.play();

	}

}
