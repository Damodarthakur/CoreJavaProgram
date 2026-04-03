package arrays;

public class MoveZeroesToRight {
    public static void moveZeroes(int[] arr) {
        int index = 0;

        for(int num : arr){
            if(num!= 0){
                arr[index++] = num;
            }
        }
        while(index < arr.length){
            arr[index++] = 0;
        }
    }
    public static void main(String[] args) {
        //* Input:  [1, 0, 1, 0, 1]
        //
        //* Output: [0, 0, 1, 1, 1]
        int arr[] = {1, 0, 1, 0, 1};
        moveZeroes(arr);
        for(int n : arr){
            System.out.print(n +" ");

        }

    }


}
