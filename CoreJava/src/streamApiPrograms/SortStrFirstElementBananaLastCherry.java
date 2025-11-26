package streamApiPrograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortStrFirstElementBananaLastCherry {
    public static void main(String[] args) {
        List<String> strList = Arrays.asList("Apple","Orange","Banana","Chiku","Cherry","Grapes");

        List<String> sortedList = strList.stream().sorted(Comparator.comparing(s -> {
            if(s.equals("Banana")){
                return -1;
            } else if (s.equals("Cherry")) {
                return 1;

            }
            else {
                return 0;
            }
        })).collect(Collectors.toList());

        System.out.println(sortedList);
    }

}
