package practice.leetcode.string;

/*
 * Given a 32-bit signed integer, reverse digits of an integer. Example 1: 
 * Input: 123   
 * 	Output: 321
 */
public class ReverseInteger {

	public static void main(String[] args) {
		int i = ReverseInteger.reverse(1534236469);
		System.out.println(i);
	}

	public static int reverse(int x) {
		long temp = 0;
		while (x > 9 || x < -9) {
			temp = temp * 10 + x % 10;
			x = x / 10;
		}
		temp = temp * 10 + x;
		if(temp > Integer.MAX_VALUE || temp < Integer.MIN_VALUE) {
			return 0;
		} else {
			return (int)temp;
		}
		
		
	}
}
