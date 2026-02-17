package streamApiPrograms;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class StringList_StreamSortingExample {
    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>();
        stringList.add("Apple");
        stringList.add("Orange");
        stringList.add("Banana");
        stringList.add("Mango");

        // Sorting the list using Stream API and lambda expression
        List<String> sortedList = stringList.stream()
                .sorted(Comparator.comparing(String::toLowerCase))
                .toList();

        // Printing the sorted list
        sortedList.forEach(System.out::println);
    }
}

