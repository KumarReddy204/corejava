package com.GeneralPrograms.HackerRank;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution 
{
    public static void main(String[] args) throws IOException 
    {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter Number : ");
        int n = Integer.parseInt(bufferedReader.readLine().trim());
        Result.fizzBuzz(n);
        bufferedReader.close();
    }
}