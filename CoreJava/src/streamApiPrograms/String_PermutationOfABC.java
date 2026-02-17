package streamApiPrograms;

import java.util.stream.IntStream;
        import java.util.stream.Stream;

public class String_PermutationOfABC {

    public static void main(String[] args) {

        String str = "ABC";

        System.out.println("Permutations of " + str + " :");

        permutations(str)
                .forEach(System.out::println);
    }

    static Stream<String> permutations(String str) {

        // Base case
        if (str.isEmpty()) {
            return Stream.of("");
        }

        // Recursive stream logic
        return IntStream.range(0, str.length())
                .boxed()   // ✅ Convert IntStream -> Stream<Integer>
                .flatMap(i ->
                        permutations(str.substring(0, i) + str.substring(i + 1))
                                .map(s -> str.charAt(i) + s)
                );
    }
}

