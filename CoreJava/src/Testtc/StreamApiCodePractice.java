package Testtc;

import collection.Customer;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StreamApiCodePractice {
    public static void main(String[] args) {
        /*
        //--------------++1++--------------### Count of first Repeating Char------------------------
        String str = "abcecfbed";
        Map<Character,Long> occurChar = str.chars().mapToObj(c->(char)c)
                            .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        Optional<Map.Entry<Character,Long>> firstRepeatChar = occurChar.entrySet().stream().filter(e->e.getValue()>1)
                .findFirst();

        if(firstRepeatChar.isPresent()){
            System.out.println("firstRepeatChar "+firstRepeatChar.get().getKey()+"cout+"+firstRepeatChar.get().getValue() );
        }

         */

        //-----2-------// Find customers with orderAmount greater than 10000 and apply 10% discount------------------------------------

//---------------SortStrFirstElementBananaLastCherry--------------------------------------------
        List<String> strList = Arrays.asList("Apple","Orange","Banana","Chiku","Cherry","Grapes");
        List<String> sortedList = strList.stream().sorted(Comparator.comparing(s->{
            if(s.equals("Banana")){
                return -1;
            } else if (s.equals("Cherry")) {
                return 1;

            }
            else {
                return 0;
            }
        }))
        .collect(Collectors.toList());
        System.out.println(sortedList);

        //O/P- [Banana, Apple, Orange, Chiku, Grapes, Cherry]






    }
}
