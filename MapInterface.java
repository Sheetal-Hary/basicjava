package BasicJavaProgram;

import java.util.HashMap;
import java.util.Map;

public class MapInterface {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		Map <String, String> m1=new HashMap<String, String>(); //upcasting
		//string and int also we can store
		m1.put("Student Name 1", "Ashwini");
		m1.put("Student Name 2", "Daisy");
		m1.put("Student Name 3", "Ram");
		m1.put("Student Name 4", "Lakshmi");
		m1.put("Student Name 5", "Manish");
		m1.put("Student Name 6", "Satya");
		System.out.println(m1);
	}

}
