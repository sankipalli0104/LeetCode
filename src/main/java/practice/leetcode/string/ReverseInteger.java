package practice.leetcode.string;

/*
 * Given a 32-bit signed integer, reverse digits of an integer. Example 1: 
 * [1]. Example: Input: 123 ,Output: 321  
 * [2]. Example Input 1534236469 Output: 0.
 * 	
 */
public class ReverseInteger {

	public static void main(String[] args) {
		int i = ReverseInteger.reverse(1534236469);
		System.out.println(i);
	}
/*
 * return 0 if the integer is greater than 32 bit after reverse the the initial integer.
 */
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
