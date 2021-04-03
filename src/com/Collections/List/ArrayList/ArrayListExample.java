package com.Collections.List.ArrayList;

import java.util.*;

public class ArrayListExample
{
    @SuppressWarnings({ "rawtypes", "unchecked" })
    public static void main(String[] args)
    {
	
	ArrayList arrList =  new ArrayList();
	arrList.add(1);
	arrList.add("Kumar Swamy Reddy");
	arrList.add(true);
	arrList.add(5.0);
	arrList.add('B');
	
	System.out.println(arrList);
    }
}

/*

ArrayList Internal Work flow

1.When we Create array object(Line-11) and the jvm create array memory of 10 blocks(default size).
2.If we add some values to the arraylist.It will store the value in 0 Index.
3.if Add 11 th Element then arraylist will increase dynamically and stored the value in 10 th Index.
	i.e current-capacity * 3/2 + 1;
	    => 10 * 3/2 +1;
	    => 5 * 3 + 1;
	    => 15 + 1;
	    => 16
	    
4.It follows Insertion Order while Retreival Operation.
5.If any Add or Remove Particular Element then Remaining elements Shifts to respective postion.
6.Shift Operation Takes time if array size more.
7.It is not Good for Add or Remove Operations.
8.It is Good for Retreval Operation. i.e arr.get(index value)
*/