package BasicJavaProgram;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListProperty2 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		List<Integer> l1=new ArrayList<Integer>();
		l1.add(12);
		l1.add(45);
		l1.add(20);
		l1.add(25);
		System.out.println("before sorting");
		System.out.println(l1);
		Collections.sort(l1);
		System.out.println("after sorting");
		System.out.println(l1);
	}

}
