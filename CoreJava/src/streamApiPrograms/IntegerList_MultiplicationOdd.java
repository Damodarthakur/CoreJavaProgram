package streamApiPrograms;

import java.util.Arrays;
import java.util.List;

public class IntegerList_MultiplicationOdd {
    public static void main(String[] args) {
        List<Integer> intList = Arrays.asList(1,2,5,3,6,9);

       int oddMulti = intList.stream().filter(i-> i%2 !=0).reduce(1,(a,b)->a*b);
        System.out.println(oddMulti);


    }
}
