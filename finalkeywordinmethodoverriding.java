package BasicJavaProgram;

class childclass467 //parent class
{
	final void wood123()
	{
		System.out.println("Wooden Comb");
	}
}

public class finalkeywordinmethodoverriding extends childclass467
{

	void usesofwood123()//child class
	{
		//super.wood123();
		System.out.println("Wooden CoffeeTable");
	}

	public static void main(String[] args) 
	
	{
		// WAP on Super Keyword
		//create an object of the child class
		finalkeywordinmethodoverriding t1=new finalkeywordinmethodoverriding();
		t1.wood123();

	}
}




