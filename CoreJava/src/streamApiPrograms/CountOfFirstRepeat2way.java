package streamApiPrograms;

import java.util.*;
import java.util.function.Function;
import java.util.stream.*;

public class CountOfFirstRepeat2way {
    public static void main(String[] args) {
        String str = "abcdb";

        Optional<Map.Entry<Character, Long>> firstRepeating =
                str.chars()
                        .mapToObj(c -> (char) c)
                        .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
                        .entrySet()
                        .stream()
                        .filter(e -> e.getValue() > 1)
                        .findFirst();

        if (firstRepeating.isPresent()) {
            System.out.println("First repeating character: " + firstRepeating.get().getKey());
            System.out.println("Count: " + firstRepeating.get().getValue());
        } else {
            System.out.println("No repeating characters");
        }
    }
}
