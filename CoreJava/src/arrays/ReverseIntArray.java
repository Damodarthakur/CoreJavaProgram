package arrays;

public class ReverseIntArray {
	   static void reverse(int a[]) 
	   
	    { 
		   int n = a.length;
		   int i, k, temp; 
	        for (i = 0; i < n / 2; i++) { 
	            temp = a[i]; 
	            a[i] = a[n - i - 1]; 
	            a[n - i - 1] = temp; 
	        } 
	  
	        
	        System.out.println("Reversed array is: \n"); 
	        for (k = 0; k < n; k++) { 
	            System.out.println(a[k]); 
	        } 
	    }
	  
	    public static void main(String[] args) 
	    { 
	        int [] arr = {10, 20, 30, 40, 50}; 
	        reverse(arr); 
	    } 
	

}
