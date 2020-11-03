package practice.leetcode.array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StringtoInteger {

	public static void main(String[] args) throws IOException {
		StringtoInteger stringtoInteger = new StringtoInteger();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Please enter a String: ");
		String str = br.readLine();
		int intvalue = stringtoInteger.myAtoi(str);
		System.out.println(intvalue);
	}

	@SuppressWarnings("finally")
	public int myAtoi(String str) {
		String stringTrim = str.trim();
		System.out.println(stringTrim.contains("[0-9]%"));
		if(stringTrim.contains("[0-9]{5}+%")) {
			int sq = Integer.parseInt(stringTrim);
			return sq;
		} else {
			return 0;
		}
		//boolean numeric = true;
		
		
		
		
		
		
		
//		try {
//			int sw = Integer.parseInt(stringTrim);
//			return sw;
//		} catch (NumberFormatException e) {
//			System.out.println(e);
//			return 0;
//			
//		} 
//		finally {
//			if (numeric) {
//				return sq;
//			} else {
//				return 0;
//
//			}
//		}
	}
}
