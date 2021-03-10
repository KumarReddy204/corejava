package com.GeneralPrograms.Arrays;

import java.util.Arrays;
import java.util.HashSet;

public class SecondLargestNumber
{
    public static void main(String[] args)
    {
	int[] arrNumbers = {68,2,95,1,5,4,3};
	Arrays.sort(arrNumbers);
	System.out.println(arrNumbers[arrNumbers.length - 2]);
    }

}
