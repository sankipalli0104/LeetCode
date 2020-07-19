package practice.leetcode.array;

public class SingleNumber {

	public static void main(String[] args) {
		SingleNumber sn = new SingleNumber();
		int nums[]= {2,2,2}; 
		int num = sn.singleNumber(nums);
		if(num == 0) {
		}else {
			System.out.println("Single NUmber is "+num);
		}
		
		
	}

	public int singleNumber(int[] nums) {
		if (nums.length >= 3) {
			for (int i = 0; i < nums.length; i++) {
				int count = 0;
				int j = 0;
				while (j < nums.length) {
					if (i == j) {
						j++;
						continue;
					}
					if (nums[i] == nums[j]) {
						count++;
						break;
					}
					j++;
				}
				if (count == 0) {
					return nums[i];
				}
			}
		}
		System.out.println("No unique number found, hence returning 0 ");
		return 0;
	}
}
