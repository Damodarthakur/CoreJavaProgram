package arrays;

import java.util.Arrays;

public class CheckTwoArrayEqualsOrNot {
	public static void main(String[] args) {
		int arr1[]={1,2,3,4,5,6};
		int arr2[] ={6,5,4,3,2,1};
		Arrays.sort(arr2);
		for(int i=0;i<arr2.length;i++) {
			System.out.print("forLoop :"+arr2[i]);
		}
		for(int arr : arr2) {
			System.out.println(arr);
			
		}
		
	}

}
