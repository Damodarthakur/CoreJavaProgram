package Test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class TestAco {
	public static void main(String[] args) {
		int[] a = new int[] {1, 3, 3, 5, 5, 7};

        // Convert int[] to ArrayList<Integer>
		List<int[]> arr = Arrays.asList(a);
       // ArrayList<Integer> arrayList = new ArrayList<>(Arrays.asList(a));

        // Print the ArrayList
        //System.out.println(arrayList);
		Set<int[]> set = new HashSet<>();
		arr.stream().filter(n->!set.add(n))
		.forEach(System.out::println);
		
	}


}
