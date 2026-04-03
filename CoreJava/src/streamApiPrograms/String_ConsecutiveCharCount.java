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
/*
IntStream.range(0, str.length())
i represents the index of the string.

String str = "abbaaccdd";

Index : 0 1 2 3 4 5 6 7 8
Char  : a b b a a c c d d

.filter(i -> i == 0 || str.charAt(i) != str.charAt(i - 1))
Condition Breakdown
✅ i == 0

Always include first character.

Because:

At index 0, there is no previous character.

So we must include it.

✅ str.charAt(i) != str.charAt(i - 1)

This checks:

👉 "Is current character different from previous character?"

If YES → include it
If NO → skip it
 */
