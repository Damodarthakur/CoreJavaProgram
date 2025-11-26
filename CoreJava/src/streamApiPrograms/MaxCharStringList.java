package streamApiPrograms;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MaxCharStringList {
    public static void main(String[] args) {
        List<String> strList = Arrays.asList("abc", "kiran","madhuuu","ddd");

        String longest = strList.stream().max(Comparator.comparing(String::length)).orElse(null);

        System.out.println(longest);



    }
}
