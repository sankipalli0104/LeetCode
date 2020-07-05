package practice.leetcode.array;
/*
 * Given a list of daily temperatures T, return a list such that, for each day in the input, tells you how many days you would have to wait until a warmer temperature. 
 * If there is no future day for which this is possible, put 0 instead.
 * For example, given the list of temperatures T = [73, 74, 75, 71, 69, 72, 76, 73], your output should be [1, 1, 4, 2, 1, 1, 0, 0].
 * Note: The length of temperatures will be in the range [1, 30000]. Each temperature will be an integer in the range [30, 100].
 */
public class DailyTemperatures {

	public static void main(String[] args) {
		DailyTemperatures dailyTemperatures = new DailyTemperatures();
		int T[] = { 55, 38, 53, 81, 61, 93, 97, 32, 43, 78 }; 
		int i[] = dailyTemperatures.dailyTemperatures(T);
		System.out.print("{ ");
		for (int k : i) {
			System.out.print(k + " ");

		}
		System.out.print("}");
		
	}

	public int[] dailyTemperatures(int[] input) {
		int output[] = new int[input.length];
		int i = 0;
		for (; i < input.length - 1; i++) {
			int temp = input[i];
			int days = 0;
			int j = i + 1;
			boolean isfind = false;
			while (j < input.length) {
				days++;
				if (input[j] > temp) {
					isfind = true;
					break;
				}
				j++;
			}
			if (!isfind) {
				days = 0;
			}
			output[i] = days;
		}
		output[i] = 0;
		return output;
	}
}
