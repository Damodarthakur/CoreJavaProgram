package arrays;

import java.util.Arrays;

public class ThreedArray {
	public static void main(String[] args) {
		int [][][] arr = {{{12,21,44,45,34,35,44},{11,22,33},{16,18,20},{115,56,34}},{{20,30,40},{30,35,40},{50,60,90}}};
		System.out.println(arr[1][2][2]);
		System.out.println("size of array "+ arr.length);
		System.out.println("size of array "+ arr[0].length);
		System.out.println("size of array "+ arr[1].length);
		System.out.println("size of array "+ arr[0][0].length);
		int [][] arr2 = {{10,20,40},{12,20,30},{10,30,40}};
		for (int[][] array2D: arr) {
            for (int[] array1D: array2D) {
                for(int item: array1D) {
                    System.out.println(item);
                }
            }
		}
			
		}
	}


