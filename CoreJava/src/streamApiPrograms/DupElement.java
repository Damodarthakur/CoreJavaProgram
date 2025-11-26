package streamApiPrograms;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.HashSet;
import java.util.stream.Collectors;


public class DupElement {

    public static void main(String[] args) {

        // 3, 4, 9
        List<Integer> intList = Arrays.asList(5, 3, 4, 1, 3, 7, 2, 9, 9, 4);

        Set<Integer> result = findDuplicateBySetAdd(intList);

        result.forEach(System.out::println);  // x->system.out.println(x)

    }

    public static <T> Set<T> findDuplicateBySetAdd(List<T> intList) {

        Set<T> items = new HashSet<>();
        return intList.stream()
                .filter(n -> !items.add(n)) // Set.add() returns false if the element was already in the set.
                .collect(Collectors.toSet());

    }

}
