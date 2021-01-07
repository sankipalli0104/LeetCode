package practice.leetcode.string;

/*
 * Given a string s, find the length of the longest substring without repeating characters.
 * Example 1:
 * Input: s = "abcabcbb"
 * Output: 3
 * Explanation: The answer is "abc", with the length of 3.
 * */
public class LongestSubstringWithoutRepeatingCharacters {

	public static void main(String[] args) {

		int i = lengthOfLongestSubstring("abcabcbb");
		System.out.println("Longest substring without repeating characters "+i);
	}

	public static int lengthOfLongestSubstring(String s) {
		int count= 0;
		for(int t= 0; t < s.length()-1; t++) {
			//char ch = s.charAt(t);
			if(s.charAt(t) != s.charAt(t+1)) {
				count++;
			}
			
			//	}else {
//				count = 0;
//			}

		}
		System.out.println(count);
		return count;
	}
}
