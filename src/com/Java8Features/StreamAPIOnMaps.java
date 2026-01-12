package org.kumar;



public class StreamAPIOnMaps {

  /*
  🟢 BASIC LEVEL (Maps + Streams)
    1. Count the frequency of each word using Streams List<String> words = List.of("java", "spring", "java", "boot", "spring");
    2. Count the frequency of each character using Streams String str = "interview";
    3. Convert a list of strings into a Map<String, Integer> (string → length) <String> words = List.of("Java", "Streams", "API");
    4. Convert a list of integers into a Map<Integer, Integer> (number → square) List<Integer> numbers = List.of(2, 3, 4, 5);
    5. Group strings by their length using Streams List<String> words = List.of("Spring", "Boot", "Cloud", "Microservices");

    🟡 INTERMEDIATE LEVEL
    1. Group numbers by even and odd using Streams List<Integer> numbers = List.of(10, 15, 20, 25, 30);
    2. Count how many numbers fall into each group (even / odd) List<Integer> numbers = List.of(3, 6, 9, 12, 15, 18);
    3. Create a Map<Character, Long> from a string using Streams String str = "programming";
    4. Find duplicate characters using Streams and store them in a Map String str = "banana";
    5. Sort a Map by value using Streams Map<String, Integer> scores = Map.of("A", 85, "B", 92, "C", 78);

    🔵 ADVANCED LEVEL
    1. Find the character with maximum frequency using Streams String str = "success";
    2. Find the second most frequent character using Streams String str = "programming";
    3. Convert a list into a Map with custom key logic using Streams List<String> words = List.of("apple", "banana", "avocado", "berry");
    4. Partition strings into palindrome and non-palindrome using Streams List<String> words = List.of("madam", "java", "level", "code");
    5. Group employees by department using Streams
        class Employee {
            int id;
            String name;
            String department;
        }

    🔴 TRICKY / REAL INTERVIEW QUESTIONS
    1. Count word frequency and preserve insertion order using Streams String sentence = "java spring java boot spring";
    2. Find the first non-repeated character using Streams String str = "swiss";
    3. Convert Map<K, V> into Map<V, K> using Streams Map<Integer, String> data = Map.of(1, "A", 2, "B", 3, "C");
    4. Merge two maps using Streams Map<String, Integer> map1 = Map.of("A", 10, "B", 20) Map<String, Integer> map2 = Map.of("B", 30, "C", 40);
    5. Sort a Map by key in descending order using Streams Map<Integer, String> data = Map.of(3, "C", 1, "A", 2, "B");

    ⭐ VERY COMMON INTERVIEW SCENARIOS
    1. Count occurrences of each word ignoring case using Streams String sentence = "Java java SPRING spring Boot";
    2. Group strings by first character using Streams List<String> words = List.of("apple", "ant", "ball", "bat", "cat");
    3. Create a Map from a list where duplicate keys exist using Streams List<String> words = List.of("A", "B", "A", "C");
    4. Convert a Map to a List of custom objects using Streams Map<String, Integer> data = Map.of("X", 100, "Y", 200);
    5. Filter a Map to keep only entries with value > 50 using Streams Map<String, Integer> scores = Map.of("Math", 40, "Science", 75, "English", 60);*/

}
