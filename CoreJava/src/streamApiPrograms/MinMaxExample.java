package streamApiPrograms;

import java.util.Arrays;
import java.util.Comparator;

public class MinMaxExample {
    public static void main(String[] args) {
        int[] arr = {5, 7, 3, 4, 1, 6, 2};

        // Find minimum value
        int min = Arrays.stream(arr)
                .min()
                .orElseThrow(); // Throws an exception if the array is empty

        // Find maximum value
        int max = Arrays.stream(arr)
                .max()
                .orElseThrow(); // Throws an exception if the array is empty

        System.out.println("Minimum value: " + min);
        System.out.println("Maximum value: " + max);
    }
}

