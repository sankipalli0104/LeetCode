package practice.leetcode.array;

/*
 * 
 * Given an integer, write a function to determine if it is a power of three.
 * Example 1:Input: 27 Output: true
 * Example 2: Input: 0 Output: false
 */
public class PowerOfThree {

	public static void main(String[] args) {
		boolean is = PowerOfThree.isPowerOfThree(11);
		System.out.println("\n" + is);
	}

	public static boolean isPowerOfThree(int n) {
    	if( n >=3) {
    		int temp = n;
        	do {
            	temp = temp/3;
        	}while(temp%3 == 0);
        	if(temp == 1) {
        		return true;
        	} else {
        		return false;
        	}
    	}
    	return false;
    }

}
