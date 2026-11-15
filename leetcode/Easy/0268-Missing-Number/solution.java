// LeetCode Problem: Missing Number
// Link: https://leetcode.com/problems/missing-number/
// Difficulty: Easy
// Language: java

class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int expectedSum = n * (n + 1) /2;
        int presentSum = 0;
        for(int num : nums){
            presentSum += num;
        }
        return expectedSum - presentSum;
    }
}