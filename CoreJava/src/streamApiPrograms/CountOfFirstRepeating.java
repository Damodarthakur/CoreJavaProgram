package streamApiPrograms;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CountOfFirstRepeating {
    public static void main(String[] args) {
        String str = "abcdb";

      Map<Character,Long> charMap  = str.chars().mapToObj(c-> (char)c)
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new,Collectors.counting()));
        Character firstRepeatChar =         charMap.entrySet().stream().filter(e->e.getValue()>1)
                .map(Map.Entry::getKey).findFirst().orElse(null);
        System.out.println(firstRepeatChar);

    }
}
