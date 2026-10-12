// LeetCode Problem: Running Sum of 1d Array
// Link: https://leetcode.com/problems/running-sum-of-1d-array/
// Difficulty: Easy
// Language: java

class Solution {
    public int[] runningSum(int[] nums) {
       int sum = 0;
       int output[] = new int[nums.length];
       for(int i=0; i<nums.length ; i++)
       {
            sum += nums[i];
            output[i] =sum;

       } 
       return output;
    }
}