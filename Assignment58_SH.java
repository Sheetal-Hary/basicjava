package Assignments_MKT;

import AccessSpecifierCase2.Class2;

public class Assignment58_SH
{

	public static void main(String[] args) 
	{
		// WAP on Access specifiers outside the package without becoming the subclass for methods		
		
		Class2.add(); //only public will be called.
		// Class2.mul(); //others will throw error.

	}
}

