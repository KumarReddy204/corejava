package com.Algorithms;

import java.util.*;
public class LargestSumofContigousSubArray
{

    public static void main(String[] args)
    {
	//int[] arrNumbers = {-2,-3,4,-1,-2,1,5,-3};
	
	Scanner oScanner = new Scanner(System.in);
	System.out.print("Enter Array Size : ");
	int nSize = oScanner.nextInt();
	int[] arrNumbers = new int[nSize];
	
	int nLargestValue = 0;
	System.out.print("Enter values : ");
	
	for(int nIndex = 0; nIndex < nSize; nIndex++)
	    arrNumbers[nIndex] = oScanner.nextInt();
	
	System.out.print("Entered Array Values are: ");
	System.out.print(Arrays.toString(arrNumbers));
	System.out.println();
	
	int nMaxNumber = arrNumbers[0];
	int nMaxEndNumber = 0;
	int nStart = 0;
	int nEnd = 0;
	int nSearch = 0;
	
	for(int k = 0; k < arrNumbers.length;k++)
	{
	    nMaxEndNumber = nMaxEndNumber + arrNumbers[k];
	    if(nMaxNumber < nMaxEndNumber)
	    {
		nMaxNumber = nMaxEndNumber;
		nStart = nSearch;
		nEnd = k;
	    }
	    if(nMaxEndNumber < 0)
	    {
		nMaxEndNumber = 0;
		nSearch = k+1;
	    }
	}
	System.out.println("Largest Sum of SubArray is "+nMaxNumber);
	System.out.println("SubArray is Starting Index is :"+nStart);
	System.out.println("SubArray is Ending Index is :"+nEnd);
	
	int[] arrSubArray = Arrays.copyOfRange(arrNumbers, nStart, nEnd);
	
	System.out.print("SubArray is : "+ Arrays.toString(arrSubArray));

    }

}

