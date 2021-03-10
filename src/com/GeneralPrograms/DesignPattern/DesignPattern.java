package com.GeneralPrograms.DesignPattern;

import java.util.*;

public class DesignPattern 
{
    public static void main(String[] args) 
    {
	Scanner oScanner = new Scanner(System.in);
	System.out.print("Enter no of Lines you want : ");
	int nLines = oScanner.nextInt();
	for(int nIndex = 0; nIndex < nLines; nIndex++)
	{
	    for(int jIndex = 0; jIndex <= nIndex; jIndex++)
	    {
		System.out.print("* ");
	    }
	    System.out.println();
	}
    }
}

/* 
  Explination
   loop 1         loop2                           output
    0 < 5          0<=0,1<=0                       *
    1 < 5          0<=1,1<=1,2<=1                  * *
    2 < 5          0<=2,1<=2,2<=2                  * * *
    3 < 5          0<=3,1<=3,2<=3,3<=3,4<=3        * * * *
    4 < 5          0<=4,1<=4,2<=4,3<=4,4<=4,5<=4   * * * * *     
    5 < 5
*/
