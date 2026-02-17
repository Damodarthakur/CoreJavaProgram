package streamApiPrograms;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.HashSet;

public class IntegerList_FindDuplicateElement2 {
	public static void main(String[] args) {

		// --------Recommended approach---------
		List<Integer> myList = Arrays.asList(10,15,8,49,25,98,98,32,15);
		Set<Integer> set = new HashSet();
		/* 1st way
	Set<Integer> dupInteger =	list.stream().filter(n->!set.add(n)) //set.add() return false if the element was already in the set
		.collect(Collectors.toSet());
		System.out.println("Duplicate element are:"+dupInteger);

		 */
		/* 2nd Way
	List<Integer> lst =	list.stream().filter(n->!set.add(n)).collect(Collectors.toList());
	System.out.println("Duplicate element are:"+lst);

		 */
		//list.stream().filter(n->!set.add(n)).collect(Collectors.toSet()).forEach(System.out::println);
		myList.stream().filter(n->!set.add(n)).forEach(System.out::println);

	}

}
