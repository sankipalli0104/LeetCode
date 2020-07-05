package practice.leetcode.array;
/* 
 * Given an array of integers, find if the array contains any duplicates.
 * Your function should return true if any value appears at least twice in the array, and it should return false if every element is distinct.
 * Example 1:
 * Input: [1,2,3,1]
 * Output: true
 **/
public class ContainsDuplicate {

	public static void main(String[] args) {
		ContainsDuplicate containsDuplicate = new ContainsDuplicate();
		int[] nums = {1,2,3,4,6};
		boolean isFind = containsDuplicate.containsDuplicate(nums);
		System.out.print(isFind);
	}
	public boolean containsDuplicate(int[] nums) {
		boolean isDuplicate=false;
		for(int i=0; i<nums.length; i++) {
			int j=i+1;
			while(j<nums.length) {
				if(nums[i] == nums[j]) {
					isDuplicate = true;
					return isDuplicate;
				}
				j++;
			}
		}
		
		return isDuplicate;
		}
}
