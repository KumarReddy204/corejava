package com.GeneralPrograms;

import java.util.*;

public class SumofIntegerDigits
{

    public static void main(String[] args)
    {
	Scanner oScanner = new Scanner(System.in);
	System.out.print("Enter Number : ");
	int nNumber = Integer.parseInt(oScanner.nextLine());
	int nSum = 0;
	while(nNumber != 0)
	{
	    int i = nNumber % 10 ;
	    nSum += i;
	    nNumber = nNumber / 10;
	}
	System.out.println("Sum of Digits is " + nSum);
    }

}
