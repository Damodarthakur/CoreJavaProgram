package streamApiPrograms;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
//----------------------------### Count of first Repeating Char------------------------
public class String_CountOfFirstRepeating {
    public static void main(String[] args) {

        //***********--Recommended this approach--2nd approach is also good------------------->

        String str = "abcecdb";

      Map<Character,Long> charMap  = str.chars().mapToObj(c-> (char)c)
                .collect(Collectors.groupingBy(
                        Function.identity(),
                        LinkedHashMap::new,
                        Collectors.counting()));

        Map.Entry<Character, Long> firstRepeatEntry =
                charMap.entrySet()
                        .stream()
                        .filter(e -> e.getValue() > 1)
                        .findFirst()
                        .orElse(null);

        if (firstRepeatEntry != null) {
            System.out.println("First Repeating Character = " + firstRepeatEntry.getKey()+" Count = " + firstRepeatEntry.getValue());

        } else {
            System.out.println("No repeating character found");
        }
        /*
        Optional<Map.Entry<Character, Long>> firstRepeating =
                charCountMap.entrySet()
                        .stream()
                        .filter(e -> e.getValue() > 1)
                        .findFirst();

        firstRepeating.ifPresent(e ->
                System.out.println("First Repeating Character: " + e.getKey()
                        + ", Count: " + e.getValue()));
         */

    }
}
