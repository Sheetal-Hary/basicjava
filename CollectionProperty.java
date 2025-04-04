package BasicJavaProgram;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionProperty 
{
	public static void main(String[] args) 
	{
		Collection<String> c1=new ArrayList<String>();
		c1.add("ram");
		c1.add("pooja");
		c1.add("Tikoo");
		c1.add("Abhi");
		System.out.println(c1);
		
		Collection<Integer> c2=new ArrayList<Integer>();
		//if we write integer we can store all homogeneous value
		c2.add(740);
		c2.add(840);
		c2.add(940);
		c2.add(1000);
		System.out.println(c2);
		
		Collection<Integer> c3=new ArrayList<Integer>();
		c3.add(1000);
		c3.add(10000);
		c3.add(5000);
		c3.add(4000);
		System.out.println(c3);
		c3.addAll(c2);
		System.out.println(c3);
		
		/*c3.clear();
		System.out.println("After Clearing, C3 has become -> " +c3);
		
		
		c3.remove(10000);
		System.out.println("After removing an object, C3 has become ->" +c3);
		
		c3.removeAll(c2);
		System.out.println("After removing an entire collection C2, C3 has become->"+c3);
		 */
		
		boolean b1 = c3.contains(4000);
		System.out.println(b1);
		
		boolean b2= c3.containsAll(c2);
		System.out.println(b2);

	}

}
