package practice.leetcode.array;

/*
 * You are given an array A of N integers and an integer K. you want to remove K consecutive elements form A in such way that the amplitude of the remaining elements will be minimal the Amplitude is the difference between the maximal and minimal elements 
 * That, given an array of N integer and an integer K returns an integer denoting the minimal amplitude that can be obtained after the removal of K consecutive elements from A
 * [1]. Given A = {5,3,6,1,3} and k=2the function should return 2 you can remove the third and fourth elements top obtained the following array [5,3,3]. Its maximum is 5 and Minimal is 3 so that amplitude is 2 
 * [2]. Given A = {8,8,3,3} and k=2the function should return 0 you can remove the third and fourth elements top obtained the following array [8,8]. Its maximum is 8 and Minimal is 8 so that amplitude is 0
 * [3]. Given A = {3,5,1,3,9,8} and k=4the function should return 1 you can remove the first second and third and fourth elements top obtained the following array [9,8]. Its maximum is 9 and Minimal is 8 so that amplitude is 1
 * 
 */
public class Amplitude {

	public static void main(String[] args) {
		int nums[] = { 5,3,6,1,3 };
		Amplitude amplitude = new Amplitude();
		int num = amplitude.solution(nums, 8);
		System.out.print("Amplitude of of given array = { ");
		for (int i: nums) {
			System.out.print(i+" ");
		}
		System.out.print("} is "+num);
	}

	public int solution(int[] arr, int k) {
        if ((arr.length - k) >= 2) {
            int count = 0;
            int[] arr_count = new int[(arr.length + 1) - k];
            while (count < arr_count.length) {
                int temp = count;
                int max = 0, min = Integer.MAX_VALUE;
                for (int i = 0; i < arr.length; i++) {
                    if (i == temp && i < k) {
                        temp++;
                        continue;
                    }
                    if (min > arr[i]) {
                        min = arr[i];
                    }
                    if (max < arr[i]) {
                        max = arr[i];
                    }
                }
                arr_count[count] = max - min;
                count++;
                k++;
            }
            int amplitude = arr_count[0];
            for (int i = 1; i < arr_count.length; i++) {
                if (amplitude > arr_count[i]) {
                    amplitude = arr_count[i];
                }
            }
            return amplitude;
        }else{
        	System.out.println();
			return 0;
 		}	
	}
}
