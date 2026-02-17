package streamApiPrograms;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class String_StartsWithNumber {
    public static void main(String[] args) {

        List<String> listOfStrings =
                Arrays.asList("One", "2wo", "3hree", "Four", "5ive", "Six");
//recomended approach
        List<String> result = listOfStrings.stream()
                .filter(s->!s.isEmpty() && Character.isDigit(s.charAt(0)))
                .collect(Collectors.toList());
//not recomended
        List<String> result2 = listOfStrings.stream()
                .filter(s -> s.substring(0, 1).matches("\\d"))
                .collect(Collectors.toList());


        System.out.println(result);
        System.out.println("result "+'\n'+ result2);

    }
}

