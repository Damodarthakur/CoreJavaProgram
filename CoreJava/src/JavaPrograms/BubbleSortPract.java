package JavaPrograms;

public class BubbleSortPract {
	void bblSort(int arr[]){
		
		int n = arr.length;
		
		for(int i = 0;i<n-1;i++) {
			for(int j =0;j<n-i-1;j++) {
				if(arr[j]>arr[j+1]) {
					int temp = arr[j];
					
					arr[j] = arr[j+1];
					arr[j+1] = temp;
					
				}
			}
		}
	}
		
		void printArray(int arr[]) {
			
			int m = arr.length;
			for(int i = 0;i<m;i++) 
				System.out.print(arr[i]+" ");
			System.out.println( );
		
		
	}
	
	
	
	public static void main(String[] args) {
		 BubbleSortPract p = new BubbleSortPract();
		 
		 int arr[] = {24,34,45,13,21,49,18};
		 
		 p.bblSort(arr);
		 
		 System.out.println("the sorted array");
		 p.printArray(arr);
		 
				 
	}

}
