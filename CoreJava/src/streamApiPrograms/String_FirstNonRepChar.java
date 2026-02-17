package streamApiPrograms;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.LinkedHashMap;

public class String_FirstNonRepChar {
    public static void main(String[] args) {
        String str = "damodarjavakthakur";
       Map<Character,Long>  charCount= str.chars().mapToObj(c->(char)c)
                            .collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new,Collectors.counting()));
       Character nonRep = charCount.entrySet().stream()
                            .filter(e->e.getValue()==1).map(Map.Entry::getKey).findFirst().orElse(null);
        System.out.println(nonRep);
    }
}
