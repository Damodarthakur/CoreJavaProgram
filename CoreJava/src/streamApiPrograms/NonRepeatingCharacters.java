package streamApiPrograms;

import java.util.stream.Collectors;

public class NonRepeatingCharacters {
    public static void main(String[] args) {
        String str = "ramayanan";

        String result = str.chars()
                .mapToObj(c -> (char) c)
                .filter(ch -> str.indexOf(ch) == str.lastIndexOf(ch))
                .map(Object::toString)
                .collect(Collectors.joining());

        System.out.println(result); // Output: rmn
    }
}



