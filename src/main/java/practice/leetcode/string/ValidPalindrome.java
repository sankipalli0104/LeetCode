package practice.leetcode.string;

public class ValidPalindrome {
	public boolean isPalindrome(String s) {
		System.out.println(s);
		String resultStr = "";
		for (int i = 0; i < s.length(); i++) {
			if ((s.charAt(i) > 47 && s.charAt(i) <= 57) || (s.charAt(i) > 64 && s.charAt(i) <= 90)
					|| (s.charAt(i) > 96 && s.charAt(i) <= 122)) {
				resultStr += s.charAt(i);
			}
		}
		String reverseOfString = "";
		for (int i = resultStr.length() - 1; i >= 0; i--) {
			reverseOfString += resultStr.charAt(i);
		}
		System.out.println(reverseOfString);
		boolean ispal = false;
		if (resultStr.equalsIgnoreCase(reverseOfString)) {
			ispal = true;
		}
		return ispal;
	}
	public static void main(String[] args) {
		ValidPalindrome palindrome = new ValidPalindrome();
		boolean pal = palindrome.isPalindrome("`l;`` 1o1 ??;l`");
		System.out.println(pal);
	}
}
