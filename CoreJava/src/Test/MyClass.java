package Test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class MyClass {
	//Write Java program method that checks if two arrays contain the same elements.
	public static void main(String[] args) {
	        int[] a1 = {1,2,3,2,1};
	        int[] a2 = {1,2,3};
	        int[] a3 = {1,2,3,4};
	        
	System.out.println(check (a1,a2));
	System.out.println(check(a1,a3));
	
	/*int a[]={3,4,6,8,1,2,3,58,9,1,6,4,3,4,58}
	print this count 
	3=4 times
	4=3 times
	1=2 times
	6=1 times
	.....
	58=2 times*/
	int a[]={3,4,6,8,1,2,3,58,9,1,6,4,3,4,58};
	
	Map<Integer,Integer> map = new HashMap<>();
	for(int arr : a) {
		if(map.containsKey(arr)) {
			map.put(arr, map.get(arr)+1);
		}
		else {
			map.put(arr, 1);
			
		}
		
	}
	
	for(Map.Entry<Integer, Integer> entry : map.entrySet()) {
		System.out.println(entry.getKey()+ ":"+ entry.getValue());
	}
	

	 

	}
	public static boolean check (int[] x,int[] y){
		
		Arrays.sort(x);
		Arrays.sort(y);
		Set<Integer> set = new HashSet<>();
		for(int arr : x) {
			set.add(arr);
		}
		int[] z = new int[set.size()];
        int index = 0;
        for (int num : set) {
            z[index++] = num;
        }
        Arrays.toString(z);
        //boolean areEqual = Arrays.equals(z, y);

        if (Arrays.equals(z, y)==true) {
            return true;
        } else {
            return false;
        }
        
	

	}

}
