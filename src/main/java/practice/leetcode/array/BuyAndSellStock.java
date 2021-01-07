package practice.leetcode.array;

public class BuyAndSellStock {

	public static void main(String[] args) {
		int[] prices = {7,1,5,3,6,4};
		buySellStock(prices);
;		
	}
	
	public static void buySellStock(int[] prices) {
		
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		for(int i=0; i < prices.length; i++) {
			if(min > prices[i]) {
				min = prices[i];
			}
			if(max < prices[i]) {
				max = prices[i];
			}
		}
		System.out.println("MAX = "+max + " MIN = "+min);
	}

}
