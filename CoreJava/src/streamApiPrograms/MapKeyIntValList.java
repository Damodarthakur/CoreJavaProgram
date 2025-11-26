package streamApiPrograms;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapKeyIntValList {
    public static void main(String[] args) {
        // Create a sample Map<Integer, List<Integer>>
        Map<Integer, List<Integer>> map = new HashMap<>();
        map.put(1, Arrays.asList(1, 2, 3));
        map.put(2, Arrays.asList(4, 5, 6));
        map.put(3, Arrays.asList(7, 8, 9));

        // Use Stream API to iterate over the map and print key-value pairs
        map.entrySet()
                .stream()
                .forEach(entry -> {
                    int key = entry.getKey();
                    List<Integer> values = entry.getValue();
                    System.out.println("Key: " + key + " Values: " + values);
                    
                });
    }
}

