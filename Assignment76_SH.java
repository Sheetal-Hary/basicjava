package Assignments_MKT;

import java.util.Arrays;

public class Assignment76_SH
{
    public static void main(String[] args) 
    {
        // Find the average of all the numbers present in your array
        
    	System.out.println("Output Displayed Below: ");
    	int input[] = new int[3];
    	input[0]=10;
    	input[1]=20;
    	input[2]=30;
    	System.out.println("Input Array: " + Arrays.toString(input));
    	
        // Calculate sum
        int sum = 0;
        for (int i = 0; i < input.length; i++) 
        {
           sum = sum + input[i];
        }

        // Calculate average
       double average = sum / input.length;

        System.out.println("SUM: " + sum);
        System.out.println("AVERAGE: " + average);
    }
}