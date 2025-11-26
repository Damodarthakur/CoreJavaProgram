package arrays;

public class SumOfTwoArray {
	public static void main(String[] args) {
		//[3,4,5,2,1,6,9] sum=5

				//o/p=[3,2] [4,1] [5]

				int[] arr = {3,4,5,2,1,6,9};
				int sum = 5;

				for(int i=0;i<arr.length;i++){
				for(int j=i+1;j<arr.length;j++){
				if(arr[i] +arr[j] == sum) {
					System.out.println(arr[i]+","+arr[j]);
					
				}
				
				
				 }
				}
				/*
				for (int i = 0; i < arr.length; i++) {
				    for (int j = i + 1; j < arr.length; j++) {
				        if (arr[i] + arr[j] == sum) {
				            System.out.println("[" + arr[i] + ", " + arr[j] + "]");
				        }
				    }
				}*/
	}

}
