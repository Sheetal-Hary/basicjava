package BasicJavaProgram;

import java.security.KeyStore.Entry;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapInterface2 {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		Map <String, Integer> m1=new HashMap<String, Integer>(); //upcasting
		m1.put( "mouse", 23);
		m1.put( "monitors", 45);
		m1.put( "pendrives", 15);
		m1.put( "CPU", 23);
		m1.put( "Keyboards", 45);
		System.out.println(m1);
		Map<String, Integer> m2= new HashMap<String, Integer>();
		m2.put("Screenguards",440);
		m2.put("Headphones", 60);
		System.out.println(m2);
		m2.putAll(m2);
		System.out.println(m2);
		boolean b1=m2.isEmpty();
		System.out.println(b1);
		//m2.clear();
		//System.out.println("After empty : >" +m2);
		//m2.putIfAbsent("Headphone", 5);
		m2.putIfAbsent("Waterbottle", 5);
		System.out.println(m2);
		m2.remove("Keyboards");
		m2.remove("pendrives", 15);
		m2.replace("mouse", 35);
		m2.replace("pendrives", 15, 45);
		m2.get("monitors");
		System.out.println(m2.get("monitors"));
		System.out.println(m2);
		
	//	Set <String> s1 = m1.keySet();
		//return type Set - unique values - qty can be duplicate. name cannot be duplicate
		System.out.println("Iterating all keys: ");
		for (String s2 : m1.keySet())
		{
			System.out.println(s2);
		}
		//System.out.println(m1.keySet()); //that's why the return type is set -because the keys have to be unique.
		//return type is Set of object and not set of string.
		
		System.out.println("Iterating all values: ");
		for (Integer i1 :m1.values())
		{
			System.out.println(i1);
		}
		System.out.println("Iterating all values and keys: ");
	
		//Set <Entry <String, Integer>> s4 = m1.entrySet();
		for (java.util.Map.Entry<String, Integer> e1 :m1.entrySet() )
		{
			System.out.println(e1);
		}
	}

}