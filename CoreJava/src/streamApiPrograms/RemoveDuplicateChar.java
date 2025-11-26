package streamApiPrograms;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class RemoveDuplicateChar {
	public static void main(String[] args) {
		String str = "ovvr";
		//List<String> stt = Arrays.asList(str);
		
	//Set stp = stt.stream().filter(n->!set.add(n)).collect(Collectors.toSet());
	//System.out.println(stp);
		char[] chars = str.toCharArray();
		Set set = new HashSet();
		for(char ch :chars) {
		set.add(ch);}
		System.out.println(set.toString());
	
	
	
	
	
		
		
	}

}
