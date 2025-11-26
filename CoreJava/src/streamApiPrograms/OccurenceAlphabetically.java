package streamApiPrograms;

import java.util.Map;
import java.util.stream.Collectors;

public class OccurenceAlphabetically {
	public static void main(String[] args) {
		String str = "ZhgTyuuuXAAbH";

        Map<Character, Long> occurrences = str.toLowerCase()
                .chars()
                .mapToObj(c -> (char) c)
                .filter(Character::isAlphabetic)
                .collect(Collectors.groupingBy(c -> c, Collectors.counting()));
        System.out.println(occurrences);
	}

}
