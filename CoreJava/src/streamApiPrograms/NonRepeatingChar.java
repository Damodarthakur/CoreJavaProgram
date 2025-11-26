package streamApiPrograms;

 
import java.util.Map;
import java.util.stream.Collectors;

public class NonRepeatingChar {
    public static void main(String[] args) {
        String str = "java";

        str.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(c -> c, Collectors.counting()))
                .entrySet()
                .stream()
                .filter(entry -> entry.getValue() == 1)
                .map(Map.Entry::getKey)
                .forEach(System.out::println);
    }
}

