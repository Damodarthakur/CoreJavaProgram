package streamApiPrograms;

import java.util.Arrays;

public class NonDuplicateElements {
    public static void main(String[] args) {
        Integer [] arr = {1,2,3,5,9,5,2,5};
        Arrays.stream(arr).filter(num->Arrays.stream(arr).filter(n->n.equals(num)).count()==1).forEach(System.out::println);
    }
}
