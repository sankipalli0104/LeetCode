package practice.leetcode.string;

import java.util.HashSet;
import java.util.Set;

/*
 * Given a string s, find the length of the longest substring without repeating characters.
 * Example 1:
 * Input: s = "abcabcbb"
 * Output: 3
 * Explanation: The answer is "abc", with the length of 3.
 * */
public class LongestSubstringWithoutRepeatingCharacters {

	public static void main(String[] args) {
		System.out.println(lengthOfLongestSubstring("dvdf"));
	}

	public static int lengthOfLongestSubstring(String s) {
		int ans = 0;
		for (int i = 0; i < s.length(); i++) {
			for (int j = i + 1; j <= s.length(); j++) {
				if (allUnique(s, i, j)) {
					ans = Math.max(ans, j - i);
				}
			}
		}
		return ans;
	}

	public static boolean allUnique(String s, int start, int end) {
		Set<Character> set = new HashSet<>();
		for (int i = start; i < end; i++) {
			Character ch = s.charAt(i);
			if (set.contains(ch))
				return false;
			set.add(ch);
		}
		return true;
	}

	public static int lengthOfLongestSubstringMethod2(String s) {
		int n = s.length();
		Set<Character> set = new HashSet<>();
		int ans = 0, i = 0, j = 0;
		while (i < n && j < n) {
			if (!set.contains(s.charAt(j))) {
				set.add(s.charAt(j++));
				ans = Math.max(ans, j - i);
			} else {
				set.remove(s.charAt(i++));
			}
		}
		return ans;

	}
}
