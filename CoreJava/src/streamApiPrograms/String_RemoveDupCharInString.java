package streamApiPrograms;

import java.util.stream.Collectors;

public class String_RemoveDupCharInString {
	public static void main(String[] args) {
		String str = "Malayalam";
	String res =	str.chars().mapToObj(c->String.valueOf((char)c)).distinct().collect(Collectors.joining());
	System.out.println(res);
		
	}

}
