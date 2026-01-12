package com.Java8Features;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class FP03StreamAPIOnStrings {

   /* STRING & CHARACTER STREAM INTERVIEW QUESTIONS
    🟢 Basic Level
    1. Find duplicate characters in a string using streams Input: String str = "programming";
    2. Find unique characters in a string using streams Input: String str = "programming";
    3. Count the frequency of each character in a string using streams Input: String str = "programming";
    4. Find the first non-repeated character using streams Input: String str = "swiss";
    5. Find the first repeated character using streams Input: String str = "programming";
    6. Convert a String to a List of Characters using streams Input: String str = "JavaStream";
    7. Count the number of vowels in a string using streams Input: String str = "interviewquestions";
    8. Remove duplicate characters from a string using streams Input: String str = "programming";
    9. Convert a string to uppercase/lowercase using streams Input: String str = "JavaStreams";
    10. Check if a string is empty or blank using streams Input: String str = "   ";

    🟡 Intermediate Level
    11. Find the longest word in a sentence using streams Input: String sentence = "Java streams are very powerful";
    12. Find the shortest word in a sentence using streams Input: String sentence = "Java streams are very powerful";
    13. Count occurrences of each word in a string using streams Input: String sentence = "java is easy and java is powerful";
    14. Find words starting with a specific character using streams Input: String sentence = "spring springboot streams security";
        Character: 's'
    15. Find palindrome strings from a list using stream Input: List<String> list = List.of("madam", "java", "level", "stream");
    16. Sort characters in a string alphabetically using streams Input: String str = "streams";
    17. Sort strings by length using streams Input: List<String> list = List.of("Spring", "Hibernate", "JPA", "Microservices");
    18. Find the second most frequent character using streams Input: String str = "programming";
    19. Check if two strings are anagrams using streams Input: String str1 = "listen";
        String str2 = "silent";
    20. Reverse a string using stream Input: String str = "JavaStreams";

    🔵 Advanced Level
    21. Find the top 2 most frequent characters using stream Input: String str = "programming";
    22. Find the character with maximum frequency using streams Input: String str = "programming";
    23. Find all strings containing only digits using streams Input: List<String> list = List.of("123", "abc", "456", "7a8");
    24. Partition characters into vowels and consonants using streams Input: String str = "streamapi";
    25. Find the first character whose frequency > 1 using streams Input: String str = "swiss";
    26. Group characters based on uppercase and lowercase using streams Input: String str = "JavaStreaM";
    27. Remove special characters from a string using streams Input: String str = "Ja@va#Str$eam%123";
    28. Convert a string into a Map<Character, Long> using streams Input: String str = "programming";
    29. Count characters ignoring spaces using streams Input: String str = "java stream api";
    30. Check if all characters in a string are unique using streams Input: String str = "abcdefa";

    🔴 Tricky / Real Interview Questions
    31. Explain difference between chars() and codePoints() with example Input: String str = "Java\uD83D\uDE00";
    32. Why do we need mapToObj(c -> (char) c) when using streams on String? Input: String str = "streams";
    33. Can peek() modify a String stream? Explain Input: String str = "debug";
    34. What happens when you call stream operations on an empty string? Input: String str = "";
    35. How to handle null strings safely using streams? Input: String str = null;
    36. Why is Collectors.groupingBy() preferred over manual loops? Input: String str = "groupingexample";
    37. What is the time complexity of stream-based character counting?Input: String str = "performance";
    38. When would streams be slower than loops for string processing?Input: String str = "largeinputstring";
    39. Difference between findFirst() and findAny() in string streams Input: String str = "parallelstream";
    40. How does short-circuiting work in string streams? Input: String str = "shortcircuit";

    ⭐ Bonus Practice (Very Popular)
    41. Count vowels and consonants using streams Input: String str = "javastreams";
    42. Remove duplicate words from a sentence using streams Input: String sentence = "java java stream stream api";
    43. Find words with length > 5 using streams Input: String sentence = "microservices architecture springboot";
    44. Find common characters between two strings using streams Input: String str1 = "programming";String str2 = "gaming";
    45. Convert string to character frequency sorted by count using streams Input: String str = "programming";
    */


    public static void main(String[] args){

        // Find duplicate characters in a string using streams Input: String str = "programming";
        findDuplicatesCharacters();
        //Find unique characters in a string using streams Input: String str = "programming";
        findUniqueCharacters();
        //Count the frequency of each character in a string using streams Input: String str = "programming";
        countCharacterFrequency();
        //Find the first repeated character using streams Input: String str = "programming";
        findFirstRepeatedCharacter();
        //Find the first non-repeated character using streams Input: String str = "swiss";
        findNonRepeatedCharacter();
        //Convert a String to a List of Characters using streams Input: String str = "JavaStream";
        convertCharacterList();
        //Count the number of vowels in a string using streams Input: String str = "interviewquestions";
        countTheVowels();
        //Remove duplicate characters from a string using streams Input: String str = "programming";
        removeDuplicateCharacters();
        //Convert a string to uppercase/lowercase using streams Input: String str = "JavaStreams";
        convertUpperCaseOrLowerCase();
        //Find the longest word in a sentence using streams Input: String sentence = "Java streams are very powerful";
        findLongestWord();
        //Find the shortest word in a sentence using streams Input: String sentence = "Java streams are very powerful";
        findShortestWord();
        //Count occurrences of each word in a string using streams Input: String sentence = "java is easy and java is powerful";
        countWordsOccurrences();
        //Find words starting with a specific character using streams Input: String sentence = "spring springboot streams security";
        //        Character: 's'
        findWordStartingWithSpecificCharacter();
        //Find palindrome strings from a list using stream Input: List<String> list = List.of("madam", "java", "level", "stream");
        findPallindromeWords();
        //Sort characters in a string alphabetically using streams Input: String str = "streams";
        sortedCharacters();
        //Sort strings by length using streams Input: List<String> list = List.of("Spring", "Hibernate", "JPA", "Microservices");
        sortTheListBasedOnLength();
        //Find the second most frequent character using streams Input: String str = "programming";
        findSecondMostCharacter();
        //Check if two strings are anagrams using streams Input: String str1 = "listen"; String str2 = "silent";
        checkStringsAreAnagrams();
        //Reverse a string using stream Input: String str = "JavaStreams";
        reverseString();

    }

    private static void reverseString() {
        String str = "JavaStreams";
        String reverseString = str.chars().mapToObj(c -> (char) c).reduce("",(a,b) -> b+a, String::concat);
        System.out.println("reverseString  : " + reverseString);
    }

    private static void checkStringsAreAnagrams() {
        String str1 = "listen";
        String str2 = "silent";
        boolean isAnagrams = str1.chars().mapToObj(ch -> (char) ch).collect(Collectors.groupingBy(ch -> ch, Collectors.counting()))
                .equals(str2.chars().mapToObj(ch -> (char) ch).collect(Collectors.groupingBy(ch -> ch, Collectors.counting())));
        System.out.println("checkStringsAreAnagrams  : " + isAnagrams);

    }

    private static void findSecondMostCharacter() {
        String str = "programming";
        List<Character> secondCharacter = str.chars().mapToObj(ch -> (char) ch).skip(1).limit(1).toList();
        System.out.println("findSecondMostCharacter  : " + secondCharacter);
    }

    private static void sortTheListBasedOnLength() {
        List<String> list = List.of("Spring", "Hibernate", "JPA", "Microservices");
        List<String> sortedList = list.stream().sorted(Comparator.comparingInt(String::length)).toList();
        System.out.println("sortedCharacters  : " + sortedList);
    }

    private static void sortedCharacters() {
        String str = "streams";
        List<Character> sortedChars = str.chars().mapToObj(ch -> (char) ch).sorted().toList();
        System.out.println("sortedCharacters  : " + sortedChars);
    }

    private static void findPallindromeWords() {
        List<String> list = List.of("madam", "java", "level", "stream");
        List<String> aplindromeList = list.stream().filter(str -> str.equals(new StringBuilder(str).reverse().toString())).toList();
        System.out.println("findPallindromeWords  : " + aplindromeList);
    }

    private static void findWordStartingWithSpecificCharacter() {
        String sentence = "spring springboot streams security violation";
        List<String> list = Arrays.stream(sentence.split(" ")).filter(str -> str.startsWith("s")).toList();
        System.out.println("findWordStartingWithSpecificCharacter  : " + list);
    }

    private static void countWordsOccurrences() {
        String sentence = "java is easy and java is powerful";
        Map<String, Long> list = Arrays.stream(sentence.split(" ")).collect(Collectors.groupingBy(str -> str, Collectors.counting()));
        System.out.println("countWordsOccurrences  : " + list);
    }

    private static void findShortestWord() {
        String sentence = "Java streams are very powerful";
        String shortestWord = Arrays.stream(sentence.split(" ")).min(Comparator.comparingInt(String::length)).get();
        System.out.println("findShortestWord : " + shortestWord);
    }

    private static void findLongestWord() {
        String sentence = "Java streams are very powerful";
        String longestWord = Arrays.stream(sentence.split(" ")).max(Comparator.comparingInt(String::length)).get();
        System.out.println("findLongestWord : " + longestWord);
    }

    private static void convertUpperCaseOrLowerCase() {
        String str = "JavaStreams";
        String result = str.chars().mapToObj(ch -> (char) ch)
                .map(String::valueOf).collect(Collectors.joining());
        System.out.println("convertUpperCaseOrLowerCase : " + result.toLowerCase());
        System.out.println("convertUpperCaseOrLowerCase : " + result.toUpperCase());

    }

    private static void removeDuplicateCharacters() {
        String str = "programming";
        String uniqueList = str.chars().mapToObj(ch -> (char) ch).distinct().map(String::valueOf)
                .collect(Collectors.joining());
        System.out.println("removeDuplicateCharacters : " + uniqueList);
    }

    private static void countTheVowels() {
        String str = "interviewquestions";
        long vowelsCount = str.toLowerCase().chars().filter(c -> "aeiou".indexOf(c) != -1).count();
        System.out.println("countTheVowels  : " + vowelsCount);
    }

    private static void convertCharacterList() {
        String str = "JavaStream";
        System.out.println("convertCharacterList   : " + str.chars().mapToObj(ch -> (char) ch).toList());
    }

    private static void findNonRepeatedCharacter() {
        String str = "swiss";
        List<Map.Entry<Character, Long>> nonRepeatedCharacter = str.chars().mapToObj(ch -> (char) ch)
                .collect(Collectors.groupingBy(ch -> ch, Collectors.counting()))
                .entrySet().stream().filter(e -> e.getValue() == 1).toList();
        System.out.println("findNonRepeatedCharacter : " + nonRepeatedCharacter);
    }

    private static void findFirstRepeatedCharacter() {
        String str = "programming";
        List<Map.Entry<Character, Long>> repeatedChars = str.chars().mapToObj(ch -> (char) ch)
                .collect(Collectors.groupingBy(ch -> ch, Collectors.counting()))
                .entrySet().stream().filter(e -> e.getValue() > 1).limit(2).toList();
        System.out.println("findFirstRepeatedCharacter : " + repeatedChars);
    }

    private static void countCharacterFrequency() {
        String str = "programming";
        List<Map.Entry<Character, Long>> characterFrequency = str.chars().mapToObj(ch -> (char) ch)
                .collect(Collectors.groupingBy(ch -> ch, Collectors.counting())).entrySet().stream().toList();
        System.out.println("countCharacterFrequency  :"  + characterFrequency);
    }

    private static void findUniqueCharacters() {
        String str = "programming";
        List<Character> characterList = str.chars().mapToObj(ch -> (char) ch).distinct().toList();
        System.out.println("findUniqueCharacters : " + characterList);
    }

    private static void findDuplicatesCharacters() {
        String str = "programming";
        List<Map.Entry<Character, Long>> duplicateCharacters = str.chars().mapToObj(ch -> (char) ch)
                .collect(Collectors.groupingBy(ch -> ch, Collectors.counting()))
                .entrySet().stream().filter(e -> e.getValue() > 1).toList();
        System.out.println("findDuplicatesCharacters  : " + duplicateCharacters);
    }
}
