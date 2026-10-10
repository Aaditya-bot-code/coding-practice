// LeetCode Problem: Move Zeroes
// Link: https://leetcode.com/problems/move-zeroes/
// Difficulty: Easy
// Language: java

class Solution {
    public void moveZeroes(int[] nums) {
       int left =0;
       int right =0;
       while(right <nums.length)
       {
        if(nums[right]==0)
        {
            right++;
        }
        else{
            int temp = nums[right];
            nums[right]=nums[left];
            nums[left]=temp;
            right++;
            left++;
        }
       } 
       System.out.println(nums);
    }
}