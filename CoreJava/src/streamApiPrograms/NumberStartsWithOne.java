package streamApiPrograms;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class NumberStartsWithOne {
    public static void main(String[] args) {
        List<Integer> inList = Arrays.asList(7,10,25,8,19,25,42);


        List<Integer> result = inList.stream()
                .map(String::valueOf)              // Convert each Integer to String
                .filter(s -> s.startsWith("1"))    // Keep only numbers starting with '1'
                .map(Integer::valueOf)             // Convert back to Integer
                .collect(Collectors.toList());
        System.out.println(result);

    }
}
