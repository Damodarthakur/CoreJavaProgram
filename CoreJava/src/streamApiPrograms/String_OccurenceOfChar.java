package streamApiPrograms;


import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class String_OccurenceOfChar {
    public static void main(String[] args) {
        String str = "notepad";
        
        Map<Character, Long> characterCountMap = str.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(characterCountMap);
        
        characterCountMap.forEach((K, V) -> System.out.println(K + " - " + V));
        /*In the above code, we first convert the string to an IntStream using the chars() method.
        Then we map each integer value to its corresponding character using mapToObj().
        We collect the characters into a Map<Character, Long> using Collectors.groupingBy() and Collectors.counting() as the downstream collector.*/
        
    }
}

