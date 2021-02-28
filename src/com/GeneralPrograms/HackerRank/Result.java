package com.GeneralPrograms.HackerRank;


public class Result 
{
    /*
     * Complete the 'fizzBuzz' function below.
     *
     * The function accepts INTEGER n as parameter.
     */

    public static void fizzBuzz(int n) 
    {
        for(int i = 1; i <= n; i++)
        {
            if(i%3 == 0)
                System.out.print("Fizz");
            if(i%5 == 0)
                System.out.print("Buzz");
            else if(i%3 != 0)
                 System.out.print(i);
            System.out.println();
        }
    }
}
