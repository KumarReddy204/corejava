package com.GeneralPrograms;

import java.util.*;

public class ReverseString
{

    public static void main(String[] args)
    {
	Scanner oScanner = new Scanner(System.in);
	System.out.print("Enter String : ");
	String strValue = oScanner.nextLine();
	//Method 1
	reverseStringMethod1(strValue);
	
	//Method2
	reverseStringMethod2(strValue);
    }

    private static void reverseStringMethod2(String strValue)
    {
	System.out.println("Output from Method 2");
	System.out.println("--------------------");
	String strReverseString = "";
	System.out.println("Entered String is " + strValue);
	for(int nIndex = strValue.length() -1 ; nIndex >= 0 ; nIndex--)
	{
	    strReverseString += strValue.charAt(nIndex);
	}
	System.out.println("Reversed String is " + strReverseString);
    }

    private static void reverseStringMethod1(String strValue)
    {
	System.out.println("Output from Method 1");
	System.out.println("--------------------");
	System.out.println("Entered String is " + strValue);
	StringBuffer oStringBuffer =  new StringBuffer(strValue);
	System.out.println("Reversed String is " + oStringBuffer.reverse());
	System.out.println();
    }

}
