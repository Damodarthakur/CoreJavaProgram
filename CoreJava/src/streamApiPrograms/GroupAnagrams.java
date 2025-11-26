package streamApiPrograms;

import java.util.*;
        import java.util.stream.Collectors;

        /*
        
        input =[listen, silent, enlist, rat, tar, art, evil, vile, live, veil, java, avaj]
        output : [listen, silent, enlist]
                 [rat, tar, art]
                 [evil, vile, live, veil]
                 [java, avaj]

         */

public class GroupAnagrams {
    public static void main(String[] args) {
        List<String> input = Arrays.asList("listen", "silent", "enlist",
                "rat", "tar", "art",
                "evil", "vile", "live", "veil",
                "java", "avaj");

        Map<String, List<String>> grouped = input.stream()
                .collect(Collectors.groupingBy(word -> {
                    char[] chars = word.toCharArray();
                    Arrays.sort(chars);
                    return new String(chars);
                }, LinkedHashMap::new, Collectors.toList()));

        grouped.values().forEach(System.out::println);
    }

    //----------OR----------------------------->
    /*
    import java.util.*;
import java.util.stream.Collectors;

public class GroupAnagrams {
    public static void main(String[] args) {
        List<String> input = Arrays.asList("listen", "silent", "enlist",
                                           "rat", "tar", "art",
                                           "evil", "vile", "live", "veil",
                                           "java", "avaj");

        Map<String, List<String>> grouped = input.stream()
                .collect(Collectors.groupingBy(word -> {
                    char[] chars = word.toCharArray();
                    Arrays.sort(chars);
                    return new String(chars);
                }));

        grouped.values().forEach(System.out::println);
    }
}

     */
}

