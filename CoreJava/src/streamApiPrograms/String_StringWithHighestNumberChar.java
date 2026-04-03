package streamApiPrograms;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class String_StringWithHighestNumberChar {
    public static void main(String[] args) {
        List<String> strList = Arrays.asList("Sachin","ram","Satyam");
        String highestChar = strList.stream()
                            .max(Comparator.comparing(String::length)).orElse(null);
        System.out.println(highestChar);
    }
}
