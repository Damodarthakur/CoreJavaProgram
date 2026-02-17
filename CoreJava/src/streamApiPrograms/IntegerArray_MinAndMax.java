package streamApiPrograms;

import java.util.Arrays;
import java.util.Comparator;

public class IntegerArray_MinAndMax {
	public static void main(String[] args) {
		//For Rapper
		Integer [] arr2 = {7,2,3,4,5,1,6};
		Integer min = Arrays.stream(arr2).min(Comparator.comparingInt(a->a)).orElseThrow();
		Integer max = Arrays.stream(arr2).max(Comparator.comparingInt(a->a)).orElseThrow();
		//List<Integer> lst = Arrays.asList(null)
		// 1st way
		////int [] arr = {7,2,3,4,5,1,6}; when we are using primitive
		//int min = Arrays.stream(arr).min().orElseThrow(()-> new NoSuchElementException("no element"));
				//.orElseThrow();
				//*/
		/* 2nd way
		int min = Arrays.stream(arr)
                .min()
                .orElseThrow();

		 */
		System.out.println(min);
		System.out.println(max);
	}

}
