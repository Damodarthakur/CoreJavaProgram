package streamApiPrograms;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;



public class OccurrenceOfEachCharNmaxChar {
    public static void main(String[] args) {
        List<String> stringList = Arrays.asList("abc","Kiran","madhav","sachin");
        Map<Character,Long> charOccur = stringList.stream().flatMap(s-> s.chars().mapToObj(c->(char)c))
                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        charOccur.forEach((k,v)->System.out.println(k+":"+v));

        Character maxOccur = charOccur.entrySet().stream().max(Comparator.comparing(Map.Entry::getValue)).get().getKey();

        System.out.println("Character with max occurrence: " + maxOccur);

    }
}
