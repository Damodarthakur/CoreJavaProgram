package String;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDupString {
	public static void main(String[] args) {
		String str = "ovvr";

        // Convert the string to a character array
        char[] chars = str.toCharArray();
        
        // Create a LinkedHashSet to remove duplicates while preserving the order
        Set<Character> charSet = new HashSet<>();
        
        // Add each character to the set
        for (char c : chars) {
            charSet.add(c);
        }
        
        // Build the string from the set
        StringBuilder sb = new StringBuilder();
        for (char c : charSet) {
            sb.append(c);
        }
        
        // Get the final string without duplicates
        String result = sb.toString();
        System.out.println(result);
    }

	}


