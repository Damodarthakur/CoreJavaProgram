package arrays;

import java.util.Arrays;

public class AverageMarks {
	public static void main(String[] args) {
		String[][] arr = {{"XXX","25"},{"YYY","50"},{"XXX","75"}};
		//System.out.println("the length of array is"+ arr.length);

		int sum = 0;
		int count = 0;
//		for(String[] str : arr) {
//			for(String str2:str) {
//				System.out.println(str2+"\t");
//			}
//		}

		for (String[] entry : arr) {
		    // Assuming the marks are always stored as strings in the second element
			System.out.println(entry[1]);
		    int marks = Integer.parseInt(entry[1]);
		    sum += marks;
		    count++;
		}

		double average = (double) sum / count;

		System.out.println("Average of marks: " + average);

	}

}
