package CorTest;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class TestCap {
    public static void main(String[] args) {
        String str = "damodar kumar thakur kumar";
       // String str = "damodar kumar thakur kumar";

        // Split the string by spaces and convert it to a stream
        List<String> words = Arrays.asList(str.split(" "));

        // Find and collect repeated words
        //Map<String, Long> wordCount = words.stream()
        //        .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
         words.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
        .entrySet().stream().filter(e->e.getValue()>1).forEach(e->System.out.println(e.getKey()+" repeated times = "+e.getValue()));
       // wordCount.entrySet().stream()
               // .filter(entry -> entry.getValue() > 1)
               //.forEach(entry -> System.out.println(entry.getKey() + " is repeated " + entry.getValue() + " times."));

    }
}
