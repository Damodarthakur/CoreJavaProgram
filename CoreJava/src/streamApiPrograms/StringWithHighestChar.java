package streamApiPrograms;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class StringWithHighestChar {
    public static void main(String[] args) {
        List<String> stringList = Arrays.asList("Sachin","Yuvi","Mahi","Rohit","Virat");

        String LongestCharStr = stringList.stream().max(Comparator.comparing(String::length))
                                .orElse(null);
        System.out.println("LongestCharStr :"+ LongestCharStr);
        //How many char in each list
        stringList.forEach(s -> System.out.println(s +":"+s.length()));
    }
}
