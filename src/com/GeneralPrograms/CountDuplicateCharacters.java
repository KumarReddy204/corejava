package com.GeneralPrograms;

import java.util.*;

public class CountDuplicateCharacters
{

    public static void main(String[] args)
    {
	Scanner oScanner = new Scanner(System.in);
	System.out.print("Enter String : ");
	
	HashMap<Character, Integer> oHashMap =  new HashMap<>();
	char[] arrCharacters = oScanner.nextLine().toCharArray();
	
	for(char ch : arrCharacters)
	{
	    if(oHashMap.containsKey(ch))
	    {
		oHashMap.put(ch, oHashMap.get(ch)+1);
	    }
	    else
	    {
		oHashMap.put(ch, 1);
	    }
	}
	
	Set<Character> oSet = oHashMap.keySet();
	for(Character chr : oSet)
	{
	    if(oHashMap.get(chr) > 1)
		System.out.println(chr + " : "+ oHashMap.get(chr));
	}
    }

}
