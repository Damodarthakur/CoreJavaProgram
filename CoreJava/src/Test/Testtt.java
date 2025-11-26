package Test;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Testtt {
	public static void main(String[] args) {
		//First Non-repeated character from the String

		//Input : { "array", "apple", "rat"}
		//Output: y,a,r
		//List<String> strList = Arrays.asList("array", "apple", "rat");
		String[] input = { "array", "apple", "rat"};

		for(String str : input ){

			//Map<Character,Long> charMap =
			Character result =	str.chars().mapToObj(c->(char)c).
					collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new,Collectors.counting()))
					.entrySet().stream().filter(e->e.getValue()==1).map(Map.Entry::getKey).findFirst().orElseThrow(null);


			System.out.println(result);

		}
		
		
	}

}
