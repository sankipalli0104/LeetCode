/*
 * Given a fixed length array arr of integers, duplicate each occurrence of zero, shifting the remaining elements to the right.
 * Note that elements beyond the length of the original array are not written.
 * Do the above modifications to the input array in place, do not return anything from your function.
 * Example 1: Input: [1,0,2,3,0,4,5,0] Output: null
 * Explanation: After calling your function, the input array is modified to: [1,0,0,2,3,0,0,4]
 * Example 2: Input: [1,2,3] Output: null
 * Explanation: After calling your function, the input array is modified to: [1,2,3]
 */

package practice.leetcode.array;

public class DuplicateZeros {

	public static void main(String[] args) {
		// int[] arr = { 1, 0, 2, 3, 0, 4, 5, 0 };
		//int arr[] = { 0, 2, 0,0, 3,0, 4, 5 }; //{0,0,2,0,0,0,0,3}
		int arr[] = { 0, 2, 0,0, 3,0,4};
		// DuplicateZeros.duplicateZeros(arr);
		DuplicateZeros.newMethod(arr);
	}

	/*
	 * This method is for adding the addition zero next to the zero in an arr
	 */
	public static void duplicateZeros(int[] arr) {
		if (arr.length > 0) {
			System.out.println("Original array Length " + arr.length);
			int count = 0;
			for (int i = 0; i < arr.length; i++) {
				if (arr[i] == 0) {
					count++;
				}
			}
			// System.out.println("Count "+count);
			if (count > 0) {
				int new_arr[] = new int[arr.length + count];
				System.out.println("New array Length " + new_arr.length);
				int i = 0, j = 0;
				while (i < new_arr.length) {
					if (arr[j] == 0) {
						new_arr[i + 1] = 0;
						i += 2;
						j++;
					} else {
						new_arr[i++] = arr[j++];
					}

				}
				for (int k : new_arr) {
					System.out.println(k + " ");
				}
			}
		}
	}

	/*
	 * 
	 */

	public static void newMethod(int[] arr) {
		int i = 0, count =0;
		while (i < arr.length) {
			if (arr[i] == 0) {
				int j = arr.length-2;
//				while(j > ) {
//					arr[j+1] = arr[j];
//					j--;
//				}
				arr[i + 1] = 0;
				i += 2;
				//count++;
			}
			i++;
			//count++;
		}
		for (int k : arr) {
			System.out.print(k + " ");
		}
	}
}
