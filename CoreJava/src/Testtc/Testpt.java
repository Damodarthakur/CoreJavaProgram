package Testtc;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Testpt {
    public static void main(String[] args) {
//        List<Integer> intList = Arrays.asList(2,4,5,7);
//
//        Integer countOfSum = intList.stream().mapToInt(Integer::intValue).sum();
//        System.out.println(countOfSum);
        String str = "abcdb";
        Long countOfFirstRepeating = str.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
                .entrySet().stream().filter(e -> e.getValue() > 1).map(Map.Entry::getValue).findFirst().orElse(null);
        System.out.println(countOfFirstRepeating);

    }
    }


