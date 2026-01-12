package com.Java8Features;



public class StreamAPIOnNumbers {

   /*🟢 BASIC LEVEL (FOUNDATION)
    1. Find all even numbers using Streams
        Input : List<Integer> numbers = List.of(12, 7, 9, 20, 33, 40);
        Output: [12, 20, 40]
    2. Find all odd numbers using Streams
        Input : List<Integer> numbers = List.of(18, 21, 14, 7, 30, 25);
        Output: [21, 7, 25]
    3. Find the sum of all numbers using Streams
        Input : List<Integer> numbers = List.of(5, 10, 15, 20);
        Output: 50
    4. Find the average of numbers using Streams
        Input : List<Integer> numbers = List.of(10, 20, 30, 40);
        Output:  25.0
    5. Find the maximum number using Streams
        Input : List<Integer> numbers = List.of(3, 17, 9, 21, 14);
        Output: 21
    6. Find the minimum number using Streams
        Input : List<Integer> numbers = List.of(8, 2, 19, 4, 11);
        Output: 2

    🟡 INTERMEDIATE LEVEL (MOST INTERVIEW QUESTIONS)
    7. Remove duplicate numbers using Streams
        Input : List<Integer> numbers = List.of(5, 2, 5, 7, 2, 9, 7);
        Output: [5, 2, 7, 9]
    8. Find the second highest number using Streams
        Input : List<Integer> numbers = List.of(40, 20, 30, 50, 30, 10);
        Output: 40
    9. Find the second lowest number using Streams
        Input : List<Integer> numbers = List.of(7, 3, 9, 1, 5, 3);
        Output: 3
    10. Count how many numbers are greater than 25 using Streams
        Input : List<Integer> numbers = List.of(12, 28, 5, 35, 19, 42);
        Output: 3
    11. Find the first number greater than 20 using Streams
        Input : List<Integer> numbers = List.of(10, 15, 22, 30, 40);
        Output: 22
    12. Find the last number less than 30 using Streams
        Input : List<Integer> numbers = List.of(5, 12, 18, 29, 33, 45);
        Output: 29

    🔵 GROUPING / PARTITIONING SCENARIOS
    13. Partition numbers into even and odd using Streams
        Input : List<Integer> numbers = List.of(6, 11, 18, 23, 30, 41);
        Output: Even → [6, 18, 30], Odd → [11, 23, 41]
    14. Partition numbers into positive and negative using Streams
        Input : List<Integer> numbers = List.of(-10, 15, -3, 7, 0, -20, 25);
        Output: Positive → [15, 7, 25], Negative → [-10, -3, 0, -20]
    15. Count frequency of each number using Streams
        Input : List<Integer> numbers = List.of(1, 2, 2, 3, 4, 1, 2);
        Output: {1=2, 2=3, 3=1, 4=1}
    16. Find numbers that appear more than once using Streams
        Input : List<Integer> numbers = List.of(9, 4, 9, 2, 4, 6, 2);
        Output: [9, 4, 2]
    17. Group numbers by even and odd using Streams
        Input : List<Integer> numbers = List.of(10, 15, 20, 25, 30);
        Output: Even → [10, 20, 30], Odd → [15, 25]

    🔴 ADVANCED / TRICKY INTERVIEW QUESTIONS
    18. Find the top 3 highest numbers using Streams
        Input : List<Integer> numbers = List.of(10, 45, 32, 67, 89, 23);
        Output: [89, 67, 45]
    19. Find the product of all numbers using Streams
        Input : List<Integer> numbers = List.of(2, 3, 4, 5);
        Output: 120
    20. Skip the first 3 numbers and return the next 2 using Streams
        Input : List<Integer> numbers = List.of(5, 10, 15, 20, 25, 30);
        Output: [20, 25]
    21. Limit the stream to first 4 numbers using Streams
        Input : List<Integer> numbers = List.of(3, 6, 9, 12, 15, 18);
        Output: [3, 6, 9, 12]
    22. Check if any number is divisible by 7 using Streams
        Input : List<Integer> numbers = List.of(10, 14, 22, 29, 35);
        Output: true
    23. Check if all numbers are positive using Streams
        Input : List<Integer> numbers = List.of(5, 12, 8, 20, 3);
        Output: true
    24. Check if none of the numbers are zero using Streams
        Input : List<Integer> numbers = List.of(4, 7, 9, 12, 15);
        Output: true

    🔥 VERY TRICKY / REAL INTERVIEW SCENARIOS
    25. Find the first even number greater than 20 using Streams
        Input : List<Integer> numbers = List.of(5, 12, 18, 22, 30, 40);
        Output: 22
    26. Find the sum of squares of even numbers using Streams
        Input : List<Integer> numbers = List.of(2, 3, 4, 5, 6);
        Output: 56
    27. Find numbers divisible by both 3 and 5 using Streams
        Input : List<Integer> numbers = List.of(10, 15, 30, 22, 45, 60);
        Output: [15, 30, 45, 60]
    28. Find the maximum number after removing duplicates using Streams
        Input : List<Integer> numbers = List.of(10, 20, 30, 20, 10, 40);
        Output: 40
    29. Sort numbers in descending order using Streams
        Input : List<Integer> numbers = List.of(8, 3, 12, 6, 1);
        Output: [12, 8, 6, 3, 1]
    30. Convert list of numbers into a map (number → square) using Streams
        Input : List<Integer> numbers = List.of(2, 4, 6, 8);
        Output: {2=4, 4=16, 6=36, 8=64}
    31.Given a list of integers, find out all the even numbers exist in the list using Stream functions?
        Input = {10,15,8,49,25,98,32};
        Output = [10, 8, 98, 32];
    32.Given a list of integers, find out all the numbers starting with 1 using Stream functions?
        Input = 10,15,8,49,25,98,32;
        Output = [10, 15];
    33.How to find duplicate elements in a given integers list in java using Stream functions?
        Input  = 10,15,8,49,25,98,98,32,15;
        Output = [98, 15];
    34.Given the list of integers, find the first element of the list using Stream functions?
        Input = 10,15,8,49,25,98,98,32,15);
        Output =  Optional[10];
    35.Given a list of integers, find the total number of elements present in the list using Stream functions?
        Input  = 10,15,8,49,25,98,98,32,15;
        Output = 9
    36.Given a list of integers, find the maximum value element present in it using Stream functions?
        Input = 10,15,8,49,25,98,98,32,15;
        Output = Optional[98];
    37.Given a list of integers, sort all the values present in it using Stream functions?
        Input = 10,15,8,49,25,98,98,32,15;
        Output = [8, 10, 15, 15, 25, 32, 49, 98, 98]
    38.Given a list of integers, sort all the values present in it in descending order using Stream functions?
        Input = 10,15,8,49,25,98,98,32,15;
        Output = [98, 98, 49, 32, 25, 15, 15, 10, 8]

    */


    public static void main(String[] args){

    }

}
