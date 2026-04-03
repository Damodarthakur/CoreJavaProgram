package streamApiPrograms;
import java.util.*;
import java.util.stream.Collectors;

public class String_vowelCounter {
    public static void main(String[] args) {
        String str = "jklaabeeeci";
        String vowels = "aeiouAEIOU";

        String result = str.chars() // Convert to IntStream
                .mapToObj(c -> (char) c) // Convert to Stream<Character>
                .map(c -> {
                    // If it's a vowel, find its count in the original string
                    if (vowels.indexOf(c) != -1) {
                        long count = str.chars().filter(ch -> ch == c).count();
                        return String.valueOf(count);
                    }
                    // If it's a consonant, keep it as is
                    return String.valueOf(c);
                })
                .collect(Collectors.joining()); // Join back into a single string

        System.out.println("Output: " + result);
    }
}
/*
vowels: This is the String "aeiouAEIOU".

.indexOf(c): This method searches through the vowels string to find the first position (index) of the character c.

If it finds the character, it returns its position (0, 1, 2, etc.).

If it does not find the character, it returns -1.

!= -1: This is a boolean check. It basically asks: "Did the search return something other than -1?

Character (c),vowels.indexOf(c),Result of != -1,Meaning
'a',0,true,It is a vowel!
'e',1,true,It is a vowel!
'j',-1,false,It is NOT a vowel.
'k',-1,false,It is NOT a vowel.
 */