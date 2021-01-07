package practice.leetcode.collections;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

/* You are given two non-empty linked lists representing two non-negative integers. 
 * The digits are stored in reverse order, and each of their nodes contains a single digit. 
 * Add the two numbers and return the sum as a linked list.
 * You may assume the two numbers do not contain any leading zero, except the number 0 itself.
 * Input: l1 = [2,4,3], l2 = [5,6,4]
 * Output: [7,0,8]
 * Explanation: 342 + 465 = 807.
 */
public class AddTwoNumbers {

	public static void main(String[] args) {
		List<Integer> listOne = new LinkedList<Integer>();
		listOne.add(4);
		listOne.add(0);
		listOne.add(3);
//		listOne.add(9);
//		listOne.add(9);
//		listOne.add(9);
//		listOne.add(9);
//		listOne.add(9);
//		listOne.add(9);
//		listOne.add(9);
		List<Integer> listTwo = new LinkedList<Integer>();
		listTwo.add(8);
		listTwo.add(0);
		listTwo.add(4);
//		listTwo.add(9);
//		listTwo.add(9);
//		listTwo.add(9);
//		listTwo.add(9);
		addTwoNumbers(listOne, listTwo);

	}

	public static List<Integer>  addTwoNumbers(List<Integer> l1, List<Integer> l2) {
		
		ListIterator<Integer> lI = l1.listIterator();
		String str = "";
		while(lI.hasNext()) {
			str += String.valueOf(lI.next());
		}
		ListIterator<Integer> lT = l2.listIterator();
		String str2 = "";
		while(lT.hasNext()) {
			str2 += String.valueOf(lT.next());
		}
		
		System.out.println(str);
		System.out.println(str2);
		//System.out.println(l1);
		//System.out.println(l2);
		Integer num = Integer.parseInt(str)+ Integer.parseInt(str2);
		System.out.println(num);
		String result = String.valueOf(num);
		
		
		List<Integer> resultList = new LinkedList<Integer>();
		for(int i =result.length()-1 ; i >= 0 ; i-- ) {
			resultList.add(Integer.parseInt(String.valueOf(result.charAt(i))));
		}
		System.out.println(resultList);
		 
		 return resultList;
	        
	   }
}
