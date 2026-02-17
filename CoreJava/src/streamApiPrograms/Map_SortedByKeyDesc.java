package streamApiPrograms;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.LinkedHashMap;

public class Map_SortedByKeyDesc {
    public static void main(String[] args) {

        Map<String,Double> hashmap = new HashMap<String,Double>();
        hashmap.put("U1",100.00);
        hashmap.put("U33",300.00);
        hashmap.put("U2",200.00);
        Map<String, Double> sortedByKeyDesc = hashmap.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByKey(Comparator.reverseOrder()))
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (oldVal, newVal) -> oldVal,
                        LinkedHashMap::new
                ));

        System.out.println(sortedByKeyDesc);


    }
}
