package streamApiPrograms;

import java.util.*;
import java.util.stream.Collectors;


public class String_FirstCharUpperCase {
    public static void main(String[] args) {
        List<String> strLst = Arrays.asList("ram","sachim","sehwag","yvi","dhoni");
       List<String> uppeCase = strLst.stream().map(s->  s.substring(0,1).toUpperCase()+s.substring(1)).collect(Collectors.toList());
        System.out.println(uppeCase);
    }
}
