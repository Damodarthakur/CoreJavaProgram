package streamApiPrograms;

import java.util.Map;
import java.util.stream.Collectors;

public class String_OccurenceofCharacter {
	public static void main(String[] args) {
		String str = "JavaDeveloper";
		Map<Character,Long> OccurMap = str.chars().mapToObj(c->(char)c)
				.collect(Collectors.groupingBy(s->s,Collectors.counting()));
			//System.out.println(OccurMap);
		
		OccurMap.forEach((K, V) -> System.out.println(K + " - " + V));
		
	}

}
