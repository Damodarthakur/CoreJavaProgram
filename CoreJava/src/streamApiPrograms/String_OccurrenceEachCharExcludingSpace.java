package streamApiPrograms;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class String_OccurrenceEachCharExcludingSpace {
    public static void main(String[] args) {
        String str = "Hello world";

        Map<Character, Long> charCount = str.chars()
                .mapToObj(c -> (char) c)
                .filter(ch -> ch != ' ')           // exclude space
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        System.out.println(charCount);
    }
}
