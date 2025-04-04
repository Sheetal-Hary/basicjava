package BasicJavaProgram;

import java.util.HashMap;
import java.util.Map;

public class MapInterface1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map <String, Integer> m1=new HashMap<String, Integer>(); //upcasting
		//string and int also we can store
		m1.put( "Ashwini", 23);
		m1.put( "Daisy", 45);
		m1.put( "Ram", 15);
		m1.put( "Lakshmi", 23);
		m1.put( "Manish", 45);
		m1.put( "Satya", 32);
		System.out.println(m1);
		
		//String-String name- name of the person
		//String-long - phone no
		//two maps are needed.

	}

}
