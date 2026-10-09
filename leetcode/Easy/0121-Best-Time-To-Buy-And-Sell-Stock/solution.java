// LeetCode Problem: Best Time to Buy and Sell Stock
// Link: https://leetcode.com/problems/best-time-to-buy-and-sell-stock/
// Difficulty: Easy
// Language: java

class Solution {
    public int maxProfit(int[] prices) {
        int left = 0;
        int maxProfit = 0;
        for( int right = 1; right < prices.length ; right ++)
        {
            if( prices[ right] < prices[left])
            {
                left = right ;
            }
            else{
               int  profit = prices[ right]- prices[left];
                if( maxProfit < profit)
                {
                    maxProfit = profit ;
                }
            }
            
        }
        return  maxProfit;
        
        
    }
}