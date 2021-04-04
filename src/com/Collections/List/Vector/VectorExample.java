package com.Collections.List.Vector;
import java.util.*;

public class VectorExample
{

    @SuppressWarnings({ "rawtypes", "unchecked" })
    public static void main(String[] args)
    {
	Vector arrVector = new Vector();
	System.out.println(arrVector.capacity());
	arrVector.add(1);
	arrVector.add("Kumar Swamy Reddy");
	arrVector.add(true);
	arrVector.add(1);
	arrVector.add(55.0);
	arrVector.add(9);
	arrVector.add(1);
	arrVector.add(7);
	arrVector.add(7);
	arrVector.add(9);
	System.out.println(arrVector.capacity());
	arrVector.add(2);
	System.out.println(arrVector.capacity());
	arrVector.trimToSize();
	System.out.println(arrVector.capacity());
	
    }
}

/*
 1.It is also worked as ArrayList.
 2.default size is 10;
 3.If we add 11th element it increase the size by twice.
 	i.e current-capacity * 2;
 	=> 10 * 2;
 	=> 20
 4.It is Synchronized and thread safe.
 5.We can able see the capacity.
 6.It will allows single thread.
 7.It will take more time to execute.
 
 */

