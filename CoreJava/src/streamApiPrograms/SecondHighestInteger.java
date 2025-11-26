package streamApiPrograms;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SecondHighestInteger {
    public static void main(String[] args) {
        List<Integer> intList = Arrays.asList(10, 20, 30, 40, 50);
        Integer secondHighest = intList.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst().orElse(null);
        System.out.println(secondHighest);

    }
}
