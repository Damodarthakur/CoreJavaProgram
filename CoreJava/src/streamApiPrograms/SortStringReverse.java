package streamApiPrograms;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SortStringReverse {
    public static void main(String[] args) {


                List<String> strList = Arrays.asList("Apple", "Banana", "Cherry", "Date");

                strList.stream()
                        //.sorted(Comparator.reverseOrder())  // Sort in descending order
                        .sorted((s1,s2)->s2.compareTo(s1))
                        .forEach(System.out::println);      // Print each element



    }
}
