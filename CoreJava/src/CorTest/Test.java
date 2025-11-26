package CorTest;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Test {
    // Method to find the first non-repeating character in a string
    public static Character findFirstNonRepeatingCharacter(String input) {
        // Create a LinkedHashMap to maintain the order of insertion
        Map<Character, Long> characterCountMap = input.chars()
                .mapToObj(c -> (char) c)  // Convert intStream to charStream
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        // Return the first character that has a count of 1
        return characterCountMap.entrySet().stream()
                .filter(entry -> entry.getValue() == 1) // Filter for non-repeating characters
                .map(Map.Entry::getKey)  // Get the key (character)
                .findFirst()  // Get the first one
                .orElse(null);  // Return null if no non-repeating character is found
    }
    public static void main(String[] args) {
        //input : {"array","puppet"}
        List<String> strList = Arrays.asList("array","puppet");
       //Map<Character,Long> countMap = strList.clear().mapToObj(c->(char)c).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
                //.entrySet().stream().filter(e->e.getValue()==1).map(Map.Entry::getKey).findFirst();

        // Find and print the first non-repeating character from each string
        for (String input : strList) {
            Character result = findFirstNonRepeatingCharacter(input);
            if (result != null) {
                System.out.println("First non-repeating character in \"" + input + "\": " + result);
            } else {
                System.out.println("No non-repeating character found in \"" + input + "\"");
            }
        }


    }
}
