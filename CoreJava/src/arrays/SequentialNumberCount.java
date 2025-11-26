package arrays;

import java.util.Arrays;

public class SequentialNumberCount {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 7, 4, 5, 6, -1, -2, -3};
        Arrays.sort(array);
        int count = 0;

        for (int i = 0; i < array.length - 2; i++) {
            if (array[i + 1] == array[i] + 1 && array[i + 2] == array[i] + 2) {
                count++;
                i += 2; // Skip the next two elements since they are already counted
            }
        }

        System.out.println("Count of sequential numbers: " + count);
    }
}

