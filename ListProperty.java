package BasicJavaProgram;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class ListProperty 
{

	public static void main(String[] args) 
	{
		List l1= new ArrayList();
		l1.add ("shoe");
		l1.add ("card");
		l1.add ("laptop");
		l1.add ("earphones");
		l1.add (10000);
		l1.add (true);
		l1.add ('A');
		l1.add(0, "manish");
		System.out.println(l1);
		List l2 = new ArrayList();
	l2.addAll(l1);
	
	
	}

}
