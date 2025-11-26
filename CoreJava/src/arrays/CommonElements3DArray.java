package arrays;

public class CommonElements3DArray {
    public static void main(String[] args) {
        int[][][] array = {
            {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}},
            {{4, 5, 6}, {7, 8, 9}, {10, 11, 12}},
            {{7, 8, 9}, {10, 11, 12}, {13, 14, 15}}
        };
        
        findCommonElements(array);
    }
    
    public static void findCommonElements(int[][][] array) {
        if (array.length == 0) {
            System.out.println("No common elements found.");
            return;
        }
        
        // Initialize a frequency map to keep track of element occurrences
        int[] frequencyMap = new int[1000]; // Assuming elements are within the range [0, 999]
        
        // Iterate through the 3D array
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                for (int k = 0; k < array[i][j].length; k++) {
                    int element = array[i][j][k];
                    frequencyMap[element]++;
                }
            }
        }
        
        // Print common elements
        System.out.println("Common elements:");
        for (int i = 0; i < frequencyMap.length; i++) {
            if (frequencyMap[i] == array.length) {
                System.out.println(i);
            }
        }
    }
}

