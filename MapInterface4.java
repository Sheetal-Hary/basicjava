package BasicJavaProgram;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapInterface4 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		Map <String, Integer> m1=new HashMap<String, Integer>();
		m1.put("Mouse", 50);
		m1.put("Keyboards", 40);
		m1.put("Monitors", 30);
		System.out.println("Size is: " +m1.size());
		
		System.out.println("Iteration using Set's Iterator:");
		Set<Entry<String, Integer>> s2 = m1.entrySet();
		Iterator <Entry<String, Integer>>s3= s2.iterator();
		
		while (s3.hasNext())
		{
			System.out.println(s3.next());
		}
//LinkedList<E> l1=new LinkedList();
//l1.add(l1)
	}

}
