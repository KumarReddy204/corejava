package org.kumar;

import java.util.*;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.*;

public class FP01StreamAPI {

    public static void main(String[] args) {
        /*
         * 1.Given a list of integers, find out all the even numbers exist in
         * the list using Stream functions?
         * //input = {10,15,8,49,25,98,32};
         * //output = [10, 8, 98, 32];
         */
        List<Integer> listArray = Arrays.asList(10, 15, 8, 49, 25, 98, 32);
        List<Integer> evenListArray = listArray.stream().filter(num -> num % 2 == 0).collect(Collectors.toList());
        System.out.println("Exercise 1 : " + evenListArray);

        /*2.Given a list of integers, find out all the numbers starting with 1 using Stream functions?
         *input = 10,15,8,49,25,98,32;
         *output = [10, 15];
         * */
        List<Integer> list = Arrays.asList(10,15,8,49,25,98,32);
        List<Integer> finalList = list.stream().map(num -> num.toString())
                .filter(strnum -> String.valueOf(strnum.charAt(0)).equals("1"))
                .map(num -> Integer.parseInt(num))
                .collect(Collectors.toList());
        System.out.println("Exercise 2 : " + finalList);

		/*3.How to find duplicate elements in a given integers list in java using Stream functions?
		//input  = 10,15,8,49,25,98,98,32,15;
		 * output = [98, 15];
		 */
        List<Integer> list1 = Arrays.asList(10,15,8,49,25,98,98,32,15);
        Set<Integer> set = new HashSet();
        Predicate<? super Integer> predicate = num -> !set.add(num);
        List<Integer> duplicateList = list1.stream().filter(predicate)
                .collect(Collectors.toList());
        System.out.println("Exercise 3 : " + duplicateList);

		/*4.Given the list of integers, find the first element of the list using Stream functions?
			input = 10,15,8,49,25,98,98,32,15);
			output =  Optional[10];
		 */
        List<Integer> list2 = Arrays.asList(10,15,8,49,25,98,98,32,15);
        Optional<Integer> firstElement = list2.stream().findFirst();
        System.out.println("Exercise 4 : " + firstElement);

		/*5.Given a list of integers, find the total number of elements present in the list using Stream functions?
		//input  = 10,15,8,49,25,98,98,32,15;
		 * output = 9
		 */
        List<Integer> list3 = Arrays.asList(10,15,8,49,25,98,98,32,15);
        long totalElements = list3.stream().count();
        System.out.println("Exercise 5 : " + totalElements);

        /*6.Given a list of integers, find the maximum value element present in it using Stream functions?
         * //input = 10,15,8,49,25,98,98,32,15;
         * output = Optional[98];
         */
        List<Integer>list6 = Arrays.asList(10,15,8,49,25,98,98,32,15);
        Optional<Integer> maximum = list6.stream().max((num1,num2)->num1.compareTo(num2));
        System.out.println("Exercise 6 : " + maximum);

        /*7.Given a String, find the first non-repeated character in it using Stream functions?
         * //String input = "Java Hungry Blog Alive is Awesome";
         * output = Optional[j];
         */
        String str = "Java Hungry Blog Alive is Awesome";
        Optional<Character> nonRepeatCharacter = str.chars().mapToObj(ch -> Character.toLowerCase(Character.valueOf((char)ch)))
                .collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new,Collectors.counting()))
                .entrySet()
                .stream()
                .filter(entry -> entry.getValue() == 1L)
                .map(entry-> entry.getKey())
                .findFirst();
        System.out.println("Exercise 7 : " + nonRepeatCharacter);

        /*8.Given a String, find the first repeated character in it using Stream functions?
         * //String input = "Java Hungry Blog Alive is Awesome";
         * output = Optional[a]
         */
        String str1 = "Java Hungry Blog Alive is Awesome";
        Optional<Character> firstRepeatedCharacter = str1.chars().mapToObj(ch -> Character.toLowerCase(Character.valueOf((char)ch)))
                .collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new,Collectors.counting()))
                .entrySet()
                .stream()
                .filter(entry -> entry.getValue() > 2L)
                .map(entry ->entry.getKey())
                .findFirst();
        System.out.println("Exercise 8 : " + firstRepeatedCharacter);

        /*9.Given a list of integers, sort all the values present in it using Stream functions?
         * //input = 10,15,8,49,25,98,98,32,15;
         * output = [8, 10, 15, 15, 25, 32, 49, 98, 98]
         */
        List<Integer> list9 = Arrays.asList(10,15,8,49,25,98,98,32,15);
        List<Integer> sortedList = list9.stream().sorted().collect(Collectors.toList());
        System.out.println("Exercise 9 : " + sortedList);

        /*10.Given a list of integers, sort all the values present in it in descending order using Stream functions?
         * //input = 10,15,8,49,25,98,98,32,15;
         * output = [98, 98, 49, 32, 25, 15, 15, 10, 8]
         */
        List<Integer> list10 = Arrays.asList(10,15,8,49,25,98,98,32,15);
        List<Integer> sortedListAsDesc = list10.stream().sorted((num1,num2)-> num2.compareTo(num1)).collect(Collectors.toList());
        System.out.println("Exercise 10 : " + sortedListAsDesc);

		/*11. Reomve the duplicate words from the string
		 * input = "I Love love tO To to code";
		//output = " I Love tO code";
		 */
        String str3 = "I Love love tO To to code";
        Set<String> set1 = new HashSet<>();
        List<String> strList = Stream.of(str3).distinct().map(strval ->strval).distinct().collect(Collectors.toList());
        System.out.println("Exercise 11 : " + strList);

    }
}

