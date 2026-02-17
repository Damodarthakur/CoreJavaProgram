package streamApiPrograms;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class String_StartsWithSpecificChar {
    public static void main(String[] args) {
        List<String> list =
                Arrays.asList("Apple", "Ant", "Ball", "Bat", "Cat", "apricot");

        List<String> result = list.stream()
                .filter(s -> s != null && s.startsWith("A"))
                .collect(Collectors.toList());

    }
}
