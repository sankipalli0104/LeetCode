package practice.leetcode.array;

public class PlusOne {

	public static void main(String[] args) {
		PlusOne plus = new PlusOne();
		int digits[] = {8,9,9,9};
		//9, 8, 7, 6, 5, 4, 3, 2, 1, 0
		int k[] = plus.plusOne(digits);
		for (int j : k) {
			System.out.print(j + " ");
		}

	}

	public int[] plusOne(int[] digits) {
		if (digits.length > 0) {
			long num = 0;
			for (int y = 0; y < digits.length; y++) {
				num = 10 * num + digits[y];
			}
			num = num + 1;
			long value = num;
			int count = 0;
			while (value > 0) {
				count++;
				value = value / 10;
			}
			if (digits.length == count) {
				System.out.println(num);
				int[] new_arr = new int[digits.length];
				int i = new_arr.length-1;
				while (num > 9) {
					long g = num%10;
					new_arr[i] =(int)g;
					num = num/10;
					i--;
				}
				new_arr[i] = (int)num;
				return new_arr;
			} else {
				int[] new_arr = new int[digits.length + 1];
				int i = new_arr.length-1;
				while (num > 9) {
					new_arr[i] = (int) num % 10;
					num = num / 10;
					i--;
				}
				new_arr[i] = (int)num;
				return new_arr;
			}
		}
		return digits;
	}

}
