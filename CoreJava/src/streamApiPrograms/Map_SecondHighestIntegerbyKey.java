package streamApiPrograms;

import java.util.*;

public class Map_SecondHighestIntegerbyKey {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(10, "A");
        map.put(5, "B");
        map.put(20, "C");
        map.put(15, "D");

        Integer secondHighest = map.keySet().stream().sorted(Comparator.reverseOrder())
                                .skip(1).findFirst().orElse(null);
        System.out.println(secondHighest);

    }
}
