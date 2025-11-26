package streamApiPrograms;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.LinkedHashMap;

public class FirstNonRepeatCharEachString {
    public static void main(String[] args) {
        //input : {"array","puppet"}
        // output : y, u
        //find non first non repeating character from each string using java 8
        String[] input = {"array", "puppet"};
        for (String inputs : input) {
            Map<Character, Long> charCout = inputs.chars().mapToObj(c -> (char) c).collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new, Collectors.counting()));
            Character firstNonRepeatingChar = charCout.entrySet().stream().filter(e -> e.getValue() == 1)
                    .map(Map.Entry::getKey).findFirst().orElse(null);
            System.out.println(firstNonRepeatingChar);
        }
    }
}
