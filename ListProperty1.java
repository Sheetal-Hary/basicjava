package BasicJavaProgram;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ListProperty1 
{
// Fix the program
	public static void main(String[] args) 
	
	{
		List <String> l1= new ArrayList<String>();
		l1.add("shoe");
		l1.add("card");
		l1.add("backpack");
		l1.add("laptop");
		System.out.println(l1);
		
		Iterator <String> i2=l1.iterator();
		i2.next(); //Return type of the next method is an object.
		i2.hasNext(); //if the next element is present. usually the return type is boolean
		//methods that are important are the above two 
		//remove and one more method is also important.
		System.out.println("Fwd iteration using iterator");
		while(i2.hasNext()) //forward iteration
		{
			System.out.println(i2.next());
		}
			
		ListIterator <String>i3=l1.listIterator();
		i3.hasNext();//boolean
		i3.hasPrevious(); //boolean
		i3.next(); //object
		i3.previous(); //object
	
		ListIterator<String> i4=l1.listIterator();
		
		System.out.println("Fwd iteration using list iterator");
		while (i4.hasNext())
		{
			System.out.println(i4.next());
		}
		
		ListIterator<String> i5=l1.listIterator();
		System.out.println("Backward iteration using list iterator");
		
		while (i5.hasPrevious())
		{
			System.out.println(i5.previous());
		}
		
		
	}

}
