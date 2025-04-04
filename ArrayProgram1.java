package BasicJavaProgram;

public class ArrayProgram1 

{

	public static void main(String[] args) 
	
	{
		// TODO Auto-generated method stub
		
		int [] rollno=new int[4];
		rollno[0]=74;
		rollno[1]=64;
		rollno[2]=54;
		//rollno[3]=34;


		String [] name=new String[3];
		name[0]="Sudha";
		name[1]="Sneha";
		name[2]="Shubham";

		
		
		/*
			System.out.println(name[0] + " roll no is -> " +rollno[0]);
			System.out.println(name[1] + " roll no is -> " +rollno[1]);
			System.out.println(name[2] + " roll no is -> " +rollno[2]);
		*/	
			 
		//use for loop to write the output
			
			for (int i=0;i<=2;i--)
			{
	
				System.out.println(name [0-2] + " roll no is -> " +rollno.length);
			}
			 	
		
	}

}

  