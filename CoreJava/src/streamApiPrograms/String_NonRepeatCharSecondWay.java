package streamApiPrograms;


import java.util.stream.Collectors;

public class String_NonRepeatCharSecondWay {
    public static void main(String[] args) {
        String str = "java";

        String nonRepeatingChars = str.chars()
                .mapToObj(c -> (char) c)
                .filter(c -> str.indexOf(c) == str.lastIndexOf(c))
                .map(Object::toString)
                .collect(Collectors.joining());

        System.out.println(nonRepeatingChars); // Output: v
    }
}
