package BasicJavaProgram;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionFramework2 {

	public static void main(String[] args) 
	
	{
		Collection c1=new ArrayList(); //upcasting
		c1.add("Anusha");
		c1.add(true);
		c1.add(3.14);
		c1.add(500000);
		c1.add('A');
		
		c1.add("Anusha");
		c1.add(true);
		c1.add(3.14);
		c1.add(500000);
		c1.add('A');
		
		c1.add("Anusha");
		c1.add(true);
		c1.add(3.14);
		c1.add(500000);
		c1.add('A');
		
		System.out.println(c1);
		
		Collection c2=new ArrayList();
		c2.addAll(c1);
		c2.add("Kishore");
		System.out.println(c2);

	}

}
