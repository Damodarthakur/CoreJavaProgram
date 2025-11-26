package arrays;

import java.util.HashMap;

public class SumTwoArrEqlTarget {
    public static void main(String[] args) {
        int[] arr = {2, 7, 11, 5};
        int targetSum = 9;

    findTwoSum(arr, targetSum);
}

    public static void findTwoSum(int[] arr, int targetSum) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int num : arr) {
            int complement = targetSum - num;
            if (map.containsKey(complement)) {
                System.out.println(complement + " " + num );
                return;
            }
            map.put(num, 1); // Add the current number to the map
        }

        System.out.println("No two numbers add up to " + targetSum);
    }
}
