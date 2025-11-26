package Testtcp;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Testcpk {
	public static void main(String[] args) {

//Integer[] arr = {1, 3, 5, 9, 5};

		Integer[] arr = { 1, 3, 5, 9, 5 };
		List<Integer> inList = Arrays.asList(arr);

// Print non-duplicate integers
		
		  Arrays.stream(arr) .filter(num -> Arrays.stream(arr).filter(n ->
		  n.equals(num)).count() == 1) .forEach(System.out::print);
		 
		/*
		 * List<Integer> nonRepeat = inList.stream().filter(n ->
		 * inList.stream().filter(m -> n.equals(n)).count() == 1)
		 * .collect(Collectors.toList()); nonRepeat.forEach(System.out::print);
		 */

	}

}
