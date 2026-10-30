// LeetCode Problem: Rotate Array
// Link: https://leetcode.com/problems/rotate-array/
// Difficulty: Medium
// Language: java

class Solution {
    public void rotate(int[] nums, int k) {
        if(nums.length == 0)
            return;
        k = k % nums.length;
        
        reverse(nums, 0 , nums.length - 1);
        reverse(nums, 0 , k - 1);
        reverse(nums, k, nums.length - 1);

    }
    public static void reverse(int nums[] , int left, int right)
    {
        while(left < right)
        {
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;
            left++;
            right--;
        }
    }
}