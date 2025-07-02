/* DSA/Arrays/Subarrays 04/
 * LeetCode 121: Best Time to Buy and Sell Stock
 * Problem link: https://leetcode.com/problems/best-time-to-buy-and-sell-stock/
 * Given prices[] where prices[i] is the stock price on day i,
 * find the maximum profit from a single buy and sell.
 * Return 0 if no profit is possible.
 *
 * Approach:
 * Track the minimum price seen so far.
 * At each day, calculate profit = prices[i] - minPrice
 * Update maxProfit and sell day if a higher profit is found.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */

public class BuySellStocks {
    public static int maxProfit(int prices[]) {
        int maxProfit = 0, minPrice = prices[0];
    
        for(int i = 1; i < prices.length; i++) {
            if(minPrice > prices[i]) {
                minPrice = prices[i];
            } else {
                maxProfit = Math.max(maxProfit, prices[i]- minPrice);
            }
             
        }
       
        return maxProfit;
    }
    public static void main(String[] args) {
        int prices[] = {7,1,5,3,6,4};
        System.out.println("Max profit: "+maxProfit(prices));
    }
}
