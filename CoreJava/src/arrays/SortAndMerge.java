package arrays;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

//using bubble sort
public class SortAndMerge {
	public static void main(String[] args) {
		int a[] = { 4, 5, 7, 8, 13, 22 };
		int b[] = { 24, 13, 13, 28, 30, 29 };
		// int c[]={4,5,7,8,13,22,24,28,29,30}
		//int i, n, temp;
		
		//System.out.println("Sorted array: " + Arrays.toString(arr));
		int a1 = a.length;
        // determining length of second array
        int b1 = b.length;
        
     // resultant array size
        int c1 = a1 + b1;
  
     // Creating a new array
        int[] c = new int[c1];
  
        // Loop to store the elements of first
        // array into resultant array
        for (int i = 0; i < a1; i = i + 1) {
            // Storing the elements in 
            // the resultant array
            c[i] = a[i];
        }
  
        // Loop to concat the elements of second 
        // array into resultant array
        for (int i = 0; i < b1; i = i + 1) {
  
            // Storing the elements in the 
            // resultant array
            c[a1 + i] = b[i];
        }
  
        // Loop to print the elements of 
        // resultant array after merging
        System.out.println(" resultant array after merging");
        for (int i = 0; i < c1; i = i + 1) {
              
            // print the element
        	
            System.out.println(c[i]);
        }
        
		for (int i = 0; i < c1 - 1; i++) {
			// swapped = false;
			for (int j = 0; j < c1 - i - 1; j++) {
				if (c[j] > c[j + 1]) {

					// Swap arr[j] and arr[j+1]
					int temp = c[j];
					c[j] = c[j + 1];
					c[j + 1] = temp;
					// swapped = true;
				}
			}
		}
		System.out.println("Sorted Array in Ascending Order:");
		for(int i=0;i<c1;i++) {
			System.out.println(c[i]);
		}
	    System.out.println(Arrays.toString(c));
		
		Set<Integer> set = new LinkedHashSet<>();
		for(Integer arr : c) {
			set.add(arr);
			
			
		}
		System.out.println("Sorted array and duplicate are removes: " + set);
		
		
		

	}
}
