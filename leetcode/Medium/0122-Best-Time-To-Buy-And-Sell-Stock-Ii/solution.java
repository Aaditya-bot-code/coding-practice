// LeetCode Problem: Best Time to Buy and Sell Stock II
// Link: https://leetcode.com/problems/best-time-to-buy-and-sell-stock-ii/
// Difficulty: Medium
// Language: java

class Solution {
    public int maxProfit(int[] prices) {
        int profit = 0;
        for(int i = 1 ; i < prices.length ; i++)
        {
            if(prices[i] > prices[i - 1])
            {
                profit += prices[i] - prices[i - 1];
            }
        }
        return profit;
    }
}