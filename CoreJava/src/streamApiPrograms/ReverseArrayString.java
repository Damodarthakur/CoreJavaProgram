package streamApiPrograms;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ReverseArrayString {
    public static void main(String[] args) {
        String[] arr = {"dam","ravi","syam","sachin"};

        List<String> reverseString = IntStream.range(0,arr.length).mapToObj(i->arr[arr.length-1-i])
                .collect(Collectors.toList());
        System.out.println(reverseString);

    }


}
