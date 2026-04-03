package arrays;

public class MoveZeroesToLeft {
    public static void moveZeroesToLeft(int[] arr) {
        int index = arr.length - 1;
        // Step 1: place non-zero elements from right side
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] != 0) {
                arr[index--] = arr[i];

            }
        }
            // Step 2: fill remaining positions with zero
            while (index >= 0) {
                arr[index--] = 0;
            }

    }
    public static void main(String[] args) {
        //* Input:  [1, 0, 1, 0, 1]
        //* Output: [0, 0, 1, 1, 1]

        int [] arr = {1, 0, 1, 0, 1};

        moveZeroesToLeft(arr);
        for(int n : arr){
            System.out.print(n + " ");
        }
    }


}
