package streamApiPrograms;


import java.util.*;

public class String_ConcateStringUsingReduce {
    public static void main(String[] args) {

        List<String> words = Arrays.asList("Java", "8", "Stream", "Reduce");

        String result = words.stream()
                .reduce("", (a, b) -> a + " " + b);

        System.out.println(result.trim());
    }
}
