package com.Java8Features;

import java.util.*;
import java.util.stream.Collectors;

public class FP02StreamAPI {

    public static void main(String[] args){

        //Convert a List to List (length of each string) List words = List.of("Java", "Spring", "Boot", "Microservices");
        convertListToList();
        //Filter even numbers from a list List numbers = List.of(12, 7, 9, 20, 33, 40, 55);
        filterEvenNumbersFromList();
        //Count elements greater than 50 List marks = List.of(45, 60, 30, 90, 75, 20, 100);
        countNumbersGreaterThanFifty();
        //Convert all strings to uppercase List technologies = List.of("java", "spring", "docker", "kubernetes");
        convertStringsToUpperCase();
        //Find the first element greater than 10 List values = List.of(3, 5, 8, 12, 15, 20);
        findFirstGreaterThanTen();
        // Find sum of all numbers List expenses = List.of(100, 200, 300, 400);
        sumOfAllExpensesFromList();
        //Remove duplicates from list of strings List languages = List.of("Java", "Python", "Java", "C", "Python", "Go");
        removeDuplicatesFromList();
        //Find maximum and minimum number List primeNumbers = List.of(2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 13);
        findMaxAndMinNumber();
        //Sort integers (asc & desc) List unsortedNumbers = List.of(45, 12, 89, 23, 7, 90, 34);
        sortTheListASC_DSC();
        //Skip first 2 and limit next 3 elements List sequence = List.of(10, 20, 30, 40, 50, 60, 70);
        skipAndLimit();
        // Convert List into single list List nestedList = List.of( List.of(1, 2, 3), List.of(4, 5), List.of(6, 7, 8) );
        convertListToSingleList();
        //Extract all unique words from sentences List sentences = List.of( "java is powerful", "streams are powerful", "java streams simplify code" );
        extractUniqueWords();
        //Convert List to flattened List List names = List.of("Ram", "Sam", "Tom");
        convertedListToFlatMap();
        //Check if any number divisible by 5 List checkNumbers = List.of(11, 22, 33, 40, 55);
        checkNumDivisibleBy5();
        //Check if all numbers are positive List positives = List.of(5, 10, 20, 30);
        checkAllNumbersPositivefromList();
        //Check if none of the numbers are negative List nonNegative = List.of(0, 4, 6, 9, 12);
        checkNoneNumbersNegativefromList();
        //Find any element greater than 100 List bigNumbers = List.of(10, 20, 50, 150, 200);
        findNumbersGreaterThan100();
        //Product of all numbers List multiplyNumbers = List.of(1, 2, 3, 4, 5);
        productAllNumbers();
        //Maximum number using reduce() List salaryFigures = List.of(45000, 60000, 75000, 90000);
        findMaximumSalary();
        //Concatenate list of strings List alphabets = List.of("J", "A", "V", "A");
        concatenateAlphabets();
        //Convert list of strings to Set List cities = List.of("Hyderabad", "Bangalore", "Hyderabad", "Chennai");
        covertListToSet();
        //Group numbers by even and odd List evenOddNumbers = List.of(1, 2, 3, 4, 5, 6, 7, 8);
        //groupingEvenAndOddNumbers();
        //Frequency of each character String input = "java streams";
        characterFrequency();
        //Count number of words String sentence = "Java streams simplify data processing";
        wordCount();
        //First non‑repeating character String value = "swiss";
        //Find duplicate characters String duplicateInput = "programming";
        findDuplicateCharacters();
        //Second highest number List scores = List.of(10, 20, 30, 40, 50);
        secondHighestNumber();
        //Longest string List frameworks = List.of("Spring", "Hibernate", "Microservices", "JPA");
        longestStringLength();
        //Partition prime & non‑prime List numbersForPrimeCheck = List.of(2, 3, 4, 5, 6, 7, 8, 9, 10, 11);
        //Convert stream to Map List countryCodes = List.of("IN", "US", "UK");
        convertListToMap();
        //Use peek() to debug List debugNumbers = List.of(10, 15, 20, 25, 30);
        debugWithPeek();

    }

    private static void debugWithPeek() {
        List<Integer> debugNumbers = List.of(10, 15, 20, 25, 30);
        debugNumbers.stream()
                .peek(n -> System.out.println("Original: " + n))
                .filter(n -> n % 2 == 0)
                .peek(n -> System.out.println("After filter (even): " + n))
                .map(n -> n * 2)
                .peek(n -> System.out.println("After map (*2): " + n))
                .forEach(n -> System.out.println("Final output: " + n));
    }


    private static void convertListToMap() {
        List<String> countryCodes = List.of("IN", "US", "UK");
        System.out.print("convertListToMap : " + countryCodes.stream().collect(Collectors.toMap(country -> country, String::length)));
    }

    private static void longestStringLength() {
        List<String> frameworks = List.of("Spring", "Hibernate", "Microservices", "JPA");
        String maxlength = frameworks.stream().max((s1, s2) -> Integer.compare(s1.length(), s2.length())).get();
        System.out.println("longestStringLength " + maxlength);
    }

    private static void secondHighestNumber() {
        List<Integer> scores = List.of(10, 20, 30, 40, 50);
        int secondHighest = scores.stream().distinct().sorted(Comparator.reverseOrder()).skip(1).findFirst().get();
        System.out.println("secondHighestNumber " + secondHighest);
    }

    private static void findDuplicateCharacters() {
        String duplicateInput = "programming";
        duplicateInput.chars().mapToObj(ch -> (char) ch).collect(Collectors.groupingBy(ch -> ch, Collectors.counting()))
                .entrySet().stream().filter(ch -> ch.getValue() > 1).forEach(e -> System.out.println(e.getKey()));
    }

    private static void wordCount() {
        String sentence = "Java streams simplify data processing";
        long wordCount = Arrays.stream(sentence.split(" ")).count();
        System.out.println("wordCount " + wordCount);
    }

    private static void characterFrequency() {
        String input = "java streams";
        Map<Character, Long> charList =  input.chars().filter(ch -> ch != ' ').mapToObj(ch -> (char) ch).collect(Collectors.groupingBy(ch -> ch, Collectors.counting()));
        System.out.println("characterFrequency " + charList);
    }

    /*private static void groupingEvenAndOddNumbers() {
        List evenOddNumbers = List.of(1, 2, 3, 4, 5, 6, 7, 8);
        Map<String, List<Integer>> result = evenOddNumbers.stream().collect(Collectors.groupingBy(num -> num % 2 == 0));
    }*/

    private static void covertListToSet() {
        List<String> cities = List.of("Hyderabad", "Bangalore", "Hyderabad", "Chennai");
        Set<String> convertedList = cities.stream().collect(Collectors.toSet());
        System.out.println("covertListToSet " + convertedList);
    }

    private static void concatenateAlphabets() {
        List<String> alphabets = List.of("J", "A", "V", "A");
        String str = alphabets.stream().reduce("", (a,b) -> a + b);
        System.out.println("concatenateAlphabets " + str);
    }

    private static void checkNoneNumbersNegativefromList() {
        List<Integer> nonNegative = List.of(0, 4, 6, 9, 12);
        boolean isNegativeNumbers = nonNegative.stream().noneMatch(num -> num < 0);
        System.out.println("checkNoneNumbersNegativefromList " + isNegativeNumbers);
    }

    private static void checkAllNumbersPositivefromList() {
        List<Integer> positives = List.of(5, 10, 20, 30);
        boolean allPositiveNumbers = positives.stream().allMatch(num -> num > 0);
        System.out.println("checkAllNumbersPositivefromList " + allPositiveNumbers);
    }

    private static void extractUniqueWords() {
        List<String> sentences = List.of( "java is powerful", "streams are powerful", "java streams simplify code" );
        sentences = sentences.stream().flatMap(sentence -> Arrays.stream(sentence.split(" "))).map(String::toLowerCase).distinct().toList();
        System.out.println("extractUniqueWords " + sentences);
    }

    private static void findMaximumSalary() {
        List<Integer> salaryFigures = List.of(45000, 60000, 75000, 90000);
       int maxValue = salaryFigures.stream().reduce(Integer::max).get();
        System.out.println("findMaximumSalary " + maxValue);
    }

    private static void productAllNumbers() {
        List<Integer> multiplyNumbers = List.of(1, 2, 3, 4, 5);
       int product = multiplyNumbers.stream().reduce(1, (a,b) -> a * b);
        System.out.println("productAllNumbers " + product);

    }

    private static void findNumbersGreaterThan100() {
        List<Integer> bigNumbers = List.of(10, 20, 50, 150, 200);
        int bigNumber = bigNumbers.stream().filter(num -> num > 100).findAny().get();
        System.out.println("findNumbersGreaterThan100 " + bigNumber);
    }

    private static void convertedListToFlatMap() {
        List<String> names = List.of("Ram", "Sam", "Tom");
    }

    private static void checkNumDivisibleBy5() {
        List<Integer> checkNumbers = List.of(11, 22, 33, 40, 55);
        boolean isDivideBy5 = checkNumbers.stream().anyMatch(num -> num % 5 == 0);
        System.out.println("checkNumDivisibleBy5 " + isDivideBy5);
    }

    private static void convertListToSingleList() {
        List<List<Integer>> nestedList = List.of( List.of(1, 2, 3), List.of(4, 5), List.of(6, 7, 8) );

        List<Integer> numbersList = nestedList.stream().flatMap(List::stream).toList();
        System.out.println("convertListToSingleList " + numbersList);
    }

    private static void skipAndLimit() {
        List<Integer> sequence = List.of(10, 20, 30, 40, 50, 60, 70);
        sequence = sequence.stream().skip(2).limit(3).toList();
        System.out.println("skipAndLimit" + sequence);
    }

    private static void sortTheListASC_DSC() {
        List<Integer> unsortedNumbers = List.of(45, 12, 89, 23, 7, 90, 34);
        unsortedNumbers = unsortedNumbers.stream().sorted().toList();
        System.out.println("sortTheList in ASC" + unsortedNumbers);
        unsortedNumbers = unsortedNumbers.stream().sorted(Comparator.reverseOrder()).toList();
        System.out.println("sortTheList in DSC" + unsortedNumbers);
    }

    private static void findMaxAndMinNumber() {
        List<Integer> primeNumbers = List.of(2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 13);
        //Type 1
        int minNum = primeNumbers.stream().sorted().findFirst().get();
        System.out.println("findMaxAndMinNumber : min : " + minNum);
        //Type 2
        int minNumber = primeNumbers.stream().min(Integer::compareTo).get();
        System.out.println("findMaxAndMinNumber : min : " + minNumber);
        //Type 3
        int maxNumber = primeNumbers.stream().max(Integer::compareTo).get();
        System.out.println("findMaxAndMinNumber : max : " + maxNumber);
    }

    private static void removeDuplicatesFromList() {
        List<String> languages = List.of("Java", "Python", "Java", "C", "Python", "Go");
        languages = languages.stream().distinct().toList();
        System.out.println("removeDuplicatesFromList : " + languages);
    }

    private static void sumOfAllExpensesFromList() {
        List<Integer> expenses = List.of(100, 200, 300, 400);
        int ExpensesSum = expenses.stream().mapToInt(Integer::intValue).sum();
        System.out.println("sumOfAllExpensesFromList : " + ExpensesSum);
    }

    private static void findFirstGreaterThanTen() {
        List<Integer> values = List.of(3, 5, 8, 12, 15, 20);
        Optional<Integer> number = values.stream().filter(num -> num > 10).findFirst();
        System.out.println("findFirstGreaterThanTen : " + number.get());
    }

    private static void convertStringsToUpperCase() {
        List<String> technologies = List.of("java", "spring", "docker", "kubernetes");
        technologies = technologies.stream().map(String::toUpperCase).toList();
        System.out.println("convertStringsToUpperCase : " + technologies);
    }

    private static void countNumbersGreaterThanFifty() {
        List<Integer> marks = List.of(45, 60, 30, 90, 75, 20, 100);
        long count = marks.stream().filter(num -> num > 50).count();
        System.out.println("countNumbersGreaterThanFifty : " + count);
    }

    private static void filterEvenNumbersFromList(){
        List<Integer> numbers = List.of(12, 7, 9, 20, 33, 40, 55);
        numbers = numbers.stream().filter(num -> num % 2 == 0).toList();
        System.out.println("Even Numbers : " + numbers);
    }

    private static void convertListToList(){
        List<String> words = List.of("Java", "Spring", "Boot", "Microservices");
        List<Integer> wordLength;
        //Type 1
        wordLength = words.stream().map(w -> w.length()).collect(Collectors.toList());
        System.out.println("Type1 : Converted a List of String to List of Integers" + wordLength);
        //Type 2
        wordLength = words.stream().map(String::length).collect(Collectors.toList());
        System.out.println("Type2 :Converted a List of String to List of Integers" + wordLength);
    }
}
