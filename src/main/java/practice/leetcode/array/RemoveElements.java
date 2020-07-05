package practice.leetcode.array;

/*
 * Given an array nums and a value val, remove all instances of that value in-place and return the new length.
 * Do not allocate extra space for another array, you must do this by modifying the input array in-place with O(1) extra memory.
 * The order of elements can be changed. It doesn't matter what you leave beyond the new length.
 * Example 2:Given nums = [0,1,2,2,3,0,4,2], val = 2,
 * your function should return length = 5, with the first five elements of nums containing 0, 1, 3, 0, and 4.
 * Note that the order of those five elements can be arbitrary.
 * It doesn't matter what values are set beyond the returned length.
 */
public class RemoveElements {
	public static void main(String[] args) {
		RemoveElements removeElements = new RemoveElements();
		int[] nums = {3,2,2,3}; 
		int val = 2;
		int i = removeElements.removeElement(nums, val);
		System.out.println(i);

	}
	public int removeElement(int[] nums, int val) {
		int i =0;
		for(int j=0; j < nums.length; j++) {
			if(nums[j] == val) {
				
			}
		}
		return 0; 
    }

}
