// LeetCode Problem: Concatenation of Array
// Link: https://leetcode.com/problems/concatenation-of-array/
// Difficulty: Easy
// Language: java

class Solution {
    public int[] getConcatenation(int[] nums) {
        int [] ans = new int[2* nums.length];
        for( int i=0 ;i<nums.length; i++)
        {
            ans[i]=nums[i];
            ans[i+ nums.length]=nums[i];
        }
        return ans;
    }
}