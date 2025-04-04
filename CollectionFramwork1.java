package BasicJavaProgram;
//Finding out the behavior of collection (I)

import java.util.ArrayList;
import java.util.Collection;

public class CollectionFramwork1 
{

	public static void main(String[] args) 
	{
		
		Collection c1=new ArrayList(); //upcasting
		c1.add("Anusha");
		c1.add(true);
		c1.add(3.14);
		c1.add(500000);
		c1.add('A');
		
		System.out.println(c1);
		
	}

}
