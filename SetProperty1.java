package BasicJavaProgram;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetProperty1 
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		
		Set s1=new HashSet();
		s1.add("Sheetal");
		s1.add("Ajitha");
		s1.add("Anusha");
		s1.add(85);
		s1.add(true);
		s1.add("Sheetal"); //no duplicate values
		s1.add(9.32);
		Iterator i1=s1.iterator();
		while (i1.hasNext())
		{
			System.out.println(i1.next());	
		}
	}

}
