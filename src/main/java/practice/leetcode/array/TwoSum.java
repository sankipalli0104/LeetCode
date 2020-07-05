package practice.leetcode.array;
/*
 * Given an array of integers, return indices of the two numbers such that they add up to a specific target.
 * You may assume that each input would have exactly one solution, and you may not use the same element twice.
 * Example:Given nums = [2, 7, 11, 15], target = 9, Because nums[0] + nums[1] = 2 + 7 = 9,
 * return [0, 1].
 */
public class TwoSum {
	public static void main(String[] args) {
		TwoSum twoSum =  new TwoSum();
		int nums[] = {2,7,11,5};
		int target = 16;
		int[] arr = twoSum.twoSum(nums, target);
		System.out.print("{ ");
		for(int i: arr) {
			System.out.print(i+" ");
		}
		System.out.print("}");
	}
	public int[] twoSum(int[] nums, int target) {
		int index_arr[] = new int[2];
		for (int i = 0; i < nums.length; i++) {
			int j = i + 1;
			while (j < nums.length) {
				if ((nums[i] + nums[j]) == target) {
					index_arr[0] = i;
					index_arr[1] = j;
					return index_arr;
				}
				j++;
			}
		}
		return index_arr;
	}
}
