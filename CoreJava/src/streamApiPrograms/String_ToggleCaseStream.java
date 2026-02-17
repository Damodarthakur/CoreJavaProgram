package streamApiPrograms;

import java.util.Arrays;
import java.util.stream.Collectors;

public class String_ToggleCaseStream {
    public static void main(String[] args) {
        String str = "Java Is A Programming Language";
        //O/P - jAVA iS a pROGRAMMING lANGUAGE

        String result = Arrays.stream(str.split(" "))
                .map(word ->
                        word.substring(0, 1).toLowerCase() +
                                word.substring(1).toUpperCase()
                )
                .collect(Collectors.joining(" "));

        System.out.println(result);
        /*


        String result = Arrays.stream(str.split(" "))
        .map(word -> Character.toLowerCase(word.charAt(0)) +
                word.substring(1).toUpperCase())
        .collect(Collectors.joining(" "));

         */
    }
}

