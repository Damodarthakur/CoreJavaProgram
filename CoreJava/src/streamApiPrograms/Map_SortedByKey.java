package streamApiPrograms;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.LinkedHashMap;


public class Map_SortedByKey {
    public static void main(String[] args) {
        Map<String,Double> hmap = new HashMap<String,Double>();
                    hmap.put("U1",100.00);
                    hmap.put("U33",300.00);
                    hmap.put("U2",200.00);

        Map<String, Double> sortedByKey = hmap.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByKey())
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (oldVal, newVal) -> oldVal,
                        LinkedHashMap::new
                ));

        System.out.println(sortedByKey);

        /*
        Map.Entry.comparingByKey()
 tells Java to compare entries using the key

So this line means:

“Sort all map entries in ascending order of keys.”
Example order after sorting:

U1 → U2 → U33

.collect(Collectors.toMap(
After sorting, we need to convert the stream back to a Map

collect() is a terminal operation

Collectors.toMap() builds a map from stream elements

(oldVal, newVal) -> oldVal,
This is a merge function

It is required because:

If two keys are the same, Java must know which value to keep

Meaning:

“If duplicate keys occur, keep the existing (old) value.”

    In your case, keys are unique, but Java still requires this argument to avoid
         */

    }
}
