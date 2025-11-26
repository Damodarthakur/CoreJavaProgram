package streamApiPrograms;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FirstNonRepChar {
    public static void main(String[] args) {
        String str = "damodar";
       Map<Character,Long>  charCount= str.chars().mapToObj(c->(char)c).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
       Character nonRep = charCount.entrySet().stream().filter(e->e.getValue()>1).map(Map.Entry::getKey).findFirst().orElse(null);
        System.out.println(nonRep);
    }
}
