package practice.leetcode.string;

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
