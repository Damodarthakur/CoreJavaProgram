package arrays;

public class RotateArrayByKsteps {



    public static void rotate(int[] nums, int k) {
        k = k % nums.length;
        reverse(nums, 0, nums.length - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, nums.length - 1);
    }

    private static void reverse(int[] nums, int left, int right) {
        while (left < right) {
            int temp = nums[left];
            nums[left++] = nums[right];
            nums[right--] = temp;
        }
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,7};
        int k = 3;
        rotate(nums, 3);

        for (int n : nums) {
            System.out.print(n + " ");
        }
    }
}
/********************---Explanation----------------*****************************-------

 Rotate this array:

 [1, 2, 3, 4, 5, 6, 7]

 by k = 3 steps to the right

 ✅ Expected output:

 [5, 6, 7, 1, 2, 3, 4]

 📌 Step-by-Step Explanation
 1️⃣ rotate() method
 public static void rotate(int[] nums, int k) {


 This method rotates the array in-place (no extra array used).

 🔹 Step 1: Handle large k
 k = k % nums.length;


 Why?

 If array length = 7

 Rotating by 10 is same as rotating by 3

 Example:

 10 % 7 = 3

 2️⃣ Reverse the whole array
 reverse(nums, 0, nums.length - 1);


 Original:

 [1, 2, 3, 4, 5, 6, 7]


 After reverse:

 [7, 6, 5, 4, 3, 2, 1]

 3️⃣ Reverse first k elements
 reverse(nums, 0, k - 1);


 Reverse first 3 elements (0 to 2):

 Before:

 [7, 6, 5, 4, 3, 2, 1]


 After:

 [5, 6, 7, 4, 3, 2, 1]

 4️⃣ Reverse remaining elements
 reverse(nums, k, nums.length - 1);


 Reverse from index 3 to 6:

 Before:

 [5, 6, 7, 4, 3, 2, 1]


 After:

 [5, 6, 7, 1, 2, 3, 4]


  Rotation completed!

 5️⃣ reverse() helper method
 private static void reverse(int[] nums, int left, int right)


 This method reverses part of the array using two pointers.

 Inside the loop:
 while (left < right) {
 int temp = nums[left];
 nums[left++] = nums[right];
 nums[right--] = temp;
 }


 🔁 What happens:

 Swap left and right

 Move left forward

 Move right backward

 Example:

 [1, 2, 3, 4]
 left = 0, right = 3
 → [4, 2, 3, 1]
 → [4, 3, 2, 1]

 */


