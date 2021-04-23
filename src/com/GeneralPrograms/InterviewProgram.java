package com.GeneralPrograms;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class InterviewProgram
{

    public static void main(String[] args) throws IOException
    { 
	BufferedReader oBufferedReader = new BufferedReader(new InputStreamReader(System.in));
	System.out.print("Enter BillAmount : ");
	String str = oBufferedReader.readLine();
	//Method 1
	discountMethod1(str);
	
	//Method 2
	discountMethod2(str);
	
    }

    private static void discountMethod2(String str)
    {
	System.out.println("Output From Method 2");
	System.out.println("--------------------");
	int nAmount = Integer.parseInt(str);
	int nEven = 0;
	int nOdd = 0;
	
	while(nAmount != 0)
	{
	    int nDigit = nAmount % 10;
	    if(nDigit %2 == 0)
		nEven += nDigit;
	    else
		nOdd += nDigit;
	    nAmount = nAmount / 10;
	}
	System.out.println("Total Even Digits Sum is " + nEven);
	System.out.println("Total Odd Digits Sum is " + nOdd);
	System.out.println("Discount Amount is : " + nEven * nOdd);
	
    }

    private static void discountMethod1(String str)
    {
	System.out.println("Output From Method 1");
	System.out.println("--------------------");
	int i = Integer.parseInt(str);
	String s = String.valueOf(i);  
	System.out.println(i); 
	char[] arr = s.toCharArray();
	int nEven = 0;
	int nOdd = 0;
	System.out.println(Arrays.toString(arr));
	for(int nIndex = 0; nIndex < arr.length; nIndex++)
	{
	    int num = Integer.parseInt(String.valueOf(arr[nIndex]));
	    if(num % 2 == 0)
	        nEven += num;
	    else
	        nOdd += num;
	}
	System.out.println("Total Even Digits Sum is " + nEven);
	System.out.println("Total Odd Digits Sum is " + nOdd);
	System.out.println("Discount Amount is : " + nEven * nOdd);
	System.out.println();
    }

}
