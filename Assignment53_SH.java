package Assignments_MKT;
interface Veggies
{
void green();
void yellow();
}
interface organic extends Veggies
{
void orangepeppers();	
}
class carrot implements organic
{
	public void green()
	{
		System.out.println("Green peppers are green in color");
	}
	
	public void yellow()
	{
		System.out.println("Yellow peppers are yellow in color");
	}
	
	public void organic()
	{
		System.out.println("Orange peppers are organic produce");
	}

	@Override
	public void orangepeppers() {
		// TODO Auto-generated method stub
		
	}
}
public class Assignment53_SH 
{
	public static void main(String[] args) 
	{
		// WAP on Multi Level Inheritance using Interface Concept
		
		carrot v=new carrot();
		v.green();
		v.yellow();
		v.organic();
	}
}
