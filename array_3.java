package BasicJavaProgram;
import java.util.Arrays;
import java.util.Scanner;

public class array_3 {

	public static void main(String[] args)
	
	{
		// write a program to create an array of size 4 using scanner class.
		
		Scanner s1=new Scanner(System.in);
		System.out.println("Please enter the size of your array: ");
		int [] rollno=new int[s1.nextInt()];
		for (int i=0; i<=rollno.length-1;i++)
		{
			System.out.println("This is your Input Array: "+i);
			rollno[i]=s1.nextInt();
		}
		
		System.out.println("This is your input array: " +Arrays.toString(rollno));
		s1.close();
		int [] rollno1=new int [rollno.length];
		for (int j=0;j<=rollno1.length-1;j++)
		{
			rollno1[j]=rollno[j];
		}
		System.out.println("This is your output/copied Array: "+ Arrays.toString(rollno1));
	}


}
