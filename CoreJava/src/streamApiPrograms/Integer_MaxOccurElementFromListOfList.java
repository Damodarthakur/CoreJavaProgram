package streamApiPrograms;


import java.util.*;
import java.util.stream.*;

public class Integer_MaxOccurElementFromListOfList {
    public static void main(String[] args) {

        List<List<Integer>> list = Arrays.asList(
                Arrays.asList(1,2,3),
                Arrays.asList(1),
                Arrays.asList(3,2,1)
        );

        Integer result = list.stream()
                .flatMap(Collection::stream)
                .collect(Collectors.groupingBy(e -> e, Collectors.counting()))
                .entrySet()
                .stream()
                .max(Map.Entry.comparingByValue())
                .get()
                .getKey();

        System.out.println("Highest occurring element: " + result);
    }
}
