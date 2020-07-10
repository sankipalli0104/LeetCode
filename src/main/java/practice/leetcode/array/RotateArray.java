package practice.leetcode.array;

/*
 * Given an array, rotate the array to the right by k steps, where k is non-negative.
 * Try to come up as many solutions as you can, there are at least 3 different ways to solve this problem.
 * Could you do it in-place with O(1) extra space?
 * Example 1:
 * Input: nums = [1,2,3,4,5,6,7], k = 3
 * Output: [5,6,7,1,2,3,4]
 * Explanation: 
 * rotate 1 steps to the right: [7,1,2,3,4,5,6]
 * rotate 2 steps to the right: [6,7,1,2,3,4,5]
 * rotate 3 steps to the right: [5,6,7,1,2,3,4]
 */

public class RotateArray {

	public static void main(String[] args) {
		int[] nums = {1,2,3,4,5,6,7};
		RotateArray.rotate(nums, 4);

	}
	public static void rotate(int[] nums, int k) {
		int index = nums.length-k, j=0 ;
		int new_arr[] = new int[nums.length];
 		for(int i= index; i < nums.length; i++) {
			new_arr[j] = nums[i];
			j++;
		}
 		for(int i= 0; i < index; i++) {
			new_arr[j] = nums[i];
			j++;
		}
 		System.out.print("{ ");
 		for(int p: new_arr) {
 			System.out.print(p+" ");
 		}
 		System.out.print("}");
	}
}
