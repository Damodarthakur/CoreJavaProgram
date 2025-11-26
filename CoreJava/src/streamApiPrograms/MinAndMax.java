package streamApiPrograms;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.NoSuchElementException;

public class MinAndMax {
	public static void main(String[] args) {
		//For Rapper
		Integer [] arr2 = {7,2,3,4,5,1,6};
		Integer min = Arrays.stream(arr2).min(Comparator.comparingInt(a->a)).orElseThrow();
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
	}

}
