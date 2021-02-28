package com.GeneralPrograms;

import java.util.Scanner;

public class Factorial 
{
    
    public static void main(String[] args)
    {
	Scanner oScanner = new Scanner(System.in);
	System.out.print("Enter FactorialNumber : ");
	int nEnterFactorialNumber = oScanner.nextInt();

	System.out.println(getFactorialValue(nEnterFactorialNumber));
	/*System.out.print("Do you want enter one more time (0/1) ?? : ");
	
	int nValue = oScanner.nextInt();
	
	if(nValue == 1)
	{
	    System.out.print("Enter FactorialNumber : ");
	    int nFactorialNumber = oScanner.nextInt();
	    System.out.println(getFactorialValue(nFactorialNumber));
	}
	else
	{
	    System.out.print("Application is Terminated");
	    System.out.print("Sucessfully Completed");
	    System.exit(0);
	}	   */
    }

    private static int getFactorialValue(int nEnterFactorialNumber)
    {
	int nEnterFactorialValue = 1;
	for(int nIndex = 1; nIndex <= nEnterFactorialNumber; nIndex++)
	    nEnterFactorialValue *= nIndex;
	return nEnterFactorialValue;	
    }
}
