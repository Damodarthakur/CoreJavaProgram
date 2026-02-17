package streamApiPrograms;

import java.util.Map;
import java.util.stream.Collectors;

public class String_NonRepeatingCharacterFinder {
	public static void main(String[] args) {
		String str = "raman";

		/*
		 * String result = str.chars().mapToObj(ch -> (char) ch)
		 * .collect(Collectors.groupingBy(c -> c, Collectors.counting())) .entrySet()
		 * .stream() .filter(entry -> entry.getValue() == 1) .map(Map.Entry::getKey)
		 * .collect(Collectors.joining());
		 */

		String nonRepeatingChar = str.chars().mapToObj(c -> (char) c)
				.collect(Collectors.groupingBy(c -> c, Collectors.counting())).entrySet().stream()
				.filter(entry -> entry.getValue() == 1).map(Map.Entry::getKey)
				.map(String::valueOf)
				.collect(Collectors.joining());

		System.out.println("Non-repeating characters: " + nonRepeatingChar);
	}
}
