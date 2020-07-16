package practice.leetcode.string;
/*
 * Given a string, find the first non-repeating character in it and return its index. 
 * If it doesn't exist, return -1.
 * Examples: s = "leetcode" return 0.
 * s = "loveleetcode" return 2. 
 * You may assume the string contains only lowercase English letters.
 */
public class FirstUniqueCharacter {

	public static void main(String[] args) {
		int i = FirstUniqueCharacter.firstUniqChar("loveleetcode");
		System.out.println("Index of frist unique char " + i);
	}

	public static int firstUniqChar(String s) {
		for (int i = 0; i < s.length(); i++) {
			int j = 0, count = 0;
			while (j < s.length()) {
				if (i == j) {
					j++;
					continue;
				}
				if (s.charAt(i) == s.charAt(j)) {
					count++;
					break;
				}
				j++;
			}
			if (count == 0) {
				return i;
			}
		}
		return -1;
	}
}
