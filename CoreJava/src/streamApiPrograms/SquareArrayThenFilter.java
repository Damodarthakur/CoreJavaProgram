package streamApiPrograms;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SquareArrayThenFilter {
	public static void main(String[] args) {
		Integer[] nums = {1,2,3,4,5,6};
		List<Integer> lst = Arrays.asList(nums);
			
		long lst2=	lst.stream().map(a->Math.pow(a, 2)).filter(a->a>20).count();
				//.collect(Collectors.toList()));
			System.out.println(lst2);
		/*
		long count = Arrays.stream(nums).mapToLong(a->a*a).filter(a->a>20).count();
		System.out.println(count);
		*/
		
		;
			
	}


}
