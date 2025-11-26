package arrays;

import java.util.Arrays;
/*. Given a list of non-negative integers nums, 
arrange them such that they form the largest number and return it.
Since the result may be very large, so you need to return a string instead of an integer.
*/
public class FormLargestNum {
	public static void main(String[] args) {
		//nums = [3,30,34,5,9]
		//Output: "9534330"
		
		
		int[] nums = {3,30,34,5,9};
		int index = 0;
		int[] arr = new int[nums.length];
		for(int i=nums.length-1;i>=0;i--) {
			//System.out.println(nums[i]);
			arr[index] = nums[i];
			index++;
		}
		String[] numsString = new String[nums.length];
		for(int i =0;i<nums.length;i++) {
			numsString[i] = String.valueOf(arr[i]);
				
		}
		//Arrays.sort(numsString);
		StringBuilder sb = new StringBuilder();
		for(String str : numsString ) {
			sb.append(str);
		}
		System.out.println(sb.toString());
		
	}

}
