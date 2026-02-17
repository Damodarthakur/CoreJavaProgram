package streamApiPrograms;

import java.util.*;
import java.util.stream.Collectors;

public class String_GroupByKeyLengthValueByWord {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("Java","Spring","Boot","Stream","APIG");

       // o/p- {4=[Java, Boot, APIG], 6=[Spring, Stream]}
        
        Map<Integer, List<String>> wordCount2 = words.stream()
                .collect(Collectors.groupingBy(String::length));
        System.out.println(wordCount2);

    }
}
