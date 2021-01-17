package practice.leetcode.collections;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class RemoveDuplicatesfromSortedList {

	public static void main(String[] args) {
		List<Integer> listInteger = new LinkedList<>();
		listInteger.add(1);
		listInteger.add(2);
		listInteger.add(3);
		listInteger.add(3);
		listInteger.add(4);
		listInteger.add(4);
		listInteger.add(5);
		List<Integer> result = RemoveDuplicatesfromSortedList.deleteDuplicates(4, listInteger);
		System.out.println(result);
	}

	public static List<Integer> deleteDuplicates(Integer head, List<Integer> listInteger) {
		if (head != null && listInteger != null && listInteger.contains(head)) {
			// Iterator<Integer> it = listInteger.iterator();

			for (Integer in : listInteger) {
				if (in.equals(head)) {
					listInteger.remove(head);
				}
			}

//			while (it.hasNext()) {
//				Integer i = it.next();
//				if( head.equals(i)) {
//					listInteger.remove(head);
//				}
//			}
		}
		return listInteger;
	}

}
