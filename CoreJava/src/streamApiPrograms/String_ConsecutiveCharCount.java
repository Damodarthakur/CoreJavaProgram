package streamApiPrograms;
import java.util.stream.*;

public class String_ConsecutiveCharCount {

    public static void main(String[] args) {

        String str = "abbaaccdd";
        //o/p=a1b2a2c2d2

        String result =
                IntStream.range(0, str.length())
                        .filter(i -> i == 0 || str.charAt(i) != str.charAt(i - 1))
                        .mapToObj(i -> {
                            char ch = str.charAt(i);
                            long count = IntStream.range(i, str.length())
                                    .takeWhile(j -> str.charAt(j) == ch)
                                    .count();
                            return ch + String.valueOf(count);
                        })
                        .collect(Collectors.joining());

        System.out.println(result);
    }
}
