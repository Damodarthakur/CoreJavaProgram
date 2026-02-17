package arrays;

public class SortingByInsertionSort {
    public static void main(String[] args) {
        int arr[] = {5,6,2,3,1};

        for(int i =1;i<arr.length;i++){
            int j = i-1;
            int k = arr[i];
            while (j>=0 && arr[j]>k){
                arr[j+1] = arr[j];
                j--;

            }
            arr[j+1] = k;
        }
        for (int num : arr){
            System.out.print(num + " ");
        }


    }
}
