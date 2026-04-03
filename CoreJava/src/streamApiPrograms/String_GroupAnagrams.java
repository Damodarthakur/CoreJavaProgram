package streamApiPrograms;

import java.util.*;
import java.util.stream.Collectors;

        /*
        
        input =[listen, silent, enlist, rat, tar, art, evil, vile, live, veil, java, avaj]
        output : [listen, silent, enlist]
                 [rat, tar, art]
                 [evil, vile, live, veil]
                 [java, avaj]
========================================Capgemini===================================>

         */

public class String_GroupAnagrams {
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
}

    /*
    -------------explanation -------------------------------------------------
    char[] chars = word.toCharArray();
Arrays.sort(chars);
return new String(chars);
What this does:
Convert word into character array
"listen" → ['l','i','s','t','e','n']

Sort characters alphabetically
→ ['e','i','l','n','s','t']

Convert back to string
→ "eilnst"

            Map<String, List<String>>
Looks like this internally:



{
  "eilnst" -> [listen, silent, enlist]
  "art"    -> [rat, tar, art]
  "eilv"   -> [evil, vile, live, veil]
  "aajv"   -> [java, avaj]
}
                                        grouped.values().forEach(System.out::println);
grouped.values() → gets only the grouped lists

Prints each anagram group

🔹 Output
csharp
Copy code
[listen, silent, enlist]
[rat, tar, art]
[evil, vile, live, veil]
[java, avaj]

---------------------------------------------------------------------------------------
     */

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


