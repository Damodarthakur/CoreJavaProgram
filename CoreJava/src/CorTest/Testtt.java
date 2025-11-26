package CorTest;

import java.util.Arrays;
import java.util.List;

public class Testtt {
    public static void main(String[] args) {

        Integer [] arr = {2,3,5,6,3,6};

        Arrays.stream(arr).filter(num->Arrays.stream(arr).filter(n->n.equals(num)).count()==1)
                .forEach(System.out::println);

    }




}
