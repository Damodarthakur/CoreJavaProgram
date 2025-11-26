package Testtc;


import java.util.*;
        import java.util.stream.Collectors;

public class CharacterCount {
    public static void main(String[] args) {
        String input = "aabbbccccdabbcccdd";

        // Group characters and count their occurrences
        Map<Character, Long> charCounts = input.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(c -> c, Collectors.counting()));

        // Create a list to store the desired output format
        List<String> outputList = new ArrayList<>();

        // Iterate over the character counts and format the output
        //charCounts.forEach((char c, Long count) -> {
           // outputList.add(c + "=" + count);
        //});

        // Print the output list
        System.out.println(outputList);
    }
}
