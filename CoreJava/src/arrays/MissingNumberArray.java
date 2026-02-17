package arrays;

public class MissingNumberArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,5};
        int n = arr.length+1;
        int actualSum = 0;
        int expectedsum = n*(n+1)/2;

        for(int num : arr){
            actualSum += num;

        }
        int missingNumber = expectedsum-actualSum;
        System.out.println(missingNumber);

    }
}
