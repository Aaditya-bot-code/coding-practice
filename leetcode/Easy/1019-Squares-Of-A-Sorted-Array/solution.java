// LeetCode Problem: Squares of a Sorted Array
// Link: https://leetcode.com/problems/squares-of-a-sorted-array/
// Difficulty: Easy
// Language: java

class Solution {
    public int[] sortedSquares(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        int []ans = new int[nums.length];
        int index = nums.length - 1;
        while(left <= right){
            if((nums[left] * nums[left]) > (nums[right] * nums[right])){
                ans[index] = nums[left] * nums[left];
                left++;
            }
            else{
                ans[index] = nums[right] * nums[right];
                right--; 
            }
            index--;
        }
        return ans;
    }
}