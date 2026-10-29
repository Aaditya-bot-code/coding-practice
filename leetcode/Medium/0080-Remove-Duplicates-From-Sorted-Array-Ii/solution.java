// LeetCode Problem: Remove Duplicates from Sorted Array II
// Link: https://leetcode.com/problems/remove-duplicates-from-sorted-array-ii/
// Difficulty: Medium
// Language: java

class Solution {
    public int removeDuplicates(int[] nums) {
       int i = 2;
       if(nums.length <= 2)
       {
        return nums.length;
       }
       for(int j = 2 ;j < nums.length ; j++)
       {
        if(nums[j] != nums[i - 2])
        {
            nums[i] = nums[j];
            i++;
        }
       }
       return i; 
    }
}