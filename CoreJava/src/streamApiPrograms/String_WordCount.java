package streamApiPrograms;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class String_WordCount {
    public static void main(String[] args) {
        String s = "largeSoftwareBook";
        List<String> words = Arrays.stream(s.split("(?=[A-Z])")).collect(Collectors.toList());
        long wordCount = words.size();
        System.out.println("count "+ wordCount + " words" + words);
    }
}
