package streamApiPrograms;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class String_WithSortestChar {
    public static void main(String[] args) {

        List<String> strlist =
                Arrays.asList("Java", "Spring", "Boot", "API", "Microservices");

        String shortest = strlist.stream()
                .filter(s -> s != null && !s.isEmpty())
                .min(Comparator.comparingInt(String::length))
                .orElse("No shortest string");

    }
}
