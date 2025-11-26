package Testtcp;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Testcpp {
	public static void main(String[] args) {
//		int []arr = {1, 2, 4, 5};
//
//		for(int i =0; i<=arr.length; i++){
//			arr[i] = arr[i+1];
//		}
		//Find duplicate element character count string

		/*
		String str = "damodar";
		Map<Character,Integer> map = new HashMap<>();
		char[] chars = str.toCharArray();

		for(Character ch : chars){
			if(map.containsKey(ch)){
				map.put(ch,map.get(ch)+1);
			}
			else
				map.put(ch,1);
		}
		for(Map.Entry<Character,Integer> entry : map.entrySet()){
			if(entry.getKey()>1){
				System.out.println(entry.getKey() +":" +entry.getValue());
			}

		}

		 */
// find pairs of two number where sum is equal to output
		int[] arr = {2,7,11,5};
		int target = 9;
		Map<Integer,Integer> mp = new HashMap<>();
		for(int num : arr){
			int complement = target - num;
			if(mp.containsKey(complement)){
				System.out.println(complement+"+"+ num + " = " + target);
			}
			else mp.put(num,1);
		}




	}

}
