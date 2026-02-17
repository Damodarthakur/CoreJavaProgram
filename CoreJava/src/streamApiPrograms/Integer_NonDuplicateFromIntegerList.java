package streamApiPrograms;

import java.util.Arrays;

public class Integer_NonDuplicateFromIntegerList {
    public static void main(String[] args) {
        Integer [] arr = {1, 2, 3, 2, 4, 5, 1, 6};
        //List<Integer> list = Arrays.asList(arr);
        Arrays.stream(arr).filter(num->Arrays.stream(arr).filter(n->n.equals(num))
                .count()==1).forEach(System.out::println);
/*
        List<Integer> nonDuplicates = list.stream()
                .collect(Collectors.groupingBy(
                        Function.identity(),
                        Collectors.counting()
                ))
                .entrySet().stream()
                .filter(e -> e.getValue() == 1)
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());

        System.out.println(nonDuplicates);

 */
    }


}
