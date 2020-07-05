package practice.leetcode.array;

public class RemoveDuplicates {

	public static void main(String[] args) {
		RemoveDuplicates removeDuplicates = new RemoveDuplicates();
		//0,0,1,1,1,2,2,3,3,4
		int[] nums = {};
		int length = removeDuplicates.removeDuplicates(nums);
		System.out.println("\nLength = "+length);

	}
	public int removeDuplicates(int[] nums) {
	    if (nums.length == 0) return 0;
	    int i = 0;
	    for (int j = 1; j < nums.length; j++) {
	        if (nums[j] != nums[i]) {
	            i++;
	            nums[i] = nums[j];
	        }
	    }
	    for(int k =0; k <= i ; k++) {
	    	System.out.print(nums[k]+" ");
	    }
	    return i + 1;
	}

}
