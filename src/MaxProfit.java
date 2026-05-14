// Best Time to Buy and Sell Stock (LeetCode #121)
// Given an array prices where prices[i] is the price of a stock on day i, return the maximum profit you can achieve. You may only buy and sell once. If you cannot make any profit, return 0.
// Example 1:
// Input: prices = [7,1,5,3,6,4]
// Output: 5
// Explanation: Buy on day 2 (price=1), sell on day 5 (price=6)
// Max profit = 6-1 = 5

// Example 2:
// Input: prices = [7,6,4,3,1]
// Output: 0
// Explanation: Prices keep dropping, no profit possible

// Example 3:
// Input: prices = [2,4,1,7]
// Output: 6
// Explanation: Buy on day 1 (price=2), sell on day 4 (price=7)
// Constraints:

// You must sell after you buy, not before
// Try to solve it in O(n) time and O(1) space

class Solution {
    public int maxProfit(int[] prices) {
        int min = prices[0];
        int maxProfit = 0;
        for(int i =1; i<prices.length; i++) {
            if(prices[i] - min > maxProfit) {
                maxProfit = prices[i] - min;
            }
            if(prices[i] < min) {
                min = prices[i];
            }
        }
        return maxProfit;
    }
}
